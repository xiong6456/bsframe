package com.zero.util.shiro;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

import com.zero.pojo.SysUser;

/**
 * @Description 
 * @author Hevin*Xiong
 * @time 2018-2-3 下午2:15:12
 * @version 1.0.0
 */
public class PasswordHelper {
    private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
    private String algorithmName = "md5";
    private final int hashIterations = 2;

    public void encryptPassword(SysUser user) {
        // User对象包含最基本的字段Username和Password
        user.setFdSalt(randomNumberGenerator.nextBytes().toHex());
        // 将用户的注册密码经过散列算法替换成一个不可逆的新密码保存进数据，散列过程使用了盐
        String newPassword = new SimpleHash(algorithmName, user.getFdPassword(),
                ByteSource.Util.bytes(user.getFdSalt()), hashIterations).toHex();
        user.setFdPassword(newPassword);
    }
    
    /**
     * @Description 检验输入的旧密码是否错误 
     * @param dataPsw
     * @param newPsw
     * @return 
     * @author Hevin*Xiong
     * @time 2018-3-10 下午3:33:08
     */
    public boolean checkPassword(String salt, String dataPsw, String oldPsw) {
        boolean rtnFalg = false;
    	oldPsw = new SimpleHash(algorithmName, oldPsw,
                ByteSource.Util.bytes(salt), hashIterations).toHex();
        if(dataPsw.equals(oldPsw)) {
        	rtnFalg = true;
        }else{
        	rtnFalg = false;
        }
        return rtnFalg;
    }
    
    /**
     * @Description 检验输入的旧密码是否错误 
     * @param newPsw
     * @return 将新密码加密加盐返回
     * @author Hevin*Xiong
     * @time 2018-3-10 下午3:33:08
     */
    public String encryptPassword(String salt, String newPsw) {
        newPsw = new SimpleHash(algorithmName, newPsw,
                ByteSource.Util.bytes(salt), hashIterations).toHex();
        return newPsw;
    }
}

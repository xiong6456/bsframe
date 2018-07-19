package com.zero.util.shiro;

import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.zero.pojo.SysUser;
import com.zero.service.shiro.SysUserService;

/**
 * @Description
 * @author Hevin*Xiong
 * @time 2018-2-2 下午11:35:29
 * @version 1.0.0
 */

public class CustomRealm extends AuthorizingRealm {
	private static final Logger logger = LoggerFactory
			.getLogger(CustomRealm.class);
	@Autowired
	private SysUserService sysUserService;

	/**
	 * 用户授权认证
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principalCollection) {
		try {
			logger.info("======用户授权认证======");
			String userName = principalCollection.getPrimaryPrincipal().toString();
			SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
			simpleAuthorizationInfo.setRoles(sysUserService
					.queryRolesByName(userName));

			// 根据用户名查询当前用户拥有的角色
			Set<String> roles = sysUserService.queryRolesByName(userName);
			// 将角色名称提供给info
			simpleAuthorizationInfo.setRoles(roles);
			// 根据用户名查询当前用户权限
			 Set<String> permissions = sysUserService.findPermissions(userName);
			// 将权限名称提供给info
			 simpleAuthorizationInfo.setStringPermissions(permissions);
			return simpleAuthorizationInfo;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 用户登陆认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authenticationToken)
			throws AuthenticationException {
		logger.info("======用户登陆认证======");
		String userName = authenticationToken.getPrincipal().toString();
		
		SysUser user = sysUserService.queryUserByName(userName);
		
		if(user == null) {
			// 用户名不存在抛出异常
			throw new UnknownAccountException();
		}
		
		if ("1".equals(user.getFdLocked())) {
			// 用户被管理员锁定抛出异常
			throw new LockedAccountException();
		}
		String tFdSalt = user.getFdSalt();
		
		AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
				user.getFdLoginName(), user.getFdPassword(),
				ByteSource.Util.bytes(tFdSalt), this.getName());
		return authenticationInfo;
	}

}

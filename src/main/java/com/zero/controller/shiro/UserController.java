package com.zero.controller.shiro;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zero.pojo.SysUser;
import com.zero.service.shiro.SysUserService;

/**
 * @Description 
 * @author Hevin*Xiong
 * @time 2018-2-3 上午9:03:29
 * @version 1.0.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private SysUserService userService;
    
    @ResponseBody
    @RequestMapping("/addUser")
    public String addUser(SysUser user){
    	JSONObject jsonObject = new JSONObject();
        try {
        	jsonObject = userService.insert(user);
        } catch (Exception e) {
        	logger.info("插入失败，原因是："+e.getMessage());
        }
        return jsonObject.toString();
    }
    
    @ResponseBody
    @RequestMapping("/select")
    public String select(){
    	JSONObject jsonObject = new JSONObject();
        try {
        	jsonObject = userService.select();
        } catch (Exception e) {
        	logger.info("查询失败，原因是："+e.getMessage());
        }
        return jsonObject.toString();
    }
    
    @ResponseBody
    @RequestMapping("/selectBox")
    public String selectBox(SysUser pSysUser){
    	String json="";
        try {
        	json = userService.selectBox(pSysUser);
        } catch (Exception e) {
        	logger.info("查询失败，原因是："+e.getMessage());
        }
        return json;
    }
    
    @ResponseBody
    @RequestMapping("/selectById")
    public String selectById(String fdId){
    	JSONObject jsonObject = new JSONObject();
        try {
        	jsonObject = userService.selectById(fdId);
        } catch (Exception e) {
        	logger.info("查询失败，原因是："+e.getMessage());
        }
        return jsonObject.toString();
    }
    
    @ResponseBody
    @RequestMapping("/selectByRoleId")
    public String selectByRoleId(String fdRoleId){
    	String rtnStr = "";
        try {
        	rtnStr = userService.selectByRoleId(fdRoleId);
        } catch (Exception e) {
        	logger.info("查询失败，原因是："+e.getMessage());
        }
        return rtnStr;
    }

    @ResponseBody
    @RequestMapping("/unSelectByRoleId")
    public String unSelectByRoleId(String fdRoleId){
    	String rtnStr = "";
        try {
        	rtnStr = userService.unSelectByRoleId(fdRoleId);
        } catch (Exception e) {
        	logger.info("查询失败，原因是："+e.getMessage());
        }
        return rtnStr;
    }
    
    @ResponseBody
    @RequestMapping("/unSelectByRoleIdandName")
    public String unSelectByRoleIdandName(String fdRoleId,String fdName){
    	String rtnStr = "";
        try {
        	rtnStr = userService.unSelectByRoleIdandName(fdRoleId,fdName);
        } catch (Exception e) {
        	logger.info("查询失败，原因是："+e.getMessage());
        }
        return rtnStr;
    }
    
    @ResponseBody
    @RequestMapping("/delete")
    public String delete(HttpServletRequest request){
    	JSONObject jsonObject = new JSONObject();
        try {
        	String ids = request.getParameter("ids");
        	jsonObject = userService.delete(ids);
        } catch (Exception e) {
        	logger.info("删除失败，原因是："+e.getMessage());
        }
        return jsonObject.toString();
    }
    
    @ResponseBody
    @RequestMapping("/update")
    public String update(SysUser user){
    	JSONObject jsonObject = new JSONObject();
        try {
        	jsonObject = userService.update(user);
        } catch (Exception e) {
        	logger.info("删除失败，原因是："+e.getMessage());
        }
        return jsonObject.toString();
    }
    
    @ResponseBody
    @RequestMapping("/pswUpdate")
    public String pswUpdate(HttpServletRequest request){
    	String result = "";
        try {
        	String fdLoginName = request.getParameter("fdLoginName");
        	String oldPsw = request.getParameter("oldPsw");
        	String newPsw = request.getParameter("newPsw");
        	result = userService.pswUpdate(fdLoginName,oldPsw,newPsw);
        } catch (Exception e) {
        	logger.info("修改失败，原因是："+e.getMessage());
        }
        return result;
    }
    
    @ResponseBody
    @RequestMapping("/pswReset")
    public String pswReset(HttpServletRequest request){
    	String result = "";
        try {
        	String fdLoginName = request.getParameter("fdLoginName");
        	result = userService.pswReset(fdLoginName);
        } catch (Exception e) {
        	logger.info("重置失败，原因是："+e.getMessage());
        }
        return result;
    }
    
    @ResponseBody
    @RequestMapping("/pswOpenLock")
    public String pswOpenLock(HttpServletRequest request){
    	String result = "";
        try {
        	String fdLoginName = request.getParameter("fdLoginName");
        	String fdLocked = request.getParameter("fdLocked");
        	result = userService.pswOpenLock(fdLoginName,fdLocked);
        } catch (Exception e) {
        	logger.info("解锁失败，原因是："+e.getMessage());
        }
        return result;
    }
}

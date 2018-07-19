package com.zero.controller.shiro;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zero.pojo.SysOrgDept;
import com.zero.service.shiro.SysOrgDeptService;

/**
 * @Description 
 * @author Hevin*Xiong
 * @time 2018-2-3 上午9:03:29
 * @version 1.0.0
 */
@Controller
@RequestMapping("/dept")
public class OrgDeptController {
	private static final Logger logger = LoggerFactory.getLogger(OrgDeptController.class);
    @Autowired
    private SysOrgDeptService deptService;
    
    @ResponseBody
    @RequestMapping("/add")
    public String add(SysOrgDept dept){
    	JSONObject jsonObject = new JSONObject();
        try {
        	jsonObject = deptService.insert(dept);
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
        	jsonObject = deptService.select();
        } catch (Exception e) {
        	logger.info("查询失败，原因是："+e.getMessage());
        }
        return jsonObject.toString();
    }
    
    @ResponseBody
    @RequestMapping("/selectById")
    public String selectById(String fdId){
    	JSONObject jsonObject = new JSONObject();
        try {
        	jsonObject = deptService.selectById(fdId);
        } catch (Exception e) {
        	logger.info("查询失败，原因是："+e.getMessage());
        }
        return jsonObject.toString();
    }
    
    @ResponseBody
    @RequestMapping("/selectParent")
    public void selectParent(HttpServletRequest request,HttpServletResponse response){
        try {
        	String strDeptParent = deptService.selectParent();
        	response.getWriter().write(strDeptParent);
        } catch (Exception e) {
        	logger.info("查询失败，原因是："+e.getMessage());
        }
    }
    
    @ResponseBody
    @RequestMapping("/delete")
    public String delete(HttpServletRequest request){
    	JSONObject jsonObject = new JSONObject();
        try {
        	String id = request.getParameter("id");
        	jsonObject = deptService.delete(id);
        } catch (Exception e) {
        	logger.info("删除失败，原因是："+e.getMessage());
        }
        return jsonObject.toString();
    }
    
    @ResponseBody
    @RequestMapping("/update")
    public String update(SysOrgDept dept){
    	JSONObject jsonObject = new JSONObject();
        try {
        	jsonObject = deptService.update(dept);
        } catch (Exception e) {
        	logger.info("修改失败，原因是："+e.getMessage());
        }
        return jsonObject.toString();
    }
}

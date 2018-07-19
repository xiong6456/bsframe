package com.zero.controller.shiro;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zero.pojo.SysRole;
import com.zero.service.shiro.SysRoleService;

/**
 * @Description
 * @author Hevin*Xiong
 * @time 2018-2-28 下午7:30:24
 * @version 1.0.0
 */
@Controller
@RequestMapping("/role")
public class RoleController {
	private static final Logger logger = LoggerFactory
			.getLogger(RoleController.class);

	@Autowired
	private SysRoleService roleService;

	@ResponseBody
	@RequestMapping("/insert")
	public String insert(SysRole pSysRole) {
		String result = "";
		try {
			result = roleService.insert(pSysRole);
		} catch (Exception e) {
			logger.info("添加失败，原因是：" + e.getMessage());
		}
		return result;
	}

	@ResponseBody
	@RequestMapping("/delete")
	public String delete(String ids) {
		String result = "";
		try {
			result = roleService.delete(ids);
		} catch (Exception e) {
			logger.info("删除失败，原因是：" + e.getMessage());
		}
		return result;
	}

	@ResponseBody
	@RequestMapping("/update")
	public String update(SysRole pSysRole) {
		String result = "";
		try {
			result = roleService.update(pSysRole);
		} catch (Exception e) {
			logger.info("修改失败，原因是：" + e.getMessage());
		}
		return result;
	}

	@ResponseBody
	@RequestMapping("/selectById")
	public String selectByCodeId(String fdId) {
		String result = "";
		try {
			result = roleService.selectById(fdId);
		} catch (Exception e) {
			logger.info("查询失败，原因是：" + e.getMessage());
		}
		return result;
	}

	@ResponseBody
	@RequestMapping("/select")
	public void select(HttpServletResponse response) {
		try {
			String strCode = roleService.select();
			response.getWriter().write(strCode);
		} catch (Exception e) {
			logger.info("查询失败，原因是：" + e.getMessage());
		}
	}
	
	@ResponseBody
    @RequestMapping("/selectBox")
    public String selectBox(SysRole pSysRole){
    	String result="";
        try {
        	result = roleService.selectBox(pSysRole);
        } catch (Exception e) {
        	logger.info("查询失败，原因是："+e.getMessage());
        }
        return result;
    }
}

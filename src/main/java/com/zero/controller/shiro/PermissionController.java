package com.zero.controller.shiro;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zero.pojo.SysPermission;
import com.zero.service.shiro.SysPermissionService;

/**
 * @Description
 * @author Hevin*Xiong
 * @time 2018-2-28 下午7:30:24
 * @version 1.0.0
 */
@Controller
@RequestMapping("/permission")
public class PermissionController {
	private static final Logger logger = LoggerFactory
			.getLogger(PermissionController.class);

	@Autowired
	private SysPermissionService permissionService;

	@ResponseBody
	@RequestMapping("/insert")
	public String insert(SysPermission pSysPermission) {
		String result = "";
		try {
			result = permissionService.insert(pSysPermission);
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
			result = permissionService.delete(ids);
		} catch (Exception e) {
			logger.info("删除失败，原因是：" + e.getMessage());
		}
		return result;
	}

	@ResponseBody
	@RequestMapping("/update")
	public String update(SysPermission pSysPermission) {
		String result = "";
		try {
			result = permissionService.update(pSysPermission);
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
			result = permissionService.selectById(fdId);
		} catch (Exception e) {
			logger.info("查询失败，原因是：" + e.getMessage());
		}
		return result;
	}

	@ResponseBody
	@RequestMapping("/selectByRoleId")
	public String selectByRoleId(String fdRoleId) {
		String rtnStr = "";
		try {
			rtnStr = permissionService.selectByRoleId(fdRoleId);
		} catch (Exception e) {
			logger.info("查询失败，原因是：" + e.getMessage());
		}
		return rtnStr;
	}

	@ResponseBody
	@RequestMapping("/unSelectByRoleId")
	public String unSelectByRoleId(String fdRoleId) {
		String rtnStr = "";
		try {
			rtnStr = permissionService.unSelectByRoleId(fdRoleId);
		} catch (Exception e) {
			logger.info("查询失败，原因是：" + e.getMessage());
		}
		return rtnStr;
	}

	@ResponseBody
	@RequestMapping("/unSelectByRoleIdandName")
	public String unSelectByRoleIdandName(String fdRoleId, String fdName) {
		String rtnStr = "";
		try {
			rtnStr = permissionService.unSelectByRoleIdandName(fdRoleId, fdName);
		} catch (Exception e) {
			logger.info("查询失败，原因是：" + e.getMessage());
		}
		return rtnStr;
	}

	@ResponseBody
	@RequestMapping("/select")
	public void select(HttpServletResponse response) {
		try {
			String strCode = permissionService.select();
			response.getWriter().write(strCode);
		} catch (Exception e) {
			logger.info("查询失败，原因是：" + e.getMessage());
		}
	}

	@ResponseBody
	@RequestMapping("/selectBox")
	public String selectBox(SysPermission pSysPermission) {
		String result = "";
		try {
			result = permissionService.selectBox(pSysPermission);
		} catch (Exception e) {
			logger.info("查询失败，原因是：" + e.getMessage());
		}
		return result;
	}
}

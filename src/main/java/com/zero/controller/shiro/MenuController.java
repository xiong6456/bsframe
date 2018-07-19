package com.zero.controller.shiro;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zero.pojo.SysMenu;
import com.zero.pojo.SysUser;
import com.zero.service.shiro.SysMenuService;

/**
 * @Description
 * @author Hevin*Xiong
 * @time 2018-2-3 上午9:03:29
 * @version 1.0.0
 */
@Controller
@RequestMapping("/menu")
public class MenuController {
	private static final Logger logger = LoggerFactory
			.getLogger(MenuController.class);
	@Autowired
	private SysMenuService menuService;

	@ResponseBody
	@RequestMapping("/insert")
	public String insert(SysMenu menu, HttpServletRequest request) {
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject = menuService.insert(menu);
		} catch (Exception e) {
			e.printStackTrace();
			logger.debug("插入失败，原因是：" + e.getMessage());
		}
		return jsonObject.toString();
	}

	@ResponseBody
	@RequestMapping("/update")
	public String update(SysMenu menu, HttpServletRequest request) {
		JSONObject jsonObject = new JSONObject();
		try {
			menu.setFdDueTime(menu.getFdDueTime().substring(0,10));
			boolean tFlag = menuService.update(menu);
			if (tFlag == true) {
				jsonObject.put("tFlag", "修改成功！");
			}
		} catch (Exception e) {
			jsonObject.put("tFlag", e.getMessage());
		}
		return jsonObject.toString();
	}

	@ResponseBody
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) {
		JSONObject jsonObject = new JSONObject();
		try {
			String fdId = request.getParameter("fdId");
			boolean tFlag = menuService.delete(fdId);
			if (tFlag == true) {
				jsonObject.put("tFlag", "删除成功！");
			}
		} catch (Exception e) {
			jsonObject.put("tFlag", e.getMessage());
		}
		return jsonObject.toString();
	}

	@ResponseBody
	@RequestMapping("move")
	public String move(HttpServletRequest request) {
		JSONObject jsonObject = new JSONObject();
		try {
			String[] moves = request.getParameterValues("moves");
			boolean tFlag = menuService.move(moves);
			if (tFlag == true) {
				jsonObject.put("tFlag", "移动成功！");
			}
		} catch (Exception e) {
			jsonObject.put("tFlag", e.getMessage());
		}
		return jsonObject.toString();
	}

	@RequestMapping("/select")
	public String select(SysMenu menu, Model model, HttpServletRequest request,
			HttpServletResponse response) {
		try {
			SysUser tSysUser = (SysUser) request.getSession().getAttribute("userInfo");
			String userName = tSysUser.getFdLoginName();
			menuService.queryMenusByName(userName);
			return "login";
		} catch (Exception e) {
			request.setAttribute("sessionExpired", "请重新登录！");
			return "sys/config/login";
		}
	}

	@RequestMapping("/selectList")
	public String selectList(HttpServletRequest request, ModelMap model) {
		try {
			JSONObject jsonObject = new JSONObject();
			String fdId = request.getParameter("node");
			jsonObject = menuService.queryList(fdId);
			model.addAttribute("retObj", jsonObject);
			return "/sys/menu/MenuTreeUpdate";
		} catch (Exception e) {
			logger.debug("查询失败，原因是：" + e.getMessage());
		}
		return null;
	}

	@ResponseBody
	@RequestMapping("/selectTree")
	public String selectTree(HttpServletRequest request,HttpServletResponse response) {
		try {
			SysUser tSysUser = (SysUser) request.getSession().getAttribute("userInfo");
			String userName = tSysUser.getFdLoginName();
			String json = menuService.queryMenusByName(userName);
			response.getWriter().write(json);
		} catch (Exception e) {
			request.setAttribute("sessionExpired", "请重新登录！");
			return "/login";
		}
		return null;
	}
	
	@ResponseBody
	@RequestMapping("/selectShowTree")
	public String selectShowTree(HttpServletRequest request) {
		JSONObject jsonObject = new JSONObject();
		try {
			SysUser tSysUser = (SysUser) request.getSession().getAttribute("userInfo");
			String userName = tSysUser.getFdLoginName();
			String json = menuService.queryMenusByName(userName);
			jsonObject.put("result", json);
		} catch (Exception e) {
			request.setAttribute("sessionExpired", "请重新登录！");
			return "/login";
		}
		return jsonObject.toString();
	}
}

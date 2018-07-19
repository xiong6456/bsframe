package com.zero.controller.sys;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zero.pojo.sys.SysCode;
import com.zero.service.sys.SysCodeService;
import com.zero.sys.IDGenerator;

/**
 * @Description
 * @author Hevin*Xiong
 * @time 2018-2-28 下午7:30:24
 * @version 1.0.0
 */
@Controller
@RequestMapping("/sysCode")
public class SysCodeController {
	private static final Logger logger = LoggerFactory
			.getLogger(SysCodeController.class);

	@Autowired
	private SysCodeService sysCodeService;

	@ResponseBody
	@RequestMapping("/insert")
	public String insert(SysCode pSysCode) {
		String result = "";
		try {
			pSysCode.setCodeId(IDGenerator.generateID());
			result = sysCodeService.insert(pSysCode);
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
			result = sysCodeService.delete(ids);
		} catch (Exception e) {
			logger.info("删除失败，原因是：" + e.getMessage());
		}
		return result;
	}

	@ResponseBody
	@RequestMapping("/update")
	public String update(SysCode pSysCode) {
		String result = "";
		try {
			result = sysCodeService.update(pSysCode);
		} catch (Exception e) {
			logger.info("修改失败，原因是：" + e.getMessage());
		}
		return result;
	}

	@ResponseBody
	@RequestMapping("/select")
	public void select(String codeType, HttpServletResponse response) {
		try {
			String strCode = sysCodeService.select(codeType);
			response.getWriter().write(strCode);
		} catch (Exception e) {
			logger.info("查询失败，原因是：" + e.getMessage());
		}
	}

	@ResponseBody
	@RequestMapping("/selectByCodeId")
	public String selectByCodeId(String codeId) {
		String result = "";
		try {
			result = sysCodeService.selectByCodeId(codeId);
		} catch (Exception e) {
			logger.info("查询失败，原因是：" + e.getMessage());
		}
		return result;
	}

	@ResponseBody
	@RequestMapping("/selectAll")
	public void selectAll(HttpServletResponse response) {
		try {
			String strCode = sysCodeService.select();
			response.getWriter().write(strCode);
		} catch (Exception e) {
			logger.info("查询失败，原因是：" + e.getMessage());
		}
	}
	
	@ResponseBody
    @RequestMapping("/selectBox")
    public String selectBox(SysCode pSysCode){
    	String result="";
        try {
        	result = sysCodeService.selectBox(pSysCode);
        } catch (Exception e) {
        	logger.info("查询失败，原因是："+e.getMessage());
        }
        return result;
    }
}

package com.zero.controller.shiro;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zero.service.shiro.SysUserRoleService;

/**
 * @Description 
 * @author Hevin*Xiong
 * @time 2018-2-3 上午9:03:29
 * @version 1.0.0
 */
@Controller
@RequestMapping("/userRole")
public class UserRoleController {
	private static final Logger logger = LoggerFactory.getLogger(UserRoleController.class);
    @Autowired
    private SysUserRoleService userRoleService;
    
    @ResponseBody
    @RequestMapping("/update")
    public String update(@RequestBody JSONObject s){
    	String result = "";
        try {
        	String fdRoleId = s.getString("fdMultiId");
        	String fdSelObjIdsTemp = s.getString("fdSelObjIds");
        	String[] fdUserIds = fdSelObjIdsTemp.split(";");
        	result = userRoleService.update(fdRoleId,fdUserIds);
        } catch (Exception e) {
        	logger.info("删除失败，原因是："+e.getMessage());
        }
        return result;
    }
}

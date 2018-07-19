package com.zero.controller.shiro;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zero.pojo.SysUser;
import com.zero.service.shiro.SysUserService;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Hevin*Xiong
 * @version 1.0.0
 * @Description
 * @time 2018-2-3 上午9:03:29
 */
@Controller
@RequestMapping("/shiro")
public class LoginController {
    private static final Logger logger = LoggerFactory
            .getLogger(LoginController.class);
    @Autowired
    private SysUserService userService;

    @ResponseBody
    @RequestMapping("/login")
    public String login(SysUser user, Model model, HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
        String fdLoginName = request.getParameter("fdLoginName");
        String fdPassword = request.getParameter("fdPassword");
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
                fdLoginName, fdPassword);
        try {
            subject.login(usernamePasswordToken);
            logger.info("======登陆成功=======");
            SysUser userInfo = userService.queryUserByName(user
                    .getFdLoginName());
            subject.getSession().setAttribute("userInfo", userInfo);
            // 查询菜单

            jsonObject.put("loginRes", "success");
            //return "/index";
        } catch (UnknownAccountException u) {
            jsonObject.put("loginRes", "用户名不存在！");
            //subject.getSession().setAttribute("loginRes", "用户名不存在！");
        } catch (IncorrectCredentialsException i) {
            jsonObject.put("loginRes", "密码错误！");
            //subject.getSession().setAttribute("loginRes", "密码错误！");
        } catch (LockedAccountException u) {
            jsonObject.put("loginRes", "帐户已锁，请联系管理员！");
            //subject.getSession().setAttribute("loginRes", "帐户已锁，请联系管理员！");
        } catch (Exception e) {
            jsonObject.put("loginRes", "登录异常！");
            logger.error("======登陆异常=======" + e.getMessage());
            //subject.getSession().setAttribute("loginRes", "登录异常！");
        }
        return jsonObject.toString();
        //	return "redirect:/login.jsp";
    }

    @RequestMapping("/exit")
    public String login(HttpServletRequest request) {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/login.jsp";
    }
}

package com.zero.sys;

import com.zero.mapper.shiro.SysMenuMapper;
import com.zero.mapper.shiro.SysRoleMapper;
import com.zero.mapper.shiro.SysUserMapper;
import com.zero.mapper.shiro.SysUserRoleMapper;
import com.zero.pojo.SysMenu;
import com.zero.pojo.SysRole;
import com.zero.pojo.SysUser;
import com.zero.pojo.SysUserRole;
import com.zero.util.PropertiesUtil;
import com.zero.util.shiro.PasswordHelper;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @Description
 * @author Hevin*Xiong
 * @time 2018-2-11 上午11:20:39
 * @version 1.0.0
 */
public class InitConfiguration implements
		ApplicationListener<ContextRefreshedEvent> {
	private static final Logger logger = LoggerFactory
			.getLogger(InitConfiguration.class);
	@Autowired
	private SysUserMapper sysUserMapper;
	@Autowired
	private SysMenuMapper sysMenuMapper;
	@Autowired
	private SysRoleMapper sysRoleMapper;
	@Autowired
	private SysUserRoleMapper sysUserRoleMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.context.ApplicationListener#onApplicationEvent(org
	 * .springframework.context.ApplicationEvent)
	 */
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// root application context 没有parent，他就是老大.
		String flag = PropertiesUtil.getProperty("properties/jdbc.properties", "jdbc.method");
		if (event.getApplicationContext().getParent() == null && "create".equals(flag)) {
			PropertiesUtil.setProperty("properties/jdbc.properties", "jdbc.method","update");
			// 需要执行的逻辑代码，当spring容器初始化完成后就会执行该方法。
			dealTables();
			/** 初始化用户admin */
			try {
				int adminExistIf = sysUserMapper.queryUniqueByUserName("admin");
				if(adminExistIf == 0) {
					inserAdmin();
				}
				logger.info("初始化用户admin结束~~~~~~~~~~~~~~~~~~~");
			} catch (Exception e) {
				logger.info("初始化用户admin异常！！！！！！！！！！！！！");
				e.printStackTrace();
			}
			
			/** 初始化用户sys */
			try {
				int sysExistIf = sysUserMapper.queryUniqueByUserName("sys");
				if(sysExistIf == 0) {
					inserSys();
				}
				logger.info("初始化用户sys结束~~~~~~~~~~~~~~~~~~~");
			} catch (Exception e) {
				logger.info("初始化用户sys异常！！！！！！！！！！！！！");
				e.printStackTrace();
			}
			
			/** 初始化菜单根节点 */
			try {
				int menuExistIf = sysMenuMapper.queryUniqueByParentId("0");
				if(menuExistIf == 0) {
					inserMenu();
				}
				logger.info("初始化菜单根节点结束~~~~~~~~~~~~~~~~~~~");
			} catch (Exception e) {
				logger.info("初始化菜单根节点异常！！！！！！！！！！！！！");
				e.printStackTrace();
			}
			
			/** 初始化角色管理员,超级管理员,用户管理查看角色，部门管理查看角色 */
			try {
				SysRole roleSysExistIf = sysRoleMapper.selectByPrimaryKey("000000000000000000000zerorolesys");
				if(roleSysExistIf == null) {
					inserRoleSys();
				}
				SysRole roleAdminExistIf = sysRoleMapper.selectByPrimaryKey("0000000000000000000zeroroleadmin");
				if(roleAdminExistIf == null) {
					inserRoleAdmin();
				}
				SysRole roleDeptViewExistIf = sysRoleMapper.selectByPrimaryKey("0000000000000000zeroroledeptview");
				if(roleDeptViewExistIf == null) {
					inserRoleDeptView();
				}
				SysRole roleUserViewExistIf = sysRoleMapper.selectByPrimaryKey("0000000000000000zeroroleuserview");
				if(roleUserViewExistIf == null) {
					inserRoleUserView();
				}
				logger.info("初始化角色管理员和超级管理员,用户管理查看角色，部门管理查看角色结束~~~~~~~~~~~~~~~~~~~");
			} catch (Exception e) {
				logger.info("初始化角色管理员和超级管理员,用户管理查看角色，部门管理查看角色异常！！！！！！！！！！！！！");
				e.printStackTrace();
			}
			
			/** 初始化角色和用户关联信息 */
			try {
				SysUserRole userRoleSysExistIf = sysUserRoleMapper.selectByPrimaryKey("00000000000000000zerouserrolesys");
				if(userRoleSysExistIf == null) {
					inserUserRoleSys();
				}
				SysUserRole userRoleAdminExistIf = sysUserRoleMapper.selectByPrimaryKey("000000000000000zerouserroleadmin");
				if(userRoleAdminExistIf == null) {
					inserUserRoleAdmin();
				}
				logger.info("初始化角色和用户关联信息结束~~~~~~~~~~~~~~~~~~~");
			} catch (Exception e) {
				logger.info("初始化角色和用户关联信息异常！！！！！！！！！！！！！");
				e.printStackTrace();
			}
		}
	}

	/**
	 * 处理初始化表
	 */
	public void dealTables(){
		try {
			Configuration configuration = new PropertiesConfiguration(InitConfiguration.class.getClassLoader().getResource("")
					+ "properties/jdbc.properties");
			String url = configuration.getString("jdbc.url");
			String driver = configuration.getString("jdbc.driver");
			String username = configuration.getString("jdbc.username");
			String password = configuration.getString("jdbc.password");

			Class.forName(driver).newInstance();
			Connection conn =DriverManager.getConnection(url, username, password);
			ScriptRunner runner = new ScriptRunner(conn);
			Resources.setCharset(Charset.forName("utf-8")); //设置字符集,不然中文乱码插入错误
			runner.setLogWriter(null);//设置是否输出日志
			runner.runScript(Resources.getResourceAsReader("sql/initCreate.sql"));
			runner.closeConnection();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * @Description 插入系统管理员
	 * @author Hevin*Xiong
	 * @time 2018-2-11 下午12:51:18
	 */
	public void inserAdmin() {
		SysUser tSysUser = new SysUser();
		tSysUser.setFdId("0000000000000000000zerouseradmin");
		tSysUser.setFdName("管理员");
		tSysUser.setFdIsAvailable("0");
		tSysUser.setFdLoginName("admin");
		tSysUser.setFdPassword("admin");
		PasswordHelper tPasswordHelper = new PasswordHelper();
		tPasswordHelper.encryptPassword(tSysUser);
		tSysUser.setFdLocked("0");
		sysUserMapper.insert(tSysUser);
	}

	/**
	 * @Description 插入超级管理员
	 * @author Hevin*Xiong
	 * @time 2018-2-11 下午12:51:18
	 */
	public void inserSys() {
		SysUser tSysUser = new SysUser();
		tSysUser.setFdId("000000000000000000000zerousersys");
		tSysUser.setFdName("超级管理员");
		tSysUser.setFdIsAvailable("0");
		tSysUser.setFdLoginName("sys");
		tSysUser.setFdPassword("sys");
		PasswordHelper tPasswordHelper = new PasswordHelper();
		tPasswordHelper.encryptPassword(tSysUser);
		tSysUser.setFdLocked("0");
		sysUserMapper.insert(tSysUser);
	}

	/**
	 * @Description 初始化根菜单
	 * @author Hevin*Xiong
	 * @time 2018-2-11 下午12:51:18
	 */
	public void inserMenu() {
		SysMenu tSysMenu = new SysMenu();
		tSysMenu.setFdId("0000000000000000zerousermenuroot");
		tSysMenu.setFdName("根目录");
		tSysMenu.setFdParentId("0");
		tSysMenu.setFdDescription("所有菜单根目录");
		tSysMenu.setFdChildCount(Long.valueOf("0"));
		tSysMenu.setFdOrder(0);
		tSysMenu.setFdTerm("1");
		tSysMenu.setFdIframe("1");
		tSysMenu.setFdState("1");
		tSysMenu.setFdDueTime("9000-12-31");
		sysMenuMapper.insert(tSysMenu);
	}

	/**
	 * @Description 初始化角色表-超管
	 * @author Hevin*Xiong
	 * @time 2018-2-11 下午12:51:18
	 */
	public void inserRoleSys() {
		SysRole tSysRoleSys = new SysRole();
		tSysRoleSys.setFdId("000000000000000000000zerorolesys");
		tSysRoleSys.setFdCode("ROLE_SYS");
		tSysRoleSys.setFdName("超级管理员角色");
		tSysRoleSys.setFdDescription("拥有超级管理员角色可进行开发");
		sysRoleMapper.insert(tSysRoleSys);
	}
	
	/**
	 * @Description 初始化角色表-普管
	 * @author Hevin*Xiong
	 * @time 2018-2-11 下午12:51:18
	 */
	public void inserRoleAdmin() {
		SysRole tSysRoleAdmin = new SysRole();
		tSysRoleAdmin.setFdId("0000000000000000000zeroroleadmin");
		tSysRoleAdmin.setFdCode("ROLE_ADMIN");
		tSysRoleAdmin.setFdName("管理员角色");
		tSysRoleAdmin.setFdDescription("拥有管理员角色可对系统进行管理");
		sysRoleMapper.insert(tSysRoleAdmin);
	}
	
	/**
	 * @Description 初始化用户角色表-超管
	 * @author Hevin*Xiong
	 * @time 2018-2-11 下午12:51:18
	 */
	public void inserUserRoleSys() {
		SysUserRole tSysUserRoleSys = new SysUserRole();
		tSysUserRoleSys.setFdId("00000000000000000zerouserrolesys");
		tSysUserRoleSys.setFdUserId("000000000000000000000zerousersys");
		tSysUserRoleSys.setFdRoleId("000000000000000000000zerorolesys");
		sysUserRoleMapper.insert(tSysUserRoleSys);
	}
	

	/**
	 * @Description 初始化角色表-部门查看权限
	 * @author Hevin*Xiong
	 * @time 2018-2-11 下午12:51:18
	 */
	public void inserRoleDeptView() {
		SysRole tSysRoleAdmin = new SysRole();
		tSysRoleAdmin.setFdId("0000000000000000zeroroledeptview");
		tSysRoleAdmin.setFdCode("ROLE_DEPT_VIEW");
		tSysRoleAdmin.setFdName("部门管理查看角色");
		tSysRoleAdmin.setFdDescription("拥有部门管理查看权限可查看部门管理");
		sysRoleMapper.insert(tSysRoleAdmin);
	}
	
	/**
	 * @Description 初始化角色表-用户管理查看权限
	 * @author Hevin*Xiong
	 * @time 2018-2-11 下午12:51:18
	 */
	public void inserRoleUserView() {
		SysRole tSysRoleAdmin = new SysRole();
		tSysRoleAdmin.setFdId("0000000000000000zeroroleuserview");
		tSysRoleAdmin.setFdCode("ROLE_USER_VIEW");
		tSysRoleAdmin.setFdName("用户管理查看角色");
		tSysRoleAdmin.setFdDescription("拥有用户管理查看权限可查看用户管理");
		sysRoleMapper.insert(tSysRoleAdmin);
	}
	
	/**
	 * @Description 初始化用户角色表-普管
	 * @author Hevin*Xiong
	 * @time 2018-2-11 下午12:51:18
	 */
	public void inserUserRoleAdmin() {
		SysUserRole tSysUserRoleAdmin = new SysUserRole();
		tSysUserRoleAdmin.setFdId("000000000000000zerouserroleadmin");
		tSysUserRoleAdmin.setFdUserId("0000000000000000000zerouseradmin");
		tSysUserRoleAdmin.setFdRoleId("0000000000000000000zeroroleadmin");
		sysUserRoleMapper.insert(tSysUserRoleAdmin);
	}
}

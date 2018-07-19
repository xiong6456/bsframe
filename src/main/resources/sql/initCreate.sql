drop table if exists sys_menu; 
CREATE TABLE `sys_menu` (
  `fd_id` varchar(36) NOT NULL,
  `fd_name` varchar(128) NOT NULL,
  `fd_description` varchar(100) DEFAULT NULL COMMENT '描述',
  `fd_parent_id` varchar(36)  NULL,
  `fd_child_count` bigint(3)  DEFAULT NULL COMMENT '子菜单个数',
  `fd_is_child` varchar(2)  DEFAULT NULL COMMENT '是否是子节点',
  `fd_run_script` varchar(40)  DEFAULT NULL COMMENT '菜单路径',
  `fd_order`				int(3) DEFAULT '0' COMMENT '排序号',
  `fd_term` varchar(5) DEFAULT NULL COMMENT '菜单所属期数',
  `fd_due_time` varchar(10) DEFAULT NULL COMMENT '菜单有效期',
  `fd_iframe` varchar(2)  DEFAULT NULL COMMENT '是否为页面显示',
  `fd_state` varchar(2)  DEFAULT NULL COMMENT '是否可用',
  `fd_cls` varchar(100)  DEFAULT NULL COMMENT '菜单样式',
  PRIMARY KEY (`fd_id`)
);
alter table sys_menu comment '菜单表';

drop table if exists sys_role;
CREATE TABLE `sys_role` (
  fd_id varchar(36) NOT NULL,
  fd_code varchar(15) NOT NULL COMMENT '角色编码',
  fd_name varchar(128) NOT NULL COMMENT '角色名称',
  fd_description varchar(200) COMMENT '描述',
  fd_available varchar(2) COMMENT '是否可用,1：可用，0不可用',
  fd_order				int(3) DEFAULT '0' COMMENT '排序号',
  PRIMARY KEY (fd_id)
);
alter table sys_role comment '角色表';

drop table if exists sys_user;

/*==============================================================*/
/* Table: sys_org_person                                        */
/*==============================================================*/
create table sys_user
(
   fd_id                varchar(36) not null,
   fd_name              varchar(20),
   fd_phone             varchar(40),
   fd_is_available      varchar(4),
   fd_login_name        varchar(50),
   fd_password          varchar(50),
   fd_salt 				varchar(64) COMMENT '盐',
   fd_locked 			varchar(1)  COMMENT '账号是否锁定，1：锁定，0未锁定',
   fd_dept_id           varchar(36),
   fd_parent_id         varchar(36),
   fd_type              varchar(36),
   fd_bak_1             varchar(100),
   fd_bak_2             varchar(100),
   primary key (fd_id)
);

alter table sys_user comment '系统用户表';

drop table if exists sys_user_role;
/*Table structure for table `sys_user_role` */

CREATE TABLE `sys_user_role` (
  `fd_id` varchar(36) NOT NULL,
  `fd_user_id` varchar(36) NOT NULL,
  `fd_role_id` varchar(36) NOT NULL,
  PRIMARY KEY (`fd_id`)
);

alter table sys_user_role comment '用户角色表';

drop table if exists sys_permission;
CREATE TABLE `sys_permission` (
  `fd_id` varchar(36) NOT NULL COMMENT '主键',
  `fd_name` varchar(128) NOT NULL COMMENT '资源名称',
  `fd_description` varchar(200) COMMENT '描述',
  `fd_type` varchar(36) NOT NULL COMMENT '资源类型：menu,button,',
  `fd_url` varchar(128) COMMENT '访问url地址',
  `fd_percode` varchar(128) COMMENT '权限代码字符串',
  `fd_parent_id` varchar(36) COMMENT '父结点id',
  `fd_parent_ids` varchar(128) COMMENT '父结点id列表串',
  `fd_order`			int(3) DEFAULT '0' COMMENT '排序号',
  `fd_available` varchar(1) COMMENT '是否可用,1：可用，0不可用',
  PRIMARY KEY (`fd_id`)
);

alter table sys_permission comment '权限表';

drop table if exists sys_role_permission;
CREATE TABLE `sys_role_permission` (
  `fd_id` varchar(36) NOT NULL,
  `fd_role_id` varchar(36) NOT NULL COMMENT '角色id',
  `fd_permission_id` varchar(36) NOT NULL COMMENT '权限id',
  PRIMARY KEY (`fd_id`)
);
alter table sys_role_permission comment '角色权限表';

drop table if exists sys_config;

/*==============================================================*/
/* Table: sys_config                                            */
/*==============================================================*/
create table sys_config
(
   fd_id                varchar(36) not null,
   fd_type         varchar(100),
   fd_value        varchar(100),
   fd_bak_1             varchar(100),
   fd_bak_2             varchar(100),
   primary key (fd_id)
);

alter table sys_config comment '参数配置';



drop table if exists sys_org_dept;

/*==============================================================*/
/* Table: sys_org_dept                                          */
/*==============================================================*/
create table sys_org_dept
(
   fd_id                varchar(36) not null,
   fd_name              varchar(20),
   fd_type              varchar(36),
   fd_parent_id         varchar(36),
   fd_major_id          varchar(36),
   fd_minor_id          varchar(36),
   fd_child_count 		varchar(3) DEFAULT '0' COMMENT '子节点个数',
   fd_order				int(3) DEFAULT '0' COMMENT '排序号',
   fd_bak_1             varchar(100),
   fd_bak_2             varchar(100),
   primary key (fd_id)
);

alter table sys_org_dept comment '组织架构表';


drop table if exists sys_code;

/*==============================================================*/
/* Table: ldcode                                                */
/*==============================================================*/
create table sys_code
(
   code_id              varchar(36) not null,
   code_type              varchar(10) not null,
   code_name              varchar(20),
   code_description       varchar(100),
   primary key (code_id)
);
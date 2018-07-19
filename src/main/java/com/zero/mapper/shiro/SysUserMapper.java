package com.zero.mapper.shiro;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.zero.pojo.SysUser;
import com.zero.pojo.SysUserExample;

public interface SysUserMapper {
	int countByExample(SysUserExample example);

	int deleteByExample(SysUserExample example);

	int deleteByPrimaryKey(String fdId);

	int insert(SysUser record);

	int insertSelective(SysUser record);

	List<SysUser> selectByExample(SysUserExample example);
	
	List<SysUser> selectByUser(SysUser user);

	List<SysUser> selectAll();

	SysUser selectByPrimaryKey(String fdId);

	int updateByExampleSelective(@Param("record") SysUser record,
                                 @Param("example") SysUserExample example);

	int updateByExample(@Param("record") SysUser record,
                        @Param("example") SysUserExample example);

	int updateByPrimaryKeySelective(SysUser record);

	int updateByPrimaryKey(SysUser record);

	SysUser queryUserByName(String userName);
	
	SysUser queryUserByUserName(String userName);

	Set<String> queryRolesByName(String userName);

	Set<String> findPermissions(String userName);

	int lockByUserName(String userName);

	int queryUniqueByUserName(String userName);

	int deleteByIds(Map<String, Object> ids);

	List<Map<String, String>> selectByRoleId(String fdRoleId);

	List<Map<String, String>> unSelectByRoleId(String fdRoleId);

	List<Map<String, String>> unSelectByRoleIdandName(
            @Param("fdRoleId") String fdRoleId, @Param("fdName") String fdName);
}
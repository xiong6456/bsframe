package com.zero.mapper.shiro;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zero.pojo.SysPermission;
import com.zero.pojo.SysPermissionExample;

public interface SysPermissionMapper {
    int countByExample(SysPermissionExample example);

    int deleteByExample(SysPermissionExample example);

    int deleteByPrimaryKey(String fdId);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    List<SysPermission> selectByExample(SysPermissionExample example);

    SysPermission selectByPrimaryKey(String fdId);

    int updateByExampleSelective(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    int updateByExample(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);
    
    int deleteByIds(Map<String, Object> ids);
    
    List<Map<String, String>> selectByRoleId(String fdRoleId);

	List<Map<String, String>> unSelectByRoleId(String fdRoleId);

	List<Map<String, String>> unSelectByRoleIdandName(
            @Param("fdRoleId") String fdRoleId, @Param("fdName") String fdName);
}
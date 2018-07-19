package com.zero.mapper.shiro;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zero.pojo.SysRolePermission;
import com.zero.pojo.SysRolePermissionExample;

public interface SysRolePermissionMapper {
    int countByExample(SysRolePermissionExample example);

    int deleteByExample(SysRolePermissionExample example);

    int deleteByPrimaryKey(String fdId);

    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    List<SysRolePermission> selectByExample(SysRolePermissionExample example);

    SysRolePermission selectByPrimaryKey(String fdId);

    int updateByExampleSelective(@Param("record") SysRolePermission record, @Param("example") SysRolePermissionExample example);

    int updateByExample(@Param("record") SysRolePermission record, @Param("example") SysRolePermissionExample example);

    int updateByPrimaryKeySelective(SysRolePermission record);

    int updateByPrimaryKey(SysRolePermission record);
    
    int insertInfoBatch(List<SysRolePermission> record);
    
    int deleteByIds(Map<String, Object> ids);
}
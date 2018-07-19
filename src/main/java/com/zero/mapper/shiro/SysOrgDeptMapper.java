package com.zero.mapper.shiro;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zero.pojo.SysOrgDept;
import com.zero.pojo.SysOrgDeptExample;

public interface SysOrgDeptMapper {
	int countByExample(SysOrgDeptExample example);

	int deleteByExample(SysOrgDeptExample example);

	int deleteByPrimaryKey(String fdId);

	int insert(SysOrgDept record);

	int insertSelective(SysOrgDept record);

	List<SysOrgDept> selectByExample(SysOrgDeptExample example);

	SysOrgDept selectByPrimaryKey(String fdId);

	int updateByExampleSelective(@Param("record") SysOrgDept record,
                                 @Param("example") SysOrgDeptExample example);

	int updateByExample(@Param("record") SysOrgDept record,
                        @Param("example") SysOrgDeptExample example);

	int updateByPrimaryKeySelective(SysOrgDept record);

	int updateByPrimaryKey(SysOrgDept record);

	int queryUniqueByOrgDeptName(String fdName);

	int deleteByIds(Map<String, Object> ids);
	
	int queryFdOrder(String fdParentId);
	
	int queryMaxFdOrder();
	
	int updateFdOrder(Integer fdOrder);
	
	int updateChildCount(String fdParentId);
	
	int deleteInfoBatch(Map<String, Object> ids);

	int updateChildCountSub(@Param("fdId") String fdId);

	List<SysOrgDept> queryChilList(String fdId);
	
	int queryCountChildren(String fdId);
	
	List<SysOrgDept> selectAll(String fdId);
	
	List<SysOrgDept> selectList();
}
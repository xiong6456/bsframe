package com.zero.mapper.shiro;

import com.zero.pojo.SysMenu;
import com.zero.pojo.SysMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenuMapper {
	int countByExample(SysMenuExample example);

	int deleteByExample(SysMenuExample example);

	int deleteByPrimaryKey(String fdId);

	int insert(SysMenu record);

	int insertSelective(SysMenu record);

	List<SysMenu> selectByExample(SysMenuExample example);

	SysMenu selectByPrimaryKey(String fdId);

	int updateByExampleSelective(@Param("record") SysMenu record,
                                 @Param("example") SysMenuExample example);

	int updateByExample(@Param("record") SysMenu record,
                        @Param("example") SysMenuExample example);

	int updateByPrimaryKeySelective(SysMenu record);

	int updateByPrimaryKey(SysMenu record);

	List<SysMenu> queryMenus(@Param("userName") String userName,
                             @Param("fdDueTime") String dueTime);

	List<SysMenu> queryList(String fdId);

	int queryNodeOrder(String fdId);

	int updateNodeOrderIsChild(@Param("fdNodeOrder") Integer fdNodeOrder);

	int updateNodeOrder(@Param("fdNodeOrder") Integer fdNodeOrder);

	String queryChildCountIsChild(String fdId);

	String queryChildCount(String fdParentId);

	int updateChildCountIsChild(@Param("fdId") String fdId,
                                @Param("afterChildCount") String afterChildCount);

	int updateChildCount(@Param("fdParentId") String fdParentId,
                         @Param("afterChildCount") String afterChildCount);

	int queryUniqueByParentId(String fdParentId);

	int deleteInfoBatch(List fdIds);

	int updateChildCountSub(@Param("fdId") String fdId);

	List<SysMenu> queryChilList(String fdId);

	List<SysMenu> queryOneLevelList();

	int updateParentIdById(@Param("fdId") String fdId,
                           @Param("fdParentId") String fdParentId);

	int updateChildAndOrder(@Param("fdId") String fdId,
                            @Param("fdOrder") Integer fdOrder,
                            @Param("fdChildCount") String fdChildCount);
}
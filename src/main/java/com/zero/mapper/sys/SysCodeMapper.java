package com.zero.mapper.sys;

import com.zero.pojo.sys.SysCode;
import com.zero.pojo.sys.SysCodeExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SysCodeMapper {
    int countByExample(SysCodeExample example);

    int deleteByExample(SysCodeExample example);

    int deleteByPrimaryKey(String codeId);

    int insert(SysCode record);

    int insertSelective(SysCode record);

    List<SysCode> selectByExample(SysCodeExample example);

    SysCode selectByPrimaryKey(String codeId);

    int updateByExampleSelective(@Param("record") SysCode record, @Param("example") SysCodeExample example);

    int updateByExample(@Param("record") SysCode record, @Param("example") SysCodeExample example);

    int updateByPrimaryKeySelective(SysCode record);

    int updateByPrimaryKey(SysCode record);
    
    int deleteByIds(Map<String, Object> ids);
    
    List<SysCode> selectByTypeAndName(@Param("type") String type, @Param("name") String name);
}
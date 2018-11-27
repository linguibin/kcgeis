package com.kcgeis.mapper;

import com.kcgeis.pojo.TbRolesMenus;
import com.kcgeis.pojo.TbRolesMenusExample;
import com.kcgeis.pojo.TbRolesMenusKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbRolesMenusMapper {
    int countByExample(TbRolesMenusExample example);

    int deleteByExample(TbRolesMenusExample example);

    int deleteByPrimaryKey(TbRolesMenusKey key);

    int insert(TbRolesMenus record);

    int insertSelective(TbRolesMenusKey record);

    List<TbRolesMenusKey> selectByExample(TbRolesMenusExample example);

    int updateByExampleSelective(@Param("record") TbRolesMenusKey record, @Param("example") TbRolesMenusExample example);

    int updateByExample(@Param("record") TbRolesMenusKey record, @Param("example") TbRolesMenusExample example);
    
}
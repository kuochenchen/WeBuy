package com.webuy.admin.dao;

import com.webuy.admin.pojo.Category1;
import com.webuy.admin.pojo.Category1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Category1Mapper {
    int countByExample(Category1Example example);

    int deleteByExample(Category1Example example);

    int deleteByPrimaryKey(Long cid);

    int insert(Category1 record);

    int insertSelective(Category1 record);

    List<Category1> selectByExample(Category1Example example);

    Category1 selectByPrimaryKey(Long cid);

    int updateByExampleSelective(@Param("record") Category1 record, @Param("example") Category1Example example);

    int updateByExample(@Param("record") Category1 record, @Param("example") Category1Example example);

    int updateByPrimaryKeySelective(Category1 record);

    int updateByPrimaryKey(Category1 record);
}
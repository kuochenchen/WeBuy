package com.webuy.admin.dao;

import com.webuy.admin.pojo.Category2;
import com.webuy.admin.pojo.Category2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Category2Mapper {
    int countByExample(Category2Example example);

    int deleteByExample(Category2Example example);

    int deleteByPrimaryKey(Long cid);

    int insert(Category2 record);

    int insertSelective(Category2 record);

    List<Category2> selectByExample(Category2Example example);

    Category2 selectByPrimaryKey(Long cid);

    int updateByExampleSelective(@Param("record") Category2 record, @Param("example") Category2Example example);

    int updateByExample(@Param("record") Category2 record, @Param("example") Category2Example example);

    int updateByPrimaryKeySelective(Category2 record);

    int updateByPrimaryKey(Category2 record);
}
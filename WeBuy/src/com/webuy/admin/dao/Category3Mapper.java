package com.webuy.admin.dao;

import com.webuy.admin.pojo.Category3;
import com.webuy.admin.pojo.Category3Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Category3Mapper {
    int countByExample(Category3Example example);

    int deleteByExample(Category3Example example);

    int deleteByPrimaryKey(Long cid);

    int insert(Category3 record);

    int insertSelective(Category3 record);

    List<Category3> selectByExample(Category3Example example);

    Category3 selectByPrimaryKey(Long cid);

    int updateByExampleSelective(@Param("record") Category3 record, @Param("example") Category3Example example);

    int updateByExample(@Param("record") Category3 record, @Param("example") Category3Example example);

    int updateByPrimaryKeySelective(Category3 record);

    int updateByPrimaryKey(Category3 record);
}
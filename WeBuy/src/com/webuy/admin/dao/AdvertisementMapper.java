package com.webuy.admin.dao;

import com.webuy.admin.pojo.Advertisement;
import com.webuy.admin.pojo.AdvertisementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdvertisementMapper {
    int countByExample(AdvertisementExample example);

    int deleteByExample(AdvertisementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Advertisement record);

    int insertSelective(Advertisement record);

    List<Advertisement> selectByExample(AdvertisementExample example);

    Advertisement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Advertisement record, @Param("example") AdvertisementExample example);

    int updateByExample(@Param("record") Advertisement record, @Param("example") AdvertisementExample example);

    int updateByPrimaryKeySelective(Advertisement record);

    int updateByPrimaryKey(Advertisement record);
}
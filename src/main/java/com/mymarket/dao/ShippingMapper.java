package com.mymarket.dao;

import com.mymarket.pojo.Shipping;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShippingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shipping record);

    int insertSelective(Shipping record);

    Shipping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shipping record);

    int updateByPrimaryKey(Shipping record);

    int deleteByShippingIdUserId(@Param("userId") Integer userId, @Param("shippingId")Integer shippingId);

    int updateByShipping(Shipping shipping);

    Shipping selectByShippingIdUserId(@Param("userId")Integer userId, @Param("shippingId")Integer shippingId);

    List<Shipping> selectByUserId(Integer userId);
}
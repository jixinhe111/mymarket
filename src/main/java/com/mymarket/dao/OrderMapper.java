package com.mymarket.dao;

import com.mymarket.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    Order selectByOrderNo(Long orderNo);

    Order selectByUserIdAndOrderNo(@Param("userId") Integer userId,@Param("orderNo") Long orderNo);

    List<Order> selectByUserId(Integer userId);

    List<Order> selectAllOrder();
}
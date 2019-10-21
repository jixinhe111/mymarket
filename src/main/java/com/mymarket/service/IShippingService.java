package com.mymarket.service;

import com.github.pagehelper.PageInfo;
import com.mymarket.common.ServerResponse;
import com.mymarket.pojo.Shipping;


public interface IShippingService {

    ServerResponse add(Integer userId, Shipping shipping);
    ServerResponse<String> del(Integer userId, Integer shippingId);
    ServerResponse update(Integer userId, Shipping shipping);
    ServerResponse<Shipping> select(Integer userId, Integer shippingId);
    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);

}

package com.mymarket.service;



import com.mymarket.common.ServerResponse;
import com.mymarket.pojo.Category;

import java.util.List;

/**
 * Created by geely
 */
public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);
    ServerResponse updateCategoryName(Integer categoryId, String categoryName);
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);
    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);


}

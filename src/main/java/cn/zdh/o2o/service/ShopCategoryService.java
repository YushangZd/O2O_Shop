package cn.zdh.o2o.service;

import cn.zdh.o2o.entity.ShopCategory;

import java.util.List;

public interface ShopCategoryService {

    /**
     * 根据查询条件获取shopCategory列表
     * @param shopCategoryCondition
     * @return
     */
    List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);

}

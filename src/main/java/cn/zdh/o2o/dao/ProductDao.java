package cn.zdh.o2o.dao;

import cn.zdh.o2o.entity.Product;

public interface ProductDao {

    /**
     * 插入商品
     * @param product
     * @return
     */
    int insertProduct(Product product);

}
package cn.pengan.shopdemo.dao;

import cn.pengan.shopdemo.entity.ProductDescript;
import cn.pengan.shopdemo.entity.ProductInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductDao {
    List<ProductInfo> findProductInfoByStoreId(Long storeInfoId);

    int insertProductInfo(ProductInfo productInfo);

    int insertProductDesc(ProductDescript productDescript);
}

package cn.pengan.shopdemo.dao;

import cn.pengan.shopdemo.entity.ProductDescript;
import cn.pengan.shopdemo.entity.ProductInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class TestProductInfoDao {
    @Autowired
    private IProductDao productInfoDao;

    @Test
    void testInsertProductInfo() {
        for (int i = 20; i < 30; i++) {
            ProductInfo productInfo = new ProductInfo();
            productInfo.setImageUrl("/img/test/2.png");
            productInfo.setPrice(new BigDecimal("112.55"));
            productInfo.setProductName("旺仔雪饼"+i);
            productInfo.setRegionCode("110100");
            productInfo.setSpec("spec");
            productInfo.setStoreInfoId(487643100534013953L);
            productInfoDao.insertProductInfo(productInfo);
            System.out.println(productInfo.getProductInfoId());
        }
    }

    @Test
    void testFindProductInfoByStoreId() {
        List<ProductInfo> productInfoByStoreId = productInfoDao.findProductInfoByStoreId(487643100534013953L);
        productInfoByStoreId.forEach(System.out::println);
    }

    @Test
    void testInsertProductDesc() {
        ProductDescript productDescript = new ProductDescript();
        productDescript.setDescript("好吃又实惠");
        productDescript.setProductInfoId(487655725032538112L);
        productDescript.setStoreInfoId(487643100534013953L);
        productInfoDao.insertProductDesc(productDescript);
    }


}

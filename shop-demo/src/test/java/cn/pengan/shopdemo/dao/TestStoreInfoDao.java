package cn.pengan.shopdemo.dao;

import cn.pengan.shopdemo.entity.StoreInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestStoreInfoDao {

    @Autowired
    private IStoreInfoDao storeInfoDao;

    @Test
    void testFindAll() {
        List<StoreInfo> all = storeInfoDao.findAll();
        all.forEach(System.out::println);
    }

    @Test
    void testInsertStoreInfo(){
        StoreInfo storeInfo = new StoreInfo();
        storeInfo.setStoreName("旺旺");
        storeInfo.setRegionCode("410100");
        storeInfo.setReputation(5);
        int i = storeInfoDao.insertStoreInfo(storeInfo);
        Assertions.assertEquals(1,i);
    }

}

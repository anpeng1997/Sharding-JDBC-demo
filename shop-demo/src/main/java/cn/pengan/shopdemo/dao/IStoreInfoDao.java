package cn.pengan.shopdemo.dao;

import cn.pengan.shopdemo.entity.StoreInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStoreInfoDao {
    List<StoreInfo> findAll();

    int insertStoreInfo(StoreInfo storeInfo);
}

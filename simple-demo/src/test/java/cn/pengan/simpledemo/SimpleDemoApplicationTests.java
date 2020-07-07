package cn.pengan.simpledemo;

import cn.pengan.simpledemo.dao.IDictDao;
import cn.pengan.simpledemo.dao.IOrderDao;
import cn.pengan.simpledemo.dao.IUserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@SpringBootTest()
class SimpleDemoApplicationTests {

    @Autowired
    private IOrderDao orderDao;

    @Autowired
    private IUserDao userDao;

    @Autowired
    private IDictDao dictDao;

    @Test
    void contextLoads() {
    }

    @Test
    void testInsertOrder() {
        for (int i = 1; i <= 30; i++) {
            orderDao.insertOrder(new BigDecimal(i),7L,"未处理");
        }
    }

    @Test
    void testFindOrderByIds() {
        List<Map> byIds = orderDao.findByIds(Arrays.asList(486556136607055872L, 486556139782144000L, 486556138700013569L));
        byIds.forEach(System.out::println);
    }

    @Test
    void testFindAll() {
        List<Map> all = orderDao.findAll();
        //System.out.println(all.size());
        all.forEach(System.out::println);
    }

    @Test
    void testInsertUser(){
        int i = userDao.insertUser("tom1", '1');
        System.out.println(i);
    }

    @Test
    void testFindAllUser() {
        List<Map> allUser = userDao.findAllUser();
        allUser.forEach(System.out::println);
    }

    @Test
    void testInsertDict() {
        int i = dictDao.insetDict(5L, "1", "6666", "已处理");
        System.out.println(i);
    }
}

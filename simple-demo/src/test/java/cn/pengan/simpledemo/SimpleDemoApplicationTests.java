package cn.pengan.simpledemo;

import cn.pengan.simpledemo.dao.IOrderDao;
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

    @Test
    void contextLoads() {
    }

    @Test
    void testInsertOrder() {
        for (int i = 1; i <= 30; i++) {
            orderDao.insertOrder(new BigDecimal(i),1L,"未处理");
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
        System.out.println(all.size());
        //all.forEach(System.out::println);
    }
}

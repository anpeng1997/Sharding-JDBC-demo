package cn.pengan.simpledemo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Component
public interface IOrderDao {

    @Insert("INSERT INTO t_order(price,user_id,status) value(#{price},#{userId},#{status})")
    int insertOrder(@Param("price")BigDecimal price,@Param("userId") Long userId,@Param("status")String status);

    @Select("<script>" +
            "select * from t_order " +
            "where order_id in" +
            "<foreach item='id' collection='ids' separator=',' open='(' close=')'>" +
            "#{id}" +
            "</foreach>" +
            "</script>")
    List<Map> findByIds(@Param("ids")List<Long> ids);

    @Select("select * from t_order")
    List<Map> findAll();
}

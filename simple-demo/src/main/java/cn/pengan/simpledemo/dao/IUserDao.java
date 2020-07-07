package cn.pengan.simpledemo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IUserDao {

    @Insert("INSERT INTO t_user(fullname,user_type) value(#{fullName},#{type})")
    int insertUser(@Param("fullName") String fullName, @Param("type") char type);

    @Select("SELECT * FROM t_user as u,t_dict as d " +
            "WHERE u.user_type = d.type")
    List<Map> findAllUser();
}

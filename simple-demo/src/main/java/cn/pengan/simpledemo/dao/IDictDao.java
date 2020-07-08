package cn.pengan.simpledemo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IDictDao {

    @Insert("INSERT INTO t_dict value(#{id},#{type},#{code},#{value})")
    int insetDict(@Param("id") Long id, @Param("type") String type, @Param("code") String code, @Param("value") String value);
}

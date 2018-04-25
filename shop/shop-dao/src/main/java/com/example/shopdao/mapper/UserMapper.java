package com.example.shopdao.mapper;

import com.example.shopdao.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description:
 * @Author:zx
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Override
    @Select("select * from user ")
    List<User> selectList(Integer pageNum, Integer pageSize);
}

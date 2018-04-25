package com.example.shopdao.mapper;

import java.util.List;

/**
 * @Description:
 * @Author:zx
 */
public interface BaseMapper<T> {

    public int insert(T t);

    public List<T> selectList(Integer pageNum, Integer pageSize);

    public T selectOne(int id);

    public int delete(T t);

    public int deleteList(List<T> list);

    public int update(T t);

    public int batchInsert(List<T> list);
}

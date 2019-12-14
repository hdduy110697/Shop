package com.shopclother.dao;

import java.util.List;

public interface GenericDAO<T> {
    void close() ;
    <T> List<T> query(String sql,Object... parameter);
    void save(T type);

}

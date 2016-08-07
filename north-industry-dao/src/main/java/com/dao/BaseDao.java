package com.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hadoop on 2016/7/9.
 */

public interface BaseDao<T> {

    public Serializable save(T o);
    public boolean delete(T o);

    public boolean update(T o);

    public boolean saveOrUpdate(T o);

    public List<T> find(String hql);

    public List findSQL(String hql, Class T);

    public List findSQL(String hql);

    public List<T> find(String hql, Object[] param);

    public List<T> find(String hql, List<Object> param);
    public List<T> find(String hql, Object[] param, Integer page, Integer rows);

    public List<T> find(String hql, List<Object> param, Integer page, Integer rows) ;

    public T get(Class<T> c, Serializable id);

    public T get(String hql, Object[] param);

    public T get(String hql, List<Object> param);

    public Long count(String hql);

    public Long count(String hql, Object[] param);

    public Long count(String hql, List<Object> param);

    public Integer executeHql(String hql);
    public Integer executeHql(String hql, Object[] param);
    public Integer executeHql(String hql, List<Object> param);
}

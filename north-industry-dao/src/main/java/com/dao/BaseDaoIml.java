package com.dao;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hadoop on 2016/7/9.
 */

@Scope("prototype")
@Repository("baseDao")
public class BaseDaoIml <T> implements BaseDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    /* @Autowired
     public void setSessionFactory(SessionFactory sessionFactory) {
         this.sessionFactory = sessionFactory;
     }
 */
    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Serializable save(Object o) {
        Session session = sessionFactory.getCurrentSession();
        Serializable s = null;
        try {
            session.setFlushMode(FlushMode.AUTO);
            session.beginTransaction();
            s = session.save(o);
            session.flush();
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
   /*         session.close();*/
            return s;
        }
    }

    @Override
    public boolean delete(Object o) {
        boolean result=false;
        Session session = sessionFactory.getCurrentSession();
        try {
            session.setFlushMode(FlushMode.AUTO);
            session.beginTransaction();
            session.delete(o);
            session.flush();
            session.getTransaction().commit();
            result=true;
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            result=false;
        } finally {
/*            session.close();*/
            return result;
        }
    }

    @Override
    public boolean update(Object o) {
        boolean result=false;
        Session session = sessionFactory.getCurrentSession();
        try {
            session.setFlushMode(FlushMode.AUTO);
            session.beginTransaction();
            session.update(o);
            session.flush();
            session.getTransaction().commit();
            result=true;
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            result=false;
        } finally {
 /*           session.close();*/
            return result;
        }
    }

    @Override
    public boolean saveOrUpdate(Object o) {
        boolean result =false;
        Session session = sessionFactory.getCurrentSession();
        try {
            session.setFlushMode(FlushMode.AUTO);
            session.beginTransaction();
            session.saveOrUpdate(o);
            session.flush();
            session.getTransaction().commit();
            result=true;
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            result=false;
        } finally {
/*            session.close();*/
            return result;
        }
    }

    @Override
    public List find(String hql) {
        Session session = sessionFactory.getCurrentSession();
        List list = null;
        try {
            session.setFlushMode(FlushMode.AUTO);
            session.beginTransaction();
            list = session.createQuery(hql).list();
            session.flush();
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            list = null;
        } finally {
/*            session.close();*/
            return list;
        }
    }

    @Override
    public List findSQL(String hql, Class T) {
        Session session = sessionFactory.getCurrentSession();
        List list = null;
        try {
            session.setFlushMode(FlushMode.AUTO);
            session.beginTransaction();
            list = session.createSQLQuery(hql).addEntity(T).list();
            session.flush();
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            list = null;
        } finally {
 /*           session.close();*/
            return list;
        }
    }

    @Override
    public List findSQL(String hql) {
        Session session = sessionFactory.getCurrentSession();
        List list = null;
        try {
            session.setFlushMode(FlushMode.AUTO);
            session.beginTransaction();
            list = session.createSQLQuery(hql).list();
            session.flush();
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            list = null;
        } finally {
  /*          session.close();*/
            return list;
        }
    }

    @Override
    public List find(String hql, Object[] param) {
        Session session = sessionFactory.getCurrentSession();
        List list = null;
        try {
            session.setFlushMode(FlushMode.AUTO);
            session.beginTransaction();
            Query q = session.createQuery(hql);
            if (param != null && param.length > 0) {
                for (int i = 0; i < param.length; i++) {
                    q.setParameter(i, param[i]);
                }
            }
            list = q.list();
            session.flush();
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            list = null;
        } finally {
/*            session.close();*/
            return list;
        }
    }

    @Override
    public List find(String hql, Object[] param, Integer page, Integer rows) {
        if (page == null || page < 1) {
            page = 1;
        }
        if (rows == null || rows < 1) {
            rows = 10;
        }
        Session session = sessionFactory.getCurrentSession();
        List list = null;
        try {
            session.setFlushMode(FlushMode.AUTO);
            session.beginTransaction();
            Query q = session.createQuery(hql);
            if (param != null && param.length > 0) {
                for (int i = 0; i < param.length; i++) {
                    q.setParameter(i, param[i]);
                }
            }
            list = q.setFirstResult((page - 1) * rows).setMaxResults(rows).list();
            session.flush();
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            list = null;
        } finally {
    /*        session.close();*/
            return list;
        }
    }

    @Override
    public T get(Class c, Serializable id) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        T t = (T) session.get(c, id);
        tx.commit();
        return t;
    }

    @Override
    public T get(String hql, Object[] param) {
        List<T> l = this.find(hql, param);
        if (l != null && l.size() > 0) {
            return l.get(0);
        } else {
            return null;
        }
    }

   /* *//**
     * 登陆成功，设置tkn和有效时间
     * **//*
    public Teacher loginCheckByPhone(String phoneNumber, String passwd) {
        Session session = DBManager.getSession();
        session.clear();
        String sql = String.format("from Teacher as u where u.phone_num=\'%s\' and u.valid=1", phoneNumber);
        Query query = session.createQuery(sql);
        List list = query.list();
        if(list.size()>0) {
            Teacher teacher = (Teacher) list.get(0);
            if(passwd.equals(teacher.getPwd_md())){ //密码匹配
                try {
                    session.setFlushMode(FlushMode.AUTO);
                    session.beginTransaction();
                    teacher.setToken(MD5.GetSaltMD5Code(teacher.getPhone_num()+passwd+new Date().toString())); //登陆时，即重新计算token，保存数据库
                    Date now=new Date();
                    Date dead = new Date(now .getTime() + DBManager.EXPIRE_SECONDS); //两个小时有效期
                    teacher.setExpire(dead);
                    session.update(teacher);
                    session.flush();
                    session.getTransaction().commit();
                } catch (HibernateException e) {
                    e.printStackTrace();
                    session.getTransaction().rollback();
                    teacher=null;
                } finally{
                    session.close();
                    return teacher;
                }
            }
        }
        return null;
    }*/

    @Override
    public Long count(String hql) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        Long num = (Long) session.createQuery(hql).uniqueResult();
        tx.commit();
        return num;
    }

  //  Call4Bid c4b = baseCall4BidDao.get("from Call4Bid where xxx = %d and xxx = %s and ...",new Object[]{value，value})
    @Override
    public Long count(String hql, Object[] param){
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery(hql);
        if(param!=null&&param.length>0)
        {
            for (int i = 0; i < param.length; i++) {
                q.setParameter(i, param[i]);
            }
        }
        Long num = (Long)q.uniqueResult();
        tx.commit();
        if(num==null) return  0l;
        return num;
    }
    @Override
    public Long count(String hql, List param) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery(hql);
        if (param != null && param.size() > 0) {
            for (int i = 0; i < param.size(); i++) {
                q.setParameter(i, param.get(i));
            }
        }
        Long num = (Long)q.uniqueResult();
        tx.commit();
        return num;
    }

    @Override
    public Integer executeHql(String hql) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        Integer num = (Integer) session.createQuery(hql).executeUpdate();
        tx.commit();
        return num;
    }

    @Override
    public Integer executeHql(String hql, Object[] param) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery(hql);
        if (param != null && param.length > 0) {
            for (int i = 0; i < param.length; i++) {
                q.setParameter(i, param[i]);
            }
        }
        Integer num = (Integer) q.executeUpdate();
        tx.commit();
        return  num;
    }


    @Override
    public T get(String hql, List param){
        List<T> l = this.find(hql, param);
        if (l != null && l.size() > 0) {
            return l.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List find(String hql, List param, Integer page, Integer rows) {
        if (page == null || page < 1) {
            page = 1;
        }
        if (rows == null || rows < 1) {
            rows = 10;
        }
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = this.getCurrentSession().createQuery(hql);
        if (param != null && param.size() > 0) {
            for (int i = 0; i < param.size(); i++) {
                q.setParameter(i, param.get(i));
            }
        }
        List list =q.setFirstResult((page - 1) * rows).setMaxResults(rows).list();
        tx.commit();
        return list;
    }

    @Override
    public List find(String hql, List param) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery(hql);
        if (param != null && param.size() > 0) {
            for (int i = 0; i < param.size(); i++) {
                q.setParameter(i, param.get(i));
            }
        }
        List list =q.list();
        tx.commit();
        return list;
    }

    @Override
    public Integer executeHql(String hql, List param) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery(hql);
        if (param != null && param.size() > 0) {
            for (int i = 0; i < param.size(); i++) {
                q.setParameter(i, param.get(i));
            }
        }
        Integer num = (Integer) q.executeUpdate();
        tx.commit();
        return  num;
    }
}

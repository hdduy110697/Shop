package com.shopclother.dao.impl;

import com.shopclother.dao.GenericDAO;
import com.shopclother.entity.NhanVien;
import org.hibernate.QueryException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.List;

public class AbtrackDAO<T> implements GenericDAO<T> {
//    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
//    EntityManager entityManager = entityManagerFactory.createEntityManager();
//    public void close() {
//        entityManager.close();
//        entityManagerFactory.close();
//    }

    @Autowired
    EntityManagerFactory entityManagerFactory;
    @Autowired
    EntityManager entityManager;


    @Override
    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }

    public void setManyParameter(Query a,Object... parameters){
        try {
            for (int i=0; i<parameters.length;i++){
                Object parameter=parameters[i];
                Integer index= i+1;
                if (parameter instanceof Long){
                    a.setParameter ( index, (Long) parameter );
                }else if (parameter instanceof String){
                    a.setParameter ( index, (String) parameter );
                }else if (parameter instanceof Integer) {
                    a.setParameter ( index, (Integer) parameter );
                }else if (parameter instanceof Timestamp) {
                    a.setParameter ( index, (Timestamp) parameter );
                }
            }
        }catch (QueryException e){
            e.printStackTrace ();
        }

    }


    @Override
    public <T> List<T> query(String sql,Object... parameters) {
            Query query =entityManager.createQuery ( sql );
            setManyParameter ( query,parameters );
            return query.getResultList ();
    }
    public T query1(String sql,Object... parameters) {
        Query query =entityManager.createQuery ( sql );
        setManyParameter ( query,parameters );
        try {
            return (T) query.getSingleResult ();
        }catch (NoResultException e){
            return null;
        }

    }

    @Transactional
    public void save(T type){
        entityManager.persist ( type );
    }

}

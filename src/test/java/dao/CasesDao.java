package dao;

import models.Cases;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class CasesDao {
    public Cases findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Cases.class, id);
    }

    public void save(Cases case1) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(case1);
        tx1.commit();
        session.close();
    }

    public void update(Cases case1) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(case1);
        tx1.commit();
        session.close();
    }

    public void delete(Cases case1) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(case1);
        tx1.commit();
        session.close();
    }

    public List<Cases> findAll() {
        List<Cases> casesList = (List<Cases>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Cases").list();
        return casesList;
    }
}

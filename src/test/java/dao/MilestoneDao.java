package dao;

import models.Milestone;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class MilestoneDao {
    public Milestone findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Milestone.class, id);
    }

    public void save(Milestone milestone) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(milestone);
        tx1.commit();
        session.close();
    }

    public void update(Milestone milestone) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(milestone);
        tx1.commit();
        session.close();
    }

    public void delete(Milestone milestone) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(milestone);
        tx1.commit();
        session.close();
    }

    public List<Milestone> findAll() {
        List<Milestone> milestonesList = (List<Milestone>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Milestone").list();
        return milestonesList;
    }
}

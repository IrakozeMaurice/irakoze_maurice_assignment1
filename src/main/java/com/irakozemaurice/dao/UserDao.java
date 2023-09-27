package com.irakozemaurice.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.irakozemaurice.model.User;
import com.irakozemaurice.util.HibernateUtil;

public class UserDao {

	public void save(User user) {
		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the user
			session.persist(user);

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e);
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public User getById(int student_id) {

		User user = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			user = session.get(User.class, student_id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public void update(User user) {
		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// update the user
			session.update(user);

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e);
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}

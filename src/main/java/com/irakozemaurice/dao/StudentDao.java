package com.irakozemaurice.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.irakozemaurice.model.Student;
import com.irakozemaurice.util.HibernateUtil;

public class StudentDao {

	public void save(Student student) {
		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the user
			session.persist(student);

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

	public List<Student> getAll() {
		List<Student> students = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			students = session.createQuery("from Student", Student.class).list();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}
}

package com.test.project.ManyRelationship;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.perscholas.model.Department;
import com.perscholas.model.Teacher;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Department dep = new Department();
		dep.setDname("IT");

		Department dep2 = new Department();
		dep2.setDname("HR");

		Teacher t1 = new Teacher();
		t1.setSalary("1000");
		t1.setTeachername("MHaseeb");

		Teacher t2 = new Teacher();
		t2.setSalary("2220");
		t2.setTeachername("Shahparan");

		Teacher t3 = new Teacher();
		t3.setSalary("30000");
		t3.setTeachername("James");

		Teacher t4 = new Teacher();
		t3.setSalary("40000");
		t3.setTeachername("Joseph");

		Teacher t5 = new Teacher();
		t5.setSalary("200");
		t5.setTeachername("Ali");

		// Add teacher entity object to the list
		List<Teacher> teachlist = new ArrayList();
		teachlist.add(t1);
		teachlist.add(t2);
		teachlist.add(t3);
		teachlist.add(t4);
		teachlist.add(t5);
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);

		// Create Department
		Department department = new Department();
		department.setDname("Development");
		department.setTeacherList(teachlist);

		// Store Department
		session.save(department);
		t.commit();
	}
}
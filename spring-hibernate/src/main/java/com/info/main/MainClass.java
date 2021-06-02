package com.info.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.info.dao.StudentDao;
import com.info.model.Student;
import com.info.model.id.StudentId;

public class MainClass {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao bean = context.getBean("studDao", StudentDao.class);
		StudentId id = new StudentId();
		id.setStudId("STUD101");
		id.setEnrollmentId("ENR101010");
		Student student = new Student();
		student.setFirstName("Vitthal");
		student.setLastName("Jadhav");
		student.setCity("Pune");
		student.setPincode("413505");
		student.setId(id);

		Student save = bean.save(student);
		System.out.println(save);
	}
}

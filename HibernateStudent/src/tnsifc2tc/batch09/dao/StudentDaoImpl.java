package tnsifc2tc.batch09.dao;

import javax.persistence.EntityManager;

import tnsifc2tc.batch09.entity.Student;

public class StudentDaoImpl implements StudentDao {
	EntityManager entityManager;

	public StudentDaoImpl()
	{
		entityManager=Configuration.getEntityManager();
	}

	@Override
	public void startTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		entityManager.persist(student);
	}
	

	@Override
	public void endTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
		
	}

	@Override
	public Student updateStudent(Student student) {
		Student s= entityManager.merge(student);

		// TODO Auto-generated method stub
		return s;
	}

	@Override
	public Student searchStudentById(int id) {
		// TODO Auto-generated method stu
		Student p= entityManager.find(Student.class,id);

		return p;
	}

	@Override
	public Student searchStudentByHallTicket(int hallTicketNo) {
		// TODO Auto-generated method stub
		Student p1= entityManager.find(Student.class,hallTicketNo);
		return p1;
	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		Student p2= entityManager.find(Student.class,id);
		entityManager.remove(id);
		return false;
	}

	
	}

	

	
	

	
	





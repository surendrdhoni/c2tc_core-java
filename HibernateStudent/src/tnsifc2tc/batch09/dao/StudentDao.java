package tnsifc2tc.batch09.dao;

import tnsifc2tc.batch09.entity.Student;

public interface StudentDao {

	Object endTransaction = null;

	void startTransaction();

	void addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudentById(int id);
	public Student searchStudentByHallTicket(int hallTicketNo);
	public boolean deleteStudent(int id);
	

	void endTransaction();



	
	
}

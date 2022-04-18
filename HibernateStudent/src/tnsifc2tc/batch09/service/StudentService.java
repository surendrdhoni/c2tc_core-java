package tnsifc2tc.batch09.service;

import tnsifc2tc.batch09.entity.Student;

public interface StudentService {

	void addStudent(Student student);

	Student updateStudent(Student student);

	Student searchStudentById(int id);
	boolean deleteById(int id);
	

}

package tnsifc2tc.batch09.service;

import tnsifc2tc.batch09.dao.StudentDao;
import tnsifc2tc.batch09.dao.StudentDaoImpl;
import tnsifc2tc.batch09.entity.Student;

public class StudentServiceImpl implements StudentService {
	StudentDao sd;
	public StudentServiceImpl()
	{
		sd= new StudentDaoImpl();
	}
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		sd.startTransaction();
		sd.addStudent(student);
		sd.endTransaction();
	}
	@Override
		public  Student updateStudent(Student student)
		{
			
			sd.startTransaction();
			sd.updateStudent(student);
			Student s=sd.updateStudent(student);
		sd.endTransaction();
		return s;
	}
	
	
	
	

	@Override
	public Student searchStudentById(int id) {
		// TODO Auto-generated method stub
		
		Student s1=	sd.searchStudentById( id);
	return s1;
	}
	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		sd.startTransaction();
		 sd.deleteStudent( id);
	sd.endTransaction();
		return false;
	}
}

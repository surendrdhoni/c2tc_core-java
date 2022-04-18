package tnsifc2tc.batch009;

import tnsifc2tc.batch09.entity.Student;
import tnsifc2tc.batch09.service.StudentService;
import tnsifc2tc.batch09.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student student = new Student();
StudentService ss=new StudentServiceImpl();
student.setId(413);
student.setName("surendra2");
student.setCollege("RV COLLRGE");
student.setRoll(28);
student.setYear(2020);
student.setCourse("EEE");
student.setCertificate("JAVA DELVALOPER");
student.setHallTicketNo(3265);
student.setQualification("BE");

//ss.addStudent(student);
//ss.updateStudent(student);
//ss.deleteById(4201);
//System.out.println(ss.deleteById(4201));
//System.out.println(ss.searchStudentById(4201));

	}
	

}


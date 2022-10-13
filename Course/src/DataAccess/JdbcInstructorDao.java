package DataAccess;

import Entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println(instructor.getInstructorName()+" "+instructor.getInstructorLastName() + " JDBC ile Veri Tabanına Eklendi");
		
	}

}

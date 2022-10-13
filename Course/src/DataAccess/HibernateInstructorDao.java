package DataAccess;

import Entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println(instructor.getInstructorName()+" "+instructor.getInstructorLastName() + " HİBERNATE ile Veri Tabanına Eklendi");
		
	}

}

package Logging;

import Entities.Category;
import Entities.Course;
import Entities.Instructor;

public class DataBaseLogger implements Logging {

	@Override
	public void logger(Course course) {
		System.out.println("Veri Tabanına Loglandı : " + course.getCourseName());
	}

	@Override
	public void logger2(Category category) {
		System.out.println("Veri Tabanına Loglandı : " + category.getCategory());

	}

	@Override
	public void logger3(Instructor instructor) {
		System.out.println("Veri Tabanına Loglandı : " + instructor.getInstructorName() + " "
				+ instructor.getInstructorLastName());

	}

}

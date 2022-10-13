package Logging;

import Entities.Category;
import Entities.Course;
import Entities.Instructor;

public class FileLogger implements Logging {

	@Override
	public void logger(Course course) {
		System.out.println("Dosyaya Loglandı : " + course.getCourseName());
	}

	@Override
	public void logger2(Category category) {
		System.out.println("Dosyaya Loglandı : " + category.getCategory());

	}

	@Override
	public void logger3(Instructor instructor) {
		System.out.println(
				"Dosyaya Loglandı : " + instructor.getInstructorName() + " " + instructor.getInstructorLastName());

	}
}

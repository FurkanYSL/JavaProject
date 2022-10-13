package DataAccess;

import Entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println(course.getCourseName() + " HİBERNATE ile Veri Tabanına Eklendi");
	}
}

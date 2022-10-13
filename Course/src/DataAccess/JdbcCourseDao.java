package DataAccess;

import Entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println(course.getCourseName() + " JDBC ile Veri Tabanına Eklendi");
	}
}

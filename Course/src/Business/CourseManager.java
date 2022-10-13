package Business;

import java.util.ArrayList;

import DataAccess.CourseDao;
import Entities.Course;
import Logging.Logging;

public class CourseManager {
	private CourseDao courseDao;
	private Logging loggers;
	private ArrayList<String> courses = new ArrayList<>();

	public CourseManager(CourseDao courseDao, Logging loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getCoursePrice() < 0)
			throw new Exception("Kurs Fiyatı 0 dan Küçük Olamaz");
		if (courses.contains(course.getCourseName()))
			throw new Exception("Eklemek İstediğiniz Kurs Zaten Eklidir");
		courses.add(course.getCourseName());
		courseDao.add(course);
		loggers.logger(course);
	}
}

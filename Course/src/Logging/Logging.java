package Logging;

import Entities.Category;
import Entities.Course;
import Entities.Instructor;

public interface Logging {
	void logger(Course course);

	void logger2(Category category);

	void logger3(Instructor ınstructor);
}

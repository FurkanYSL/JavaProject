package Business;

import DataAccess.InstructorDao;
import Entities.Instructor;
import Logging.Logging;

public class InstructorManager {
	private InstructorDao ınstructorDao;
	private Logging logger;

	public InstructorManager(InstructorDao instructorDao, Logging logger) {
		this.ınstructorDao = instructorDao;
		this.logger = logger;
	}

	public void add(Instructor ınstructor) {
		ınstructorDao.add(ınstructor);
		logger.logger3(ınstructor);
	}
}

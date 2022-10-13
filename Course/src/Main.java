import Business.CategoryManager;
import Business.CourseManager;
import Business.InstructorManager;
import DataAccess.HibernateCategoryDao;
import DataAccess.HibernateCourseDao;
import DataAccess.JdbcCourseDao;
import DataAccess.JdbcInstructorDao;
import Entities.Category;
import Entities.Course;
import Entities.Instructor;
import Logging.DataBaseLogger;
import Logging.FileLogger;
import Logging.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception {
		Category category1 = new Category("Programlama Orta Seviye");
		Category category2 = new Category("Programlama Giriş Seviye");
		Category category3 = new Category("Programlama İleri Seviye");

		Instructor ınstructor1 = new Instructor("Engin", "Demiroğ");
		Instructor ınstructor2 = new Instructor("Murat", "Yücedağ");
		Instructor ınstructor3 = new Instructor("Mustafa Murat", "Coşkun");

		Course course1 = new Course("Yazılım Geliştirici Yetiştirme Kampı", 10, category2, ınstructor1);
		Course course2 = new Course("Sıfırdan İleri Seviyeye Python", 35, category2, ınstructor3);
		Course course3 = new Course("Senior Yazılım Geliştirici Yetiştirme Kampı", 35, category3, ınstructor1);

		CourseManager coursemanager1 = new CourseManager(new JdbcCourseDao(), new DataBaseLogger());
		CategoryManager categorymanager1 = new CategoryManager(new HibernateCategoryDao(), new MailLogger());
		InstructorManager ınstructormanager1 = new InstructorManager(new JdbcInstructorDao(), new FileLogger());

		categorymanager1.add(category1);
		categorymanager1.add(category2);
		categorymanager1.add(category3);
		// categorymanager1.add(category1); Aynı Kurs Tekrardan Eklenemez

		coursemanager1.add(course1);
		coursemanager1.add(course2);
		coursemanager1.add(course3);
		// coursemanager1.add(course3); Aynı Kategori Tekrardan Eklenemez

		ınstructormanager1.add(ınstructor1);
		ınstructormanager1.add(ınstructor2);
		ınstructormanager1.add(ınstructor3);

	}

}

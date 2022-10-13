package Business;

import java.util.ArrayList;

import DataAccess.CategoryDao;
import Entities.Category;
import Logging.Logging;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logging logger;
	private ArrayList<String> categories = new ArrayList<>();

	public CategoryManager(CategoryDao categoryDao, Logging logger) {
		this.categoryDao = categoryDao;
		this.logger = logger;
	}

	public void add(Category category) throws Exception {
		if (categories.contains(category.getCategory()))
			throw new Exception("Eklemek İstediğiniz Kategori Bulunmaktadır Lütfen Başka Kategori Ekleyiniz");
		categories.add(category.getCategory());
		categoryDao.add(category);
		logger.logger2(category);
	}
}

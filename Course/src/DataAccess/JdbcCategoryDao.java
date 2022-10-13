package DataAccess;

import Entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println(category.getCategory() + " JDBC ile Veri Tabanına Eklendi");
		
	}

}

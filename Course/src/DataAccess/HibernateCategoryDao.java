package DataAccess;

import Entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println(category.getCategory() + " HİBERNATE ile Veri Tabanına Eklendi");
		
	}

}

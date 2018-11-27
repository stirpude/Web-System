package com.iit.edu.service;

import java.util.List;

import com.iit.edu.model.Category;

public interface CategoryService {
	
	public List<Category> getAllCategories();
	
	public Category addCategory(Category cat);
	
	public void deleteCategory(Category cat);
	

}
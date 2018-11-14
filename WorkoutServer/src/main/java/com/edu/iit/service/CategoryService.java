package com.edu.iit.service;

import java.util.List;

import com.edu.iit.model.Category;

public interface CategoryService {
	
	public List<Category> getAllCategories();
	
	public Category addCategory(Category cat);
	
	public void deleteCategory(Category cat);
	

}
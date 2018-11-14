package com.iit.edu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.iit.dao.CategoryRepository;
import com.edu.iit.model.Category;
import com.edu.iit.service.CategoryService;

@Service("categoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Category> getAllCategories() {
		List<Category> dtoList = new ArrayList<Category>();
		dtoList = categoryRepository.findAll();
		for(Category cat : dtoList) {
			System.out.println(cat.getCategoryId() + " "+ cat.getCategoryName());
		}
		return dtoList;
	}

	@Override
	public Category addCategory(Category cat) {
		return categoryRepository.save(cat);
	}

	@Override
	public void deleteCategory(Category cat) {
		categoryRepository.delete(cat);
		
	}
	
	

}


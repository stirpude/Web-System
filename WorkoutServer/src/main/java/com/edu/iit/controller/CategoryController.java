package com.edu.iit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edu.iit.model.Category;
import com.edu.iit.service.CategoryService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	
	@RequestMapping(value = "/getCategories", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Category> getCategories() {
		List<Category> catList = categoryService.getAllCategories();
		if (!(catList!=null && catList.size() > 0 )) {
			return null;
		}
		return catList;
	}
	
	@RequestMapping(value = "/addCategory", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public Category addCategory(@RequestBody Category cat) {
		
		Category cat1 =  categoryService.addCategory(cat);
		return cat1;
	}
	
	@RequestMapping(value = "/deleteCategory", method = RequestMethod.POST)
	public void deleteCategory(@RequestBody Category cat) {
		categoryService.deleteCategory(cat);
	}
}


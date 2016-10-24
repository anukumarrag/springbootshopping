package com.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shopping.modal.Category;
import com.shopping.modal.CategoryDAO;

@Controller
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryDAO _categoryDao;

	
	 @RequestMapping(value="/deleteCategory")
	  @ResponseBody
	public String delete(long id) {
		 try {
		Category category = new Category(id);
		_categoryDao.delete(category);
		 }catch(Exception e){
			 
		 }
		 return "Category succesfully deleted!";
	}
	
	 @RequestMapping(value="/get-by-name")
	  @ResponseBody
	  public String getByEmail(String name) {
		 System.out.println(name);
	    String categoryId;
	    try {
	      Category category = _categoryDao.getByName(name);
	      System.out.println(category);
	      categoryId = String.valueOf(category.getId());
	    }
	    catch(Exception ex) {
	      return "User not found";
	    }
	    return "The user id is: " + categoryId;
	  }
	
	 
	 @RequestMapping(value="/saveCategory")
	  @ResponseBody
	  public String create(String name) {
	    try {
	      Category category = new Category(name);
	      _categoryDao.save(category);
	    }
	    catch(Exception ex) {
	      return ex.getMessage();
	    }
	    return "category succesfully saved!";
	  }

	
	
}

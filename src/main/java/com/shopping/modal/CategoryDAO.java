package com.shopping.modal;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CategoryDAO {
	
	@Autowired
	SessionFactory _sessionFactory;
	
	private Session getSession() {
		
		return _sessionFactory.getCurrentSession();
		
	}
	
	public void save(Category category) {
		getSession().save(category);
		
	}
	
	public void delete(Category category) {
		getSession().delete(category);
	}

	
	@SuppressWarnings("unchecked")
	  public List getAll() {
	    return getSession().createQuery("from category").list();
	  }
	
	public Category getByName(String name) {
		
		System.out.println(name);
	    return (Category) getSession().createQuery(
	        "from category where name = :name")
	        .setParameter("name", name)
	        .uniqueResult();
	  }
	
	
	public Category getById(long id) {
	    return (Category) getSession().load(Category.class, id);
	  }
	
	 public void update(Category category) {
		    getSession().update(category);
		  }
	
	
}

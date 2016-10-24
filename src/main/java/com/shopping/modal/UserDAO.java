package com.shopping.modal;
import org.springframework.data.repository.CrudRepository;



public interface UserDAO extends CrudRepository<User,Long>{
	
	
	public User findByEmail(String email) ;

}

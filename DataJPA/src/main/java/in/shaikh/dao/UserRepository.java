package in.shaikh.dao;

import org.springframework.data.repository.CrudRepository;

import in.shaikh.entities.User;

public interface UserRepository extends CrudRepository <User, Integer> {
	
	

}

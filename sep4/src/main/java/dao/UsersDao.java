
package dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sep4.model.Users;

public interface UsersDao extends CrudRepository<Users, Integer> {

	@Override
	List<Users> findAll();

	Users findByUsername(String username);

} 
 

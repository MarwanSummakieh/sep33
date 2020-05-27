package dao;




import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sep4.model.Users;


@Transactional
@Repository
public class UsersRepository  {

	@PersistenceContext
	@Autowired
	public EntityManager entityManager;

	

	public void addUser(Users owner) {
		entityManager.persist(owner);

	}



}

package com.sep4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sep4.model.Users;

import dao.UsersDao;

@Service
public class UserService {
	@Autowired
	UsersDao dao;

	public List<Users> findAll() {
		return dao.findAll();
	}

	public void postUser(Users user) {
		dao.save(user);
	}

	public Users getUserByUsername(String username) {
		Users user = dao.findByUsername(username);

		return user;
	}

} 
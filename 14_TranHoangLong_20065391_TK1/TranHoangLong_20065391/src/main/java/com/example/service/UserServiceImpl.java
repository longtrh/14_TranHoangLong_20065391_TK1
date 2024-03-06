package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.entity.User;
import com.example.respository.UserDao;
@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;
	@Override
	public List<User> findAll(){
		return dao.findAll();
	}
	@Override
	public User save(User user) {
		return dao.save(user);
	}
	
	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return dao.findUserById(id);
	}
	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}
}

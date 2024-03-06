package com.example.respository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.entity.User;

@Repository
public interface UserDao {
	public List<User> findAll();
	public User save(User user);
	public User findUserById(int id);
	public String delete(int id);
}

package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.User;

@Service
public interface UserService {
	public List<User> findAll();
	public User save(User user);
	public User findUserById(int id);
	public String delete(int id);
}

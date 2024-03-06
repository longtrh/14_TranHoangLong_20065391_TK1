package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService dao;
	@PostMapping("/save")
	public User save(@RequestBody User user) {
		return dao.save(user);
	}
	@GetMapping("/findAll")
    public List<User> getAllOrders() {
        return dao.findAll();
    }

    @GetMapping("findOrderById/{id}")
    public User findOrder(@PathVariable int id) {
        return dao.findUserById(id);
    }
    @DeleteMapping("delete/{id}")
    public String remove(@PathVariable int id)   {
    	return dao.delete(id);
	}
}

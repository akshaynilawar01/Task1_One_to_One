package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	
	private UserService userService;
	
	@GetMapping("/alluser")
	public List<User> getAllUSer()
	{
		return userService.getAllUser();
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public void deleteUSer(@PathVariable int id)
	{
		userService.deleteUser(id);
	}
	
	@PutMapping("/updateuser/{id}")
	public User updateUser(@RequestBody User user, @PathVariable int id)
	{
		return userService.updateUser(user, id);
	}
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user)
	{
		return userService.addUser(user);
	}
	
	@PostMapping("/{userid}/mapuser/{addressid}")
	public User mapUser(@PathVariable int userid, @PathVariable int addressid)
	{
		return userService.bindingUser(userid, addressid);
	}
}

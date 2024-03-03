package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Address;
import com.example.demo.model.User;
import com.example.demo.repository.AddressRepo;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private AddressRepo addressRepo;
	
	public List<User> getAllUser()
	{
		return userRepo.findAll();
	}
	
	public User addUser(User user)
	{
		return userRepo.save(user);
	}
	
	public void deleteUser(int id)
	{
		userRepo.deleteById(id);
	}
	
	public User updateUser(User user, int id)
	{
		User use = userRepo.findById(id).get();
		
		if (Objects.nonNull(user.getFirstname())
	            && !"".equalsIgnoreCase(
	            		user.getFirstname())) {
			use.setFirstname(
					user.getFirstname());
	        }
	 
	        if (Objects.nonNull(
	        		user.getGender())
	            && !"".equalsIgnoreCase(
	            		user.getGender())) {
	        	use.setGender(
	        			user.getGender());
	        }
	        
	        return userRepo.save(use);
	}
	
	public User bindingUser(int userid, int addressid)
	{
		User u = userRepo.findById(userid).get();
		
		Address a = addressRepo.findById(addressid).get();
		
		 u.setAddress(a);
		 return userRepo.save(u);
	}
	
	
}

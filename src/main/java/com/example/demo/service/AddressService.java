package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Address;
import com.example.demo.repository.AddressRepo;

@Service
public class AddressService {

	@Autowired
	
	private AddressRepo addressRepo;
	
	public Address addAddress(Address address)
	{
		return addressRepo.save(address);
	}
	
	public void deleteAddress(int id)
	{
		addressRepo.deleteById(id);
	}
	
	public List<Address> getAllAddress()
	{
		return addressRepo.findAll();
	}
	
	public Address updateAddress(Address address, int id)
	{
		Address add = addressRepo.findById(id).get();
		
		if (Objects.nonNull(address.getStreet())
	            && !"".equalsIgnoreCase(
	            		address.getStreet())) {
			add.setStreet(
	            		address.getStreet());
	        }
	 
	        if (Objects.nonNull(
	        		address.getCity())
	            && !"".equalsIgnoreCase(
	            		address.getCity())) {
	        	add.setCity(
	            		address.getCity());
	        }
	 
	        return addressRepo.save(add);
	}
}

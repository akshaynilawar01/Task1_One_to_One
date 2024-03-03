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

import com.example.demo.model.Address;
import com.example.demo.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	
	private AddressService addressService;
	
	@GetMapping("/getaddress")
	public List<Address> getAllAddress()
	{
		return addressService.getAllAddress();
	}
	
	@DeleteMapping("/deleteaddress/{id}")
	public void deleteAddress(@PathVariable int id)
	{
		addressService.deleteAddress(id);
	}
	
	@PutMapping("/updateaddress/{id}")
	public Address updateAddress(@RequestBody Address address, @PathVariable int id)
	{
		return addressService.updateAddress(address, id);
	}
	
	@PostMapping("/addaddress")
	public Address addAddress(@RequestBody Address address)
	{
		return addressService.addAddress(address);
	}

}

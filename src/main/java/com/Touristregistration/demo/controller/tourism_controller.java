package com.Touristregistration.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Touristregistration.demo.entity.tourism;
import com.Touristregistration.demo.services.tourism_services;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class tourism_controller 
{
	@Autowired
	public tourism_services tservices;
               
	@RequestMapping(method = RequestMethod.POST,value="/register")
	public tourism add(@RequestBody tourism t)
	{
		tourism tobj;
		tobj=tservices.insert(t);
		return tobj;
	}
	@RequestMapping(method = RequestMethod.GET,value="/list/{name}")
	public List<tourism> get(@PathVariable String name)
	{
		List<tourism> alltourists= tservices.get(name);
		return alltourists;
	}
}

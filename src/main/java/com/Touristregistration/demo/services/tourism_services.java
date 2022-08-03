package com.Touristregistration.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Touristregistration.demo.entity.tourism;
import com.Touristregistration.demo.repository.tourism_repository;

@Service
public class tourism_services
{

	@Autowired
	private tourism_repository trepository;

	
	public tourism insert(tourism t)
	{

		return trepository.save(t);
	}


	public List<tourism> get(String firstname)
	{
		
		
		return trepository.findAll(Sort.by(Sort.Direction.DESC,firstname));
//		List<tourism> ltourist=new ArrayList<>();
//		
//		trepository.findAll().forEach(ltourist::add);
//		return ltourist;
//		
	}
}

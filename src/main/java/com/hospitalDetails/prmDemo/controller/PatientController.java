package com.hospitalDetails.prmDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalDetails.prmDemo.dao.PatientDao;
import com.hospitalDetails.prmDemo.entities.Patient;

@RestController
public class PatientController {
	@Autowired
	private PatientDao dao;
	@RequestMapping("savePat")
	public void savePat(@RequestBody Patient pat){
		dao.save(pat);
		
	}
	

}

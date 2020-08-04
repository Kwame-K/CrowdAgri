package com.kris.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kris.demo.model.Campagne;
import com.kris.demo.service.CampagneService;

@RestController
public class CampagneController {

	//Methode metier
	public void classer() {}
	public void trier() {}
	
	@Autowired
	private CampagneService service;
	
	@GetMapping("/campagne")
	public List<Campagne> findAllCamp(){
		return service.getCampagnes();
	}
	@GetMapping("/campagne/{id}")
	public Campagne findCampagneById(@PathVariable Integer id) {
		return service.getCampagnesById(id);
	}
	
	@PostMapping("/addCampagne")
	public Campagne adCampagne(@RequestBody Campagne camp) {
		return service.saveCampagne(camp);
}
	@PutMapping("/updateCampagne")
		public Campagne updateUser(@RequestBody Campagne camp) {
			return service.updateCampagne(camp);
		}
		
		
		@DeleteMapping("/deleteCamp/{id}")
		public String deleteUser(@PathVariable Integer id) {
		return service.deleteCampagne(id);
		}
}

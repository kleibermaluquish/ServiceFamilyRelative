package com.empresa.app.familyrelative.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.app.familyrelative.model.document.FamilyRelative;
import com.empresa.app.familyrelative.model.service.IFamilyRelativeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/familyRelative")
public class FamilyRelativeController {

	@Autowired
	private IFamilyRelativeService service;
	
	@GetMapping("/findAll")
	public Flux<FamilyRelative> findAll(){		
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Mono<FamilyRelative> findById(@PathVariable String id){
		return service.finById(id);
	}
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Mono<FamilyRelative> create(@RequestBody FamilyRelative familyRelative){
		return service.create(familyRelative);
	}
	
	@PutMapping("/{id}")
	public Mono<ResponseEntity<FamilyRelative>> update(@RequestBody FamilyRelative familyRelative, @PathVariable String id){
		return service.update(familyRelative, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public Mono<Void> deleteById(@PathVariable String id){
		return service.deleteById(id);
	}
}

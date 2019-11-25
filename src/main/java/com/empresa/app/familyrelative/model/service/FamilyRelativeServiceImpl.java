package com.empresa.app.familyrelative.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.empresa.app.familyrelative.model.dao.IFamilyRelativeDao;
import com.empresa.app.familyrelative.model.document.FamilyRelative;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FamilyRelativeServiceImpl implements IFamilyRelativeService {

	@Autowired
	private IFamilyRelativeDao dao;
	
	
	@Override
	public Flux<FamilyRelative> findAll() {
		
		return dao.findAll();
	}

	@Override
	public Mono<FamilyRelative> finById(String id) {
		return dao.findById(id);
	}

	@Override
	public Mono<FamilyRelative> create(FamilyRelative familyRelative) {
		return dao.save(familyRelative);
	}

	@Override
	public Mono<ResponseEntity<FamilyRelative>> update(FamilyRelative familyRelative, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return dao.deleteById(id);
	}

}

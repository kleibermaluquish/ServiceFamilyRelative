package com.empresa.app.familyrelative.model.service;

import org.springframework.http.ResponseEntity;

import com.empresa.app.familyrelative.model.document.FamilyRelative;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IFamilyRelativeService {

	// CRUD
	public Flux<FamilyRelative> findAll();

	public Mono<FamilyRelative> finById(String id);

	public Mono<FamilyRelative> create(FamilyRelative familyRelative);

	public Mono<ResponseEntity<FamilyRelative>> update(FamilyRelative familyRelative, String id);

	public Mono<Void> deleteById(String id);
}

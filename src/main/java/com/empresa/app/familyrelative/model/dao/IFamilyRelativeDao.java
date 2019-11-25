package com.empresa.app.familyrelative.model.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.empresa.app.familyrelative.model.document.FamilyRelative;

@Repository
public interface IFamilyRelativeDao extends ReactiveMongoRepository<FamilyRelative, String> {
 // CRUD
}

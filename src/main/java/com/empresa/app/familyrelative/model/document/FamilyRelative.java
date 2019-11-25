package com.empresa.app.familyrelative.model.document;

import java.util.Date;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;


@Document(collection = "FalimyRelative")
public class FamilyRelative {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String gender;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date f_birth;
	private String typeDocument;
	private String numberDocument;
	private String TypeRelative;

	public FamilyRelative() {
	}

	public FamilyRelative(String firstName, String lastName, String gender, Date f_birth, String typeDocument,
			String numberDocument, String typeRelative) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.f_birth = f_birth;
		this.typeDocument = typeDocument;
		this.numberDocument = numberDocument;
		TypeRelative = typeRelative;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getF_birth() {
		return f_birth;
	}

	public void setF_birth(Date f_birth) {
		this.f_birth = f_birth;
	}

	public String getTypeDocument() {
		return typeDocument;
	}

	public void setTypeDocument(String typeDocument) {
		this.typeDocument = typeDocument;
	}

	public String getNumberDocument() {
		return numberDocument;
	}

	public void setNumberDocument(String numberDocument) {
		this.numberDocument = numberDocument;
	}

	public String getTypeRelative() {
		return TypeRelative;
	}

	public void setTypeRelative(String typeRelative) {
		TypeRelative = typeRelative;
	}

}

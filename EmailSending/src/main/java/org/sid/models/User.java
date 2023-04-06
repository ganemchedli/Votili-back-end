package org.sid.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
private String firstname;
private String lastName;
private String emailAdress;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmailAdress() {
	return emailAdress;
}
public void setEmailAdress(String emailAdress) {
	this.emailAdress = emailAdress;
}
public User(String firstname, String lastName, String emailAdress) {
	super();
	this.firstname = firstname;
	this.lastName = lastName;
	this.emailAdress = emailAdress;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
}

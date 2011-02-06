package models;

import java.util.Date;

import models.crudsiena.SienaSupport;

import siena.Id;
import siena.Model;

public class User extends SienaSupport {

	@Id
	public Long id;
	
	public String email;
	public Date created = new Date();
	
	public User(String email) {
		this.email = email;
	}

	public static User findByEmail(String email) {
		return all(User.class).filter("email", email).get();
	}
	
	public String toString() {
		return email;
	}
}

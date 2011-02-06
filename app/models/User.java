package models;

import java.util.Date;

import siena.Id;
import siena.Model;

public class User extends Model {

	@Id
	public Long id;
	
	public String email;
	public String name;
	public Date created = new Date();
	public Date modified;
	
	public User(String email) {
		this.email = email;
	}

	public static User findByEmail(String email) {
		return all(User.class).filter("email", email).get();
	}
}

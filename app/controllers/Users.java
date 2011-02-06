package controllers;

import controllers.Security.AdminOnly;
import controllers.Security.Secure;
import play.mvc.With;

@With({Secure.class, AdminOnly.class})
public class Users extends CRUD {

}

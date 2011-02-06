package controllers;

import models.User;
import play.modules.gae.GAE;
import play.mvc.Before;
import play.mvc.Controller;

public class Security {
 
	public static boolean isConnected() {
		return connected() != null;
	}
	
	public static String connected() {
		
		if (GAE.getUser() != null) {
			return GAE.getUser().getEmail();
		} else {
			return null;
		}
	}

	public static class Secure extends Controller {
		
		@Before(unless="logout")
		static void forceLogin() {
			if (!GAE.isLoggedIn()) {
				GAE.login();
			}
		}
		
		public static void logout() {
			GAE.logout("/");
		}
	}
}

package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import controllers.Security.Secure;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

}
package br.com.moneycash.login;

import org.springframework.composed.web.Get;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

	@Get("/login")
	public String index() {
		return "login/index";
	}
}

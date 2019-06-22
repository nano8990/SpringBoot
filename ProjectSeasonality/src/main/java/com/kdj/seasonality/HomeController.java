package com.kdj.seasonality;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("")
@Controller
public class HomeController {
	
	@GetMapping(value = "/")
	public String home(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String loginId = (String) session.getAttribute("login_id");
		if (loginId == null) {
			session.invalidate();
			return "home/no_session_form";
		} else {
			session.invalidate();
			session = request.getSession();
			session.setAttribute("login_id", loginId);
			return "home/yes_session_form";
		}
	}
}
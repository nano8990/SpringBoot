package com.kdj.seasonality;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kdj.dataformat.User;
import com.kdj.user.UserImpl;
import com.kdj.user.UserMapper;

@RequestMapping("/account")
@Controller
public class AccountController {

	UserMapper userMapper = new UserImpl();
	
	@GetMapping(value = "/check_identify")
	public String checkIdentify() {
		return "account/check_identify";
	}

	@PostMapping(value = "/do_check_identify")
	public String doCheckIdentify(Model model, HttpServletRequest request,
			@RequestParam("key_number") String keyNumber) {

		try {
			int intKeyNumber = Integer.parseInt(keyNumber);
			if (keyNumber.length() != 6) {
				model.addAttribute("message", "6자리의 번호를 입력해주세요.");
				model.addAttribute("url", "check_identify");
				return "home/alert_page";
			}
//			try {
			System.out.println(userMapper);
				User user = userMapper.selectUserByKey(intKeyNumber);
				if (user == null) {
					model.addAttribute("message", "이미 계정이 존재합니다.");
					model.addAttribute("url", "login");
					return "home/alert_page";
				} else {
					HttpSession session = request.getSession();
					session.setAttribute("key_number", keyNumber);
					return "redirect:account_create";
				}
//			} catch (Exception e) {
//				model.addAttribute("message", "User 테이블 조회 오류");
//				model.addAttribute("url", "check_identify");
//				return "home/alert_page";
//			}
		} catch (NumberFormatException e) {
			model.addAttribute("message", "주민등록번호는 숫자만 입력해주세요.");
			model.addAttribute("url", "check_identify");
			return "home/alert_page";
		}
	}

	@GetMapping(value = "/account_create")
	public String accountCreate(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		String keyNumber = (String) session.getAttribute("key_number");
		if (keyNumber == null) {
			model.addAttribute("message", "주민번호 중복체크를 먼저 해주세요.");
			model.addAttribute("url", "check_identify");
			return "home/alert_page";
		} else {
			return "account/account_create";
		}
	}

	@GetMapping(value = "/login")
	public String login() {
		return "account/login";
	}

}

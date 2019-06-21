package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.UserMapper;
import com.example.user.UserDaoImplMapper;
import com.example.userVO.UserVO;

@RestController
public class MyBatisController {

	@Autowired
	UserMapper mapper = new UserDaoImplMapper();

	@GetMapping(path = "/select")
	public String select(@RequestParam(value = "idx", required = false, defaultValue = "-1") String idx) {
		try {
			int intIdx = Integer.parseInt(idx);
			try {
				String resultString = new String();
				if (intIdx >= 0) {
					UserVO result = mapper.selectUserByIdx(intIdx);
					resultString = result.toString();
				} else {
					List<UserVO> result = mapper.selectUserList();
					for (int i = 0; i < result.size(); i++) {
						resultString += result.get(i).toString() + "<br>";
					}
				}
				return resultString;
			} catch (NullPointerException e) {
				return "조회된 데이터가 존재하지 않습니다.";
			}
		} catch (NumberFormatException e) {
			return "IDX는 숫자만 입력하세요.";
		}
	}

	@GetMapping(path = "/insert")
	public String insert(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "locale", required = false) String locale) {
		try {
			mapper.insertUser(new UserVO(name, locale));
			return "입력되었습니다.";
		} catch (Exception e) {
			return "name, locale 파라미터를 입력해주세요.";
		}

	}

}

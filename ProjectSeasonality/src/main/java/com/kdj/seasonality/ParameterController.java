package com.kdj.seasonality;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/parameter")
@Controller
public class ParameterController {
	
	@GetMapping(value = "/form/select")
	public String selectParameterForm() {
		return "parameter/select_parameter";
	}

	@GetMapping(value = "/form/do_select")
	public String doSelectParameter(Model model, @RequestParam("region_id") String regionId,
			@RequestParam("product") String product, @RequestParam("yearweek_start") String yearweekStart,
			@RequestParam("yearweek_end") String yearweekEnd, @RequestParam("qty_up") String qtyUp,
			@RequestParam("qty_down") String qtyDown) {
		regionId = deleteComma(regionId);
		product = deleteComma(product);

		try {
			int[] yearweek = { Integer.parseInt(yearweekStart), Integer.parseInt(yearweekEnd) };
			if (qtyUp == null && qtyDown == null) {
				int[] qty = { Integer.parseInt(qtyUp), Integer.parseInt(qtyDown) };
				Arrays.sort(qty);
			} else {
				if (qtyUp == null) {
					
				} else {
					int[] qty = { Integer.parseInt(qtyUp), Integer.parseInt(qtyDown) };
				}
			}
			Arrays.sort(yearweek);
		} catch (NumberFormatException e) {
			model.addAttribute("message", "YEARWEEK와 QTY는 숫자를 입력해주세요.");
			model.addAttribute("url", "form/select");
			return "home/alert_page";
		}

		return "parameter/select_parameter";
	}

	public String deleteComma(String inputString) {
		String[] splitResult = inputString.split(",");
		String resultString = "";
		for (int i = 0; i < splitResult.length; i++) {
			resultString += splitResult[i];
			if (i < splitResult.length - 1) {
				resultString += ',';
			}
		}
		return resultString;
	}
}
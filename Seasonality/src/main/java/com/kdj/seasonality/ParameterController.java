package com.kdj.seasonality;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kdj.parameter.ParameterCondition;
import com.kdj.parameter.ParameterConditionMapper;

@Controller
public class ParameterController {

	@Autowired(required = false)
	ParameterConditionMapper parameter = new ParameterCondition();

	@RequestMapping(value = "/form/select_parameter", method = RequestMethod.GET)
	public String selectParameterForm() {
		return "select_parameter";
	}

	@RequestMapping(value = "/form/do_select_parameter", method = RequestMethod.GET)
	public String doSelectParameter(Model model, @RequestParam("region_id") String regionId,
			@RequestParam("product") String product, @RequestParam("yearweek_start") String yearweekStart,
			@RequestParam("yearweek_end") String yearweekEnd, @RequestParam("qty_up") String qtyUp,
			@RequestParam("qty_down") String qtyDown) {
		regionId = deleteComma(regionId);
		product = deleteComma(product);

		try {
			int[] yearweek = { Integer.parseInt(yearweekStart), Integer.parseInt(yearweekEnd) };
			int[] qty = { Integer.parseInt(qtyUp), Integer.parseInt(qtyDown) };
			Arrays.sort(yearweek);
			Arrays.sort(qty);
		} catch (NumberFormatException e) {
			model.addAttribute("message", "YEARWEEK와 QTY는 숫자를 입력해주세요.");
			model.addAttribute("url", "form/select_parameter");
			return "alert_page";
		}

		return "select_parameter";
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

package com.green.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.green.biz.employee.EmployeeService;
import com.green.biz.employee.EmployeeVO;

@Controller
@SessionAttributes("loginUser")
public class LoginController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/employee_login", method = RequestMethod.POST)
	public String EmployeeLogin(EmployeeVO evo, Model model) {
		
		EmployeeVO loginUser = employeeService.loginEmployee(evo);
		
		if (loginUser != null) {
			model.addAttribute("loginUser", loginUser);
			return "redirect:/index";
		} else {
			return "login_fail";
		}
		
	}
	
	@RequestMapping(value = "/employee_logout")
	public String EmployeeLogout(SessionStatus status) {
		
		status.setComplete();
		
		return "redirect:/index";
	}
	
}


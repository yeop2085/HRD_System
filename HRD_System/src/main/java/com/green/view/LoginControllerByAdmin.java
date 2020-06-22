package com.green.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.green.biz.hrdAdmin.HrdAdminService;
import com.green.biz.hrdAdmin.HrdAdminVO;

@Controller
@SessionAttributes("loginAdmin")
public class LoginControllerByAdmin {
	
	@Autowired
	private HrdAdminService hrdAdminService;
	
	@RequestMapping(value = "/admin_login")
	public String AdminLogin(HrdAdminVO hvo, Model model) {
		
		HrdAdminVO loginAdmin = hrdAdminService.loginAdmin(hvo);
		
		if (loginAdmin != null) {
			model.addAttribute("loginAdmin", loginAdmin);
			return "redirect:/admin_index";
		} else {
			return "login_fail";
		}
		
	}
	
	@RequestMapping(value = "/admin_logout")
	public String AdminLogout(SessionStatus status) {
		
		status.setComplete();
		
		return "redirect:/admin_index";
	}
	
	
}


package com.green.view;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.green.biz.employee.EmployeeVO;
import com.green.biz.hrdAdmin.HrdAdminVO;

@Controller
public class BasicInformationController {
	
	
	@RequestMapping(value = "/basic_information", method = RequestMethod.GET)
	public String BasicInformation(HttpSession session, EmployeeVO evo) {
		System.out.println("기본정보 : header.jsp에서 basic_information 클릭");
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		}
		
		return "information/basic_information";
	}
	
	@RequestMapping(value = "/go_basic_information", method = RequestMethod.GET)
	public String GoBasicInformation(HttpSession session, EmployeeVO evo) {
		System.out.println("기본정보 바로가기 : main.jsp에서 go_basic_information 클릭");
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		}
		
		return "information/basic_information";
	}
	
	@RequestMapping(value = "/organization_information", method = RequestMethod.GET)
	public String OrganizationInformation(HttpSession session) {
		System.out.println("조직정보 바로가기 : basic_information.jsp에서 organization_information 클릭");
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		}
		
		return "information/organization_information";
	}
	
	@RequestMapping(value = "/salary_information", method = RequestMethod.GET)
	public String SalaryInformation(HttpSession session) {
		System.out.println("조직정보 바로가기 : basic_information.jsp에서 salary_information 클릭");
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		}
		
		return "information/salary_information";
	}
	
	@RequestMapping(value = "/work_information", method = RequestMethod.GET)
	public String WorkInformation(HttpSession session) {
		System.out.println("조직정보 바로가기 : basic_information.jsp에서 work_information 클릭");
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		} 
		
		return "information/work_information";
	}
	
	
	
	
	
	
	
	@RequestMapping(value = "/basic_information_ByAdmin", method = RequestMethod.GET)
	public String BasicInformationByAdmin(HttpSession session) {
		System.out.println("기본정보 바로가기 : admin_main.jsp에서 basic_information_ByAdmin 클릭");
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			return "information/basic_information_ByAdmin";
		}	
	}
	
	@RequestMapping(value = "/go_basic_information_ByAdmin", method = RequestMethod.GET)
	public String GoBasicInformationByAdmin(HttpSession session) {
		System.out.println("기본정보 바로가기 : admin_main.jsp에서 go_basic_information_ByAdmin 클릭");
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			return "information/basic_information_ByAdmin";
		}	
	}
	
	@RequestMapping(value = "/organization_information_ByAdmin", method = RequestMethod.GET)
	public String OrganizationInformationByAdmin(HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			return "information/organization_information_ByAdmin";
		}
	}
	
	@RequestMapping(value = "/salary_information_ByAdmin", method = RequestMethod.GET)
	public String SalaryInformationByAdmin(HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			return "information/salary_information_ByAdmin";
		}		
	}
	
	@RequestMapping(value = "/work_information_ByAdmin", method = RequestMethod.GET)
	public String WorkInformationByAdmin(HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			return "information/work_information_ByAdmin";
		}	
	}
	
	
	
	
	
}



package com.green.view;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.biz.employee.EmployeeVO;
import com.green.biz.hrdAdmin.HrdAdminVO;
import com.green.biz.util.Criteria;
import com.green.biz.util.PageMaker;
import com.green.biz.vacation.VacationService;
import com.green.biz.vacation.VacationVO;

@Controller
public class VacationController {
	
	@Autowired
	private VacationService vacationService;
	
	@RequestMapping(value = "/vacation_management", method = RequestMethod.GET)
	public String VacationManagementGet(@RequestParam(value = "key", defaultValue = "") String key,
			HttpSession session, Criteria criteria, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			// List<VacationVO> vacationList = vacationService.listAllVacaction();
			// model.addAttribute("vacationList", vacationList);
			
			System.out.println("검색 키 : " + key);
			System.out.println("페이지 범위 : " + criteria);
			
			List<VacationVO> listVacation = vacationService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = vacationService.countVacation(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("페이징 정보 : " + pageMaker);
			
			model.addAttribute("vacationList", listVacation);
			model.addAttribute("vacationListSize", listVacation.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "vacation/vacationList";
		}
	}
	
	@RequestMapping(value = "/vacation_detail", method = RequestMethod.GET)
	public String VacationDetail(@RequestParam(value = "vacation_number", defaultValue = "", required = false) int vacation_number, 
					HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			VacationVO vacationVO = vacationService.getVacation(vacation_number);
			
			model.addAttribute("vacationVO", vacationVO);
		}
		
		return "vacation/vacation_detail";
	}
	
	@RequestMapping(value = "/vacation_management_post", method = RequestMethod.POST)
	public String VacationManagementPost(@RequestParam(value = "key", defaultValue = "") String key,
			HttpSession session, Criteria criteria, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			// List<VacationVO> vacationList = vacationService.listAllVacaction();
			// model.addAttribute("vacationList", vacationList);
			
			System.out.println("검색 키 : " + key);
			System.out.println("페이지 범위 : " + criteria);
			
			List<VacationVO> listVacation = vacationService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = vacationService.countVacation(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("페이징 정보 : " + pageMaker);
			
			model.addAttribute("vacationList", listVacation);
			model.addAttribute("vacationListSize", listVacation.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "vacation/vacationList";
		}
	}
	
	@RequestMapping(value = "/vacation_delete", method = RequestMethod.GET)
	public String VacationDelete(@RequestParam(value = "vacation_number", defaultValue = "", required = false) int vacation_number,
					HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			VacationVO vacationVO = vacationService.getVacation(vacation_number);
			
			model.addAttribute("vacationVO", vacationVO);
		}
		
		return "vacation/vacation_delete";
	}
	
	@RequestMapping(value = "/vacation_delete", method = RequestMethod.POST)
	public String VacationDeletePost(@RequestParam(value = "vacation_number", defaultValue = "", required = false) int vacation_number, 
					HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			vacationService.deleteVacation(vacation_number);
			
			return "redirect:/vacation_management";
		}
		
	}
	
	@RequestMapping(value = "/vacation_enroll", method = RequestMethod.GET)
	public String VacationEnroll(HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} 
		
		return "vacation/vacation_enroll";
	}
	
	@RequestMapping(value = "/vacation_id_confirm", method = RequestMethod.GET)
	public String EmployeeIdConfirm(@RequestParam(value = "employee_id", defaultValue = "", required = false) String employee_id, 
				Model model, EmployeeVO evo, HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			evo.setEmployee_id(employee_id);
			
			VacationVO employeeVO = vacationService.getVacationByEmployeeId(employee_id);
			
			if (employeeVO != null) {
				model.addAttribute("message", 1);
			} else {
				model.addAttribute("message", -1);
			}
			
			model.addAttribute("employee_id", employee_id);
			
			return "vacation/vacation_id_confirm";
		}
	}
	
	@RequestMapping(value = "/vacation_enroll_post", method = RequestMethod.POST)
	public String VacationEnrollPost(HttpSession session, VacationVO vvo) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			vacationService.insertVacation(vvo);
		}
		
		return "redirect:/vacation_management";
	}
	
	@RequestMapping(value = "/search_vacaction", method = RequestMethod.GET)
	public String SearchVacation(@RequestParam(value = "key", defaultValue = "") String key, 
				HttpSession session, Criteria criteria, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			System.out.println("검색 키 : " + key);
			System.out.println("페이지 범위 : " + criteria);
			
			List<VacationVO> listVacation = vacationService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = vacationService.countVacation(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("페이징 정보 : " + pageMaker);
			
			model.addAttribute("vacationList", listVacation);
			model.addAttribute("vacationListSize", listVacation.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "vacation/vacationList";
		}
	}
	
	
	
}


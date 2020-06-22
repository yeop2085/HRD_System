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
import com.green.biz.salary.SalaryService;
import com.green.biz.salary.SalaryVO;
import com.green.biz.util.Criteria;
import com.green.biz.util.PageMaker;

@Controller
public class SalaryController {
	
	@Autowired
	private SalaryService salaryService;
	
	@RequestMapping(value = "/salary", method = RequestMethod.GET)
	public String Salary(HttpSession session) {
		System.out.println("급여정보 : header.jsp에서 salary 클릭");
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		}
		
		return "salary/salary_menu";
	}
	
	@RequestMapping(value = "/go_salary", method = RequestMethod.GET)
	public String GoSalary(HttpSession session) {
		System.out.println("급여정보 바로가기 : main.jsp에서 go_salary 클릭");
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		}
		
		return "salary/salary_menu";
	}
	
	
	
	
	@RequestMapping(value = "/salary_ByAdmin", method = RequestMethod.GET)
	public String SalaryByAdmin(HttpSession session) {
		System.out.println("급여정보 바로가기 : main.jsp에서 salary_ByAdmin 클릭");
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		}
		
		return "salary/salary_menu_ByAdmin";
	}
	
	@RequestMapping(value = "/go_salary_ByAdmin", method = RequestMethod.GET)
	public String GoSalaryByAdmin(HttpSession session) {
		System.out.println("급여정보 바로가기 : main.jsp에서 go_salary_ByAdmin 클릭");
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		}
		
		return "salary/salary_menu_ByAdmin";
	}
	
	@RequestMapping(value = "/salary_list", method = RequestMethod.GET)
	public String SalaryListGet(@RequestParam(value = "key", defaultValue = "") String key,
			HttpSession session, Criteria criteria, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			// List<SalaryVO> salaryList = salaryService.listAllSalary();	
			// model.addAttribute("salaryList", salaryList);
			
			System.out.println("검색 키 : " + key);
			System.out.println("페이지 범위 : " + criteria);
			
			List<SalaryVO> listSalary = salaryService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = salaryService.countSalary(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("페이징 정보 : " + pageMaker);
			
			model.addAttribute("salaryList", listSalary);
			model.addAttribute("salaryListSize", listSalary.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "salary/salary_list";
		}
	}
	
	@RequestMapping(value = "/salary_list", method = RequestMethod.POST)
	public String SalaryListPost(@RequestParam(value = "key", defaultValue = "") String key,
			HttpSession session, Criteria criteria, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			// List<SalaryVO> salaryList = salaryService.listAllSalary();
			// model.addAttribute("salaryList", salaryList);
			
			System.out.println("검색 키 : " + key);
			System.out.println("페이지 범위 : " + criteria);
			
			List<SalaryVO> listSalary = salaryService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = salaryService.countSalary(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("페이징 정보 : " + pageMaker);
			
			model.addAttribute("salaryList", listSalary);
			model.addAttribute("salaryListSize", listSalary.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "salary/salary_list";
		}
	}
	
	@RequestMapping(value = "/salary_detail", method = RequestMethod.GET)
	public String SalaryDetail(@RequestParam(value = "salary_number", defaultValue = "", required = false) int salary_number, 
				HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			SalaryVO salaryVO = salaryService.getSalary(salary_number);
			
			model.addAttribute("salaryVO", salaryVO);
		}
		
		return "salary/salary_detail";
	}
	
	@RequestMapping(value = "/salary_enroll", method = RequestMethod.GET)
	public String SalaryEnroll(HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} 
		
		return "salary/salary_enroll";
	}
	
	@RequestMapping(value = "/salary_id_confirm", method = RequestMethod.GET)
	public String SalaryIdConfirm(@RequestParam(value = "employee_id", defaultValue = "", required = false) String employee_id, 
				Model model, SalaryVO svo, HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			svo.setEmployee_id(employee_id);
			
			SalaryVO salaryVO = salaryService.getSalaryByEmployeeId(employee_id);
			
			if (salaryVO != null) {
				model.addAttribute("message", 1);
			} else {
				model.addAttribute("message", -1);
			}
			
			model.addAttribute("employee_id", employee_id);
			
			return "salary/salary_id_confirm";
		}
	}
	
	@RequestMapping(value = "/salary_enroll_post", method = RequestMethod.POST)
	public String SalaryEnrollPost(HttpSession session, SalaryVO svo) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			salaryService.insertSalary(svo);
		}
		
		return "redirect:/salary_list";
	}
	
	@RequestMapping(value = "/salary_delete", method = RequestMethod.GET)
	public String SalaryDelete(@RequestParam(value = "salary_number", defaultValue = "", required = false) int salary_number, 
				HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			SalaryVO salaryVO = salaryService.getSalary(salary_number);
			
			model.addAttribute("salaryVO", salaryVO);
		}
		
		return "salary/salary_delete";
	}
	
	@RequestMapping(value = "/salary_delete", method = RequestMethod.POST)
	public String SalaryDelete(@RequestParam(value = "salary_number", defaultValue = "", required = false) int salary_number, 
				HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			salaryService.deleteSalary(salary_number);
			
			return "redirect:/salary_list";
		}
	}
	
	@RequestMapping(value = "/search_employee_id", method = RequestMethod.GET)
	public String SearchEmployeeId(@RequestParam(value = "key", defaultValue = "") String key,
				HttpSession session, Criteria criteria, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			System.out.println("검색 키: " + key);
			System.out.println("페이지 범위 : " + criteria);
			
			List<SalaryVO> listSalary = salaryService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			// 총 목록수를 DB에서 조회
			int totalCount = salaryService.countSalary(key);
			pageMaker.setTotalCount(totalCount);	
			System.out.println("페이징 정보 : " + pageMaker);
			
			model.addAttribute("salaryList", listSalary);
			model.addAttribute("salaryListSize", listSalary.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "salary/salary_list";
		}
	}
	
	
	
}





package com.green.view;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.biz.disciplinary.DisciplinaryService;
import com.green.biz.disciplinary.DisciplinaryVO;
import com.green.biz.employee.EmployeeVO;
import com.green.biz.hrdAdmin.HrdAdminVO;
import com.green.biz.util.Criteria;
import com.green.biz.util.PageMaker;

@Controller
public class DisciplinaryController {
	
	@Autowired
	private DisciplinaryService disciplinaryService;
	
	
	@RequestMapping(value = "/disciplinary")
	public String Disciplinary(HttpSession session) {
		System.out.println("근태정보 : heder.jsp에서 disciplinary 클릭");
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		}
		
		return "disciplinary/disciplinary_menu";
	}
	
	@RequestMapping(value = "/go_disciplinary", method = RequestMethod.GET)
	public String GoDisciplinary(HttpSession session) {
		System.out.println("근태정보 바로가기 : main.jsp에서 go_disciplinary 클릭");
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		}
		
		return "disciplinary/disciplinary_menu";
	}
	
	
	
	
	
	
	@RequestMapping(value = "/disciplinary_ByAdmin", method = RequestMethod.GET)
	public String DisciplinaryByAdmin(HttpSession session) {
		System.out.println("근태정보 바로가기 : admin_main.jsp에서 disciplinary_ByAdmin 클릭");
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		}
		
		return "disciplinary/disciplinary_menu_ByAdmin";
	}
	
	@RequestMapping(value = "/go_disciplinary_ByAdmin", method = RequestMethod.GET)
	public String GoDisciplinaryByAdmin(HttpSession session) {
		System.out.println("근태정보 바로가기 : admin_main.jsp에서 go_disciplinary_ByAdmin 클릭");
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		}
		
		return "disciplinary/disciplinary_menu_ByAdmin";
	}
	
	@RequestMapping(value = "/disciplinary_list", method = RequestMethod.GET)
	public String DisciplinaryList(@RequestParam(value = "key", defaultValue = "") String key,
			HttpSession session, Criteria criteria, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			// List<DisciplinaryVO> disciplinaryList = disciplinaryService.listAllDisciplinary();	
			// model.addAttribute("disciplinaryList", disciplinaryList);
			
			System.out.println("검색 키 : " + key);
			System.out.println("페이지 범위 : " + criteria);
			
			List<DisciplinaryVO> listDisciplinary = disciplinaryService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = disciplinaryService.countDisciplinary(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("페이징 정보 : " + pageMaker);
			
			model.addAttribute("disciplinaryList", listDisciplinary);
			model.addAttribute("disciplinaryListSize", listDisciplinary.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "disciplinary/disciplinary_list";
		}
	}
	
	@RequestMapping(value = "/disciplinary_detail", method = RequestMethod.GET)
	public String DisciplinaryDetail(@RequestParam(value = "disciplinary_number", defaultValue = "", required = false) int disciplinary_number, 
				HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			DisciplinaryVO disciplinaryVO = disciplinaryService.getDisciplinary(disciplinary_number);
			
			model.addAttribute("disciplinaryVO", disciplinaryVO);
		}
		
		return "disciplinary/disciplinary_detail";
	}
	
	@RequestMapping(value = "/disciplinary_list_post", method = RequestMethod.POST)
	public String DisciplinaryListPost(@RequestParam(value = "key", defaultValue = "") String key,
			HttpSession session, Criteria criteria, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			// List<DisciplinaryVO> disciplinaryList = disciplinaryService.listAllDisciplinary();
			// model.addAttribute("disciplinaryList", disciplinaryList);
			
			System.out.println("검색 키 : " + key);
			System.out.println("페이지 범위 : " + criteria);
			
			List<DisciplinaryVO> listDisciplinary = disciplinaryService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = disciplinaryService.countDisciplinary(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("페이징 정보 : " + pageMaker);
			
			model.addAttribute("disciplinaryList", listDisciplinary);
			model.addAttribute("disciplinaryListSize", listDisciplinary.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "disciplinary/disciplinary_list";
		}
	}
	
	@RequestMapping(value = "/disciplinary_enroll", method = RequestMethod.GET)
	public String DisciplinaryListGet(HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} 
		
		return "disciplinary/disciplinary_enroll";
	}
	
	@RequestMapping(value = "/disciplinary_id_confirm", method = RequestMethod.GET)
	public String DisciplinaryIdConfirm(@RequestParam(value = "employee_id", defaultValue = "", required = false) String employee_id,
				Model model, DisciplinaryVO dvo) {
		
		dvo.setEmployee_id(employee_id);
		
		DisciplinaryVO disciplinaryVO = disciplinaryService.getDisciplinaryByEmployeeId(employee_id);
		
		if (disciplinaryVO != null) {
			model.addAttribute("message", 1);
		} else {
			model.addAttribute("message", -1);
		}
		
		model.addAttribute("employee_id", employee_id);
		
		return "disciplinary/disciplinary_id_confirm";
	}
	
	@RequestMapping(value = "/disciplinary_enroll_post", method = RequestMethod.POST)
	public String DisciplinaryEnrollPost(HttpSession session, DisciplinaryVO dvo) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			disciplinaryService.insertDisciplinary(dvo);
		}
		
		return "redirect:/disciplinary_list";
		
	}
	
	@RequestMapping(value = "/disciplinary_delete", method = RequestMethod.GET)
	public String DisciiplinaryDelete(@RequestParam(value = "disciplinary_number", defaultValue = "", required = false) int disciplinary_number, 
				HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			DisciplinaryVO disciplinaryVO = disciplinaryService.getDisciplinary(disciplinary_number);
			
			model.addAttribute("disciplinaryVO", disciplinaryVO);
		}
		
		return "disciplinary/disciplinary_delete";
	}
	
	@RequestMapping(value = "/disciplinary_delete", method = RequestMethod.POST)
	public String DisciplinaryDelete(@RequestParam(value = "disciplinary_number", defaultValue = "", required = false) int disciplinary_number, 
				HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			disciplinaryService.deleteDisciplinary(disciplinary_number);
			
			return "redirect:/disciplinary_list";
		}
	}
	
	@RequestMapping(value = "/search_disciplinary", method = RequestMethod.GET)
	public String SearchDisciplinary(@RequestParam(value = "key", defaultValue = "") String key,
				HttpSession session, Criteria criteria, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			System.out.println("검색 키 : " + key);
			System.out.println("페이지 범위 : " + criteria);
			
			List<DisciplinaryVO> listDisciplinary = disciplinaryService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = disciplinaryService.countDisciplinary(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("페이징 정보 : " + pageMaker);
			
			model.addAttribute("disciplinaryList", listDisciplinary);
			model.addAttribute("disciplinaryListSize", listDisciplinary.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "disciplinary/disciplinary_list";
		}	
	}
	
	
	
	
}


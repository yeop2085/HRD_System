package com.green.view;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.biz.hrdAdmin.HrdAdminVO;
import com.green.biz.retirement.RetirementService;
import com.green.biz.retirement.RetirementVO;
import com.green.biz.util.Criteria;
import com.green.biz.util.PageMaker;

@Controller
public class RetirementController {
	
	@Autowired
	private RetirementService retirementService;
	
	@RequestMapping(value = "/retirement_information", method = RequestMethod.GET)
	public String RetirementInformation(@RequestParam(value = "key", defaultValue = "") String key,
			HttpSession session, Criteria criteria, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			// List<RetirementVO> retirementList = retirementService.listAllRetirement();	
			// model.addAttribute("retirementList", retirementList);
			
			System.out.println("검색 키 : " + key);
			System.out.println("페이지 범위 : " + criteria);
			
			List<RetirementVO> listRetirement = retirementService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = retirementService.countRetirementList(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("페이징 정보 : " + pageMaker);
			
			model.addAttribute("retirementList", listRetirement);
			model.addAttribute("retirementListSize", listRetirement.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "retirement/retirement_list";
		}
	}
	
	@RequestMapping(value = "/retirement_information", method = RequestMethod.POST)
	public String RetirementInformationPost(@RequestParam(value = "key", defaultValue = "") String key,
			HttpSession session, Criteria criteria, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			// List<RetirementVO> retirementList = retirementService.listAllRetirement();
			// model.addAttribute("retirementList", retirementList);
			
			System.out.println("검색 키 : " + key);
			System.out.println("페이지 범위 : " + criteria);
			
			List<RetirementVO> listRetirement = retirementService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = retirementService.countRetirementList(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("페이징 정보 : " + pageMaker);
			
			model.addAttribute("retirementList", listRetirement);
			model.addAttribute("retirementListSize", listRetirement.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "retirement/retirement_list";
		}
	}
	
	@RequestMapping(value = "/retirement_detail", method = RequestMethod.GET)
	public String RetirementDetail(@RequestParam(value = "retirement_number", defaultValue = "", required = false) int retirement_number, 
				HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			RetirementVO retirementVO = retirementService.getRetirement(retirement_number);
			
			model.addAttribute("retirementVO", retirementVO);
		}
		
		return "retirement/retirement_detail";
	}
	
	@RequestMapping(value = "/retirement_enroll", method = RequestMethod.GET)
	public String RetirementEnroll(HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} 
		
		return "retirement/retirement_enroll";
	}
	
	@RequestMapping(value = "/retirement_id_confirm", method = RequestMethod.GET)
	public String RetirementIdConfirm(@RequestParam(value = "employee_id", defaultValue = "", required = false) String employee_id, 
				Model model, RetirementVO rvo, HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			rvo.setEmployee_id(employee_id);
			
			RetirementVO retirementVO = retirementService.getRetirementByEmployeeId(employee_id);
			
			if (retirementVO != null) {
				model.addAttribute("message", 1);
			} else {
				model.addAttribute("message", -1);
			}
			
			model.addAttribute("employee_id", employee_id);
			
			return "retirement/retirement_id_confirm";
		}
	}
	
	@RequestMapping(value = "/retirement_enroll_post", method = RequestMethod.POST)
	public String RetirementEnrollPost(HttpSession session, RetirementVO rvo) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			retirementService.insertRetirement(rvo);
		}
		
		return "redirect:/retirement_information";
	}
	
	@RequestMapping(value = "/retirement_delete", method = RequestMethod.GET)
	public String RetirementDelete(@RequestParam(value = "retirement_number", defaultValue = "", required = false) int retirement_number, 
				HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			RetirementVO retirementVO = retirementService.getRetirement(retirement_number);
			
			model.addAttribute("retirementVO", retirementVO);
		}
		
		return "retirement/retirement_delete";
	}
	
	@RequestMapping(value = "/retirement_delete", method = RequestMethod.POST)
	public String RetirementDelete(@RequestParam(value = "retirement_number", defaultValue = "", required = false) int retirement_number, 
				HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			retirementService.deleteRetirement(retirement_number);
			
			return "redirect:/retirement_information";
		}
	}
	
	@RequestMapping(value = "/search_retirement_ByEmployeeId", method = RequestMethod.GET)
	public String SearchRetirementByEmployeeId(@RequestParam(value = "key", defaultValue = "") String key,
				HttpSession session, Criteria criteria, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			System.out.println("검색 키 : " + key);
			System.out.println("페이지 범위 : " + criteria);
			
			List<RetirementVO> listRetirement = retirementService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = retirementService.countRetirementList(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("페이징 정보 : " + pageMaker);
			
			model.addAttribute("retirementList", listRetirement);
			model.addAttribute("retirementListSize", listRetirement.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "retirement/retirement_list";
		}
	}
	
	
	
}


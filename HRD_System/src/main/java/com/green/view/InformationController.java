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
import com.green.biz.information.InformationService;
import com.green.biz.information.InformationVO;
import com.green.biz.util.Criteria;
import com.green.biz.util.PageMaker;

@Controller
public class InformationController {
	
	@Autowired
	private InformationService informationService;
	
	@RequestMapping(value = "/information", method = RequestMethod.GET)
	public String Information(@RequestParam(value = "key", defaultValue = "") String key,
			HttpSession session, Criteria criteria, Model model) {
		System.out.println("�������� : header.jsp���� information Ŭ��");
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		} else {
			
			// List<InformationVO> informationList = informationService.listAllInformation();
			// model.addAttribute("informationList", informationList);
			
			System.out.println("�˻� Ű : " + key);
			System.out.println("������ ���� : " + criteria);
			
			List<InformationVO> listInformation = informationService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = informationService.countInformation(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("����¡ ���� : " + pageMaker);
			
			model.addAttribute("informationList", listInformation);
			model.addAttribute("informationListSize", listInformation.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "information/information";
		}
	}
	
	@RequestMapping(value = "/information", method = RequestMethod.POST)
	public String InformationPost(@RequestParam(value = "key", defaultValue = "") String key,
			HttpSession session, Criteria criteria, Model model) {
		System.out.println("�������� : header.jsp���� information Ŭ��");
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		} else {
			
			// List<InformationVO> informationList = informationService.listAllInformation();
			// model.addAttribute("informationList", informationList);
			
			System.out.println("�˻� Ű : " + key);
			System.out.println("������ ���� : " + criteria);
			
			List<InformationVO> listInformation = informationService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = informationService.countInformation(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("����¡ ���� : " + pageMaker);
			
			model.addAttribute("informationList", listInformation);
			model.addAttribute("informationListSize", listInformation.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "information/information";
		}
	}
	
	@RequestMapping(value = "/go_information", method = RequestMethod.GET)
	public String GoInformation(@RequestParam(value = "key", defaultValue = "") String key,
			HttpSession session, Criteria criteria, Model model) {
		System.out.println("�������� �ٷΰ��� : main.jsp ���� go_information Ŭ��");
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		} else {
			
			// List<InformationVO> informationList = informationService.listAllInformation();
			// model.addAttribute("informationList", informationList);
			
			System.out.println("�˻� Ű : " + key);
			System.out.println("������ ���� : " + criteria);
			
			List<InformationVO> listInformation = informationService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = informationService.countInformation(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("����¡ ���� : " + pageMaker);
			
			model.addAttribute("informationList", listInformation);
			model.addAttribute("informationListSize", listInformation.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "information/information";
		}
	}
	
	@RequestMapping(value = "/go_information", method = RequestMethod.POST)
	public String GoInformationPost(@RequestParam(value = "key", defaultValue = "") String key,
			HttpSession session, Criteria criteria, Model model) {
		System.out.println("�������� �ٷΰ��� : main.jsp ���� go_information Ŭ��");
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		} else {
			
			// List<InformationVO> informationList = informationService.listAllInformation();
			// model.addAttribute("informationList", informationList);
			
			System.out.println("�˻� Ű : " + key);
			System.out.println("������ ���� : " + criteria);
			
			List<InformationVO> listInformation = informationService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = informationService.countInformation(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("����¡ ���� : " + pageMaker);
			
			model.addAttribute("informationList", listInformation);
			model.addAttribute("informationListSize", listInformation.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "information/information";
		}
	}
	
	@RequestMapping(value = "/information_write", method = RequestMethod.GET)
	public String InformationWriteForm_GET(HttpSession session) {
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		}
		
		return "information/information_write";
		
	}
	
	@RequestMapping(value = "/information_write", method = RequestMethod.POST)
	public String InformationWriteForm_POST(HttpSession session) {
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		}
		
		return "information/information_write";
		
	}
	
	@RequestMapping(value = "/information_view", method = RequestMethod.GET)
	public String InformationView(@RequestParam(value = "information_number") int information_number, 
							Model model, HttpSession session) {
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "information/information";
		} else {
			
			InformationVO informationVO = informationService.getInformation(information_number);
			
			model.addAttribute("informationVO", informationVO);
			
			return "information/informationView";
		}
		
	}
	
	@RequestMapping(value = "/search_title_worker")
	public String SearchTitleWorker(@RequestParam(value = "key", defaultValue = "") String key, 
				HttpSession session, Criteria criteria, Model model) {
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main";
		} else {
			System.out.println("�˻� Ű : " + key);
			System.out.println("������ ���� : " + criteria);
			
			List<InformationVO> listInformation = informationService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = informationService.countInformation(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("����¡ ���� : " + pageMaker);
			
			model.addAttribute("informationList", listInformation);
			model.addAttribute("informationListSize", listInformation.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "information/information";
		}
	}
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/information_ByAdmin", method = RequestMethod.GET)
	public String InformationByAdmin(@RequestParam(value = "key", defaultValue = "") String key,
			HttpSession session, Criteria criteria, Model model) {
		System.out.println("�������� �ٷΰ��� : main.jsp ���� information_ByAdmin Ŭ��");
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			// List<InformationVO> informationList = informationService.listAllInformation();
			
			System.out.println("������ ���� : " + criteria);
			
			List<InformationVO> informationList = informationService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = informationService.countInformation(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("����¡ ���� : " + pageMaker);
			
			model.addAttribute("informationList", informationList);
			model.addAttribute("informationListSize", informationList.size());
			model.addAttribute("pageMaker", pageMaker);
			
			// model.addAttribute("informationList", informationList);
			
			return "information/information_ByAdmin";
		}
	}
	
	@RequestMapping(value = "/go_information_ByAdmin", method = RequestMethod.GET)
	public String GoInformationByAdmin(@RequestParam(value = "key", defaultValue = "") String key,
			HttpSession session, Criteria criteria, Model model) {
		System.out.println("�������� �ٷΰ��� : main.jsp ���� go_information_ByAdmin Ŭ��");
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			// List<InformationVO> informationList = informationService.listAllInformation();
			// model.addAttribute("informationList", informationList);
			
			System.out.println("������ ���� : " + criteria);
			
			List<InformationVO> informationList = informationService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = informationService.countInformation(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("����¡ ���� : " + pageMaker);
			
			model.addAttribute("informationList", informationList);
			model.addAttribute("informationListSize", informationList.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "information/information_ByAdmin";
		}
	}
	
	@RequestMapping(value = "/information_writeform_ByAdmin")
	public String InformationWriteFormByAdmin1(HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		}
		
		return "information/information_wirte_ByAdmin";
		
	}
	
	
	@RequestMapping(value = "/information_write_ByAdmin", method = RequestMethod.POST)
	public String InformationWriteByAdmin(HttpSession session, InformationVO ivo) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			informationService.insertInformation(ivo);
		}
		
		return "redirect:/information_ByAdmin";
	}
	
	@RequestMapping(value = "/information_view_ByAdmin", method = RequestMethod.GET)
	public String InformationViewByAdmin(@RequestParam(value = "information_number") int information_number, 
				Model model, HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "information/informationView_ByAdmin";
		} else {
			
			InformationVO informationVO = informationService.getInformation(information_number);
			
			model.addAttribute("informationVO", informationVO);
			
			return "information/informationView_ByAdmin";
		}
		
	}
	
	@RequestMapping(value = "/information_delete_ByAdmin", method = RequestMethod.GET)
	public String InformationDeleteByAdmin(@RequestParam(value = "information_number") int information_number, 
				HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			informationService.deleteInformation(information_number);
			
			return "redirect:/information_ByAdmin";
		}		
	}
	
	@RequestMapping(value = "/search_title", method = RequestMethod.GET)
	public String SearchTitleGet(@RequestParam(value = "key", defaultValue = "") String key, 
				HttpSession session, Criteria criteria, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			System.out.println("�˻� Ű : " + key);
			System.out.println("������ ���� : " + criteria);
			
			List<InformationVO> listInformation = informationService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = informationService.countInformation(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("����¡ ���� : " + pageMaker);
			
			model.addAttribute("informationList", listInformation);
			model.addAttribute("informationListSize", listInformation.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "information/information_ByAdmin";
		}
	}
	
	@RequestMapping(value = "/search_title", method = RequestMethod.POST)
	public String SearchTitlePost(@RequestParam(value = "key", defaultValue = "") String key, 
				HttpSession session, Criteria criteria, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			System.out.println("�˻� Ű : " + key);
			System.out.println("������ ���� : " + criteria);
			
			List<InformationVO> listInformation = informationService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = informationService.countInformation(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("����¡ ���� : " + pageMaker);
			
			model.addAttribute("informationList", listInformation);
			model.addAttribute("informationListSize", listInformation.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "information/information_ByAdmin";
		}
	}
	
	
	
	
	
	
}


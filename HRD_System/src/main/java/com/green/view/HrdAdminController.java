package com.green.view;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.green.biz.employee.EmployeeService;
import com.green.biz.employee.EmployeeVO;
import com.green.biz.hrdAdmin.HrdAdminVO;
import com.green.biz.util.Criteria;
import com.green.biz.util.PageMaker;

@Controller
public class HrdAdminController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/hrd_admin", method = RequestMethod.GET)
	public String HrdAdmin(HttpSession session) {
		System.out.println("인사관리 : header.jsp에서 hrd_admin 클릭");
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		}
		
		return "hrd_admin/hrd_admin_menu";
	}
	
	@RequestMapping(value = "/go_hrd_admin", method = RequestMethod.GET)
	public String GoHrdAdmin(HttpSession session) {
		System.out.println("인사관리 바로가기 : main.jsp에서 go_hrd_admin 클릭");
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		}
		
		return "hrd_admin/hrd_admin_menu";
	}
	
	
	
	
	@RequestMapping(value = "/hrd_admin_ByAdmin", method = RequestMethod.GET)
	public String HrdAdminByAdmin(HttpSession session) {
		System.out.println("인사관리 바로가기 : main.jsp에서 hrd_admin_ByAdmin 클릭");
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} 
		
		return "hrd_admin/hrd_admin_menu_ByAdmin";
	}
	
	@RequestMapping(value = "/go_hrd_admin_ByAdmin", method = RequestMethod.GET)
	public String GoHrdAdminByAdmin(HttpSession session) {
		System.out.println("인사관리 바로가기 : main.jsp에서 go_hrd_admin_ByAdmin 클릭");
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		}
		
		return "hrd_admin/hrd_admin_menu_ByAdmin";
	}
	
	@RequestMapping(value = "/hrd_information", method = RequestMethod.GET)
	public String HrdInformation(@RequestParam(value = "key", defaultValue = "") String key,
			HttpSession session, Criteria criteria, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			// List<EmployeeVO> listAllEmployee = employeeService.listAllEmployee();
			// model.addAttribute("listAllEmployee", listAllEmployee);
			
			System.out.println("페이지 범위 : " + criteria);
			
			List<EmployeeVO> listAllEmployee = employeeService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = employeeService.countEmployee(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("페이징 정보 : " + pageMaker);
			
			model.addAttribute("listAllEmployee", listAllEmployee);
			model.addAttribute("listAllEmployeeSize", listAllEmployee.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "hrd_admin/hrd_information";
		}
	}
	
	@RequestMapping(value = "/hrd_information", method = RequestMethod.POST)
	public String HrdInformationPost(@RequestParam(value = "key", defaultValue = "") String key,
			HttpSession session, Criteria criteria, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			// List<EmployeeVO> listAllEmployee = employeeService.listAllEmployee();
			// model.addAttribute("listAllEmployee", listAllEmployee);
			
			System.out.println("페이지 범위 : " + criteria);
			
			List<EmployeeVO> listAllEmployee = employeeService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = employeeService.countEmployee(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("페이징 정보 : " + pageMaker);
			
			model.addAttribute("listAllEmployee", listAllEmployee);
			model.addAttribute("listAllEmployeeSize", listAllEmployee.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "hrd_admin/hrd_information";
		}
	}
	
	@RequestMapping(value = "/hrd_detail", method = RequestMethod.GET)
	public String HrdDetail(@RequestParam(value = "employee_id", defaultValue = "", required = false) String employee_id, 
					HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			EmployeeVO employeeVO = employeeService.getEmployee(employee_id);
			
			model.addAttribute("employeeVO", employeeVO);
		}
		
		return "hrd_admin/hrd_detail";
	}
	
	@RequestMapping(value = "/hrd_enrollment", method = RequestMethod.GET)
	public String HrdEnrollmentGet(HttpSession session, EmployeeVO evo) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} 
		
		return "hrd_admin/hrd_enroll";
		
	}
	
	@RequestMapping(value = "/hrd_enrollment", method = RequestMethod.POST)
	public String HrdEnrollmentPost(HttpSession session, EmployeeVO evo) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} 
		
		return "hrd_admin/hrd_enroll";
		
	}
	
	@RequestMapping(value = "/hrd_enroll", method = RequestMethod.POST)
	public String HrdEnroll(@RequestParam(value = "image") MultipartFile uploadFile, 
				EmployeeVO evo, HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		// System.out.println("admin User="+loginAdmin+", 사원정보="+evo);
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			String fileName = "";
			// 파일 업로드 작업
			if (!uploadFile.isEmpty()) {
				String root_path = session.getServletContext().getRealPath("WEB-INF/resources/images/");
				System.out.println("Root 경로 : " + root_path);
				
				// 업로드된 파일명을 얻어온다.
				fileName = uploadFile.getOriginalFilename();
				
				try {
					File file = new File(root_path + fileName);
					uploadFile.transferTo(file);
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			evo.setEmployee_and_so_on(fileName);
			System.out.println(evo);
			
			employeeService.insertEmployee(evo);
			
		}
		
		return "redirect:/hrd_admin_ByAdmin";
	}
	
	@RequestMapping(value = "/hrd_delete", method = RequestMethod.GET)
	public String HrdDelete(@RequestParam(value = "employee_id", defaultValue = "", required = false) String employee_id, 
					HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			EmployeeVO employeeVO = employeeService.getEmployee(employee_id);
			
			model.addAttribute("employeeVO", employeeVO);
			
			return "hrd_admin/hrd_delete";
		}
	}
	
	@RequestMapping(value = "/hrd_delete", method = RequestMethod.POST)
	public String HrdDeletePost(@RequestParam(value = "employee_id", defaultValue = "", required = false) String employee_id, 
				HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			employeeService.deleteEmployee(employee_id);
			
			return "redirect:/hrd_admin_ByAdmin";
			
		}
	}
	
	@RequestMapping(value = "/search_employee", method = RequestMethod.GET)
	public String SearchEmployeeGet(@RequestParam(value = "key", defaultValue = "") String key,
				HttpSession session, Criteria criteria, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			System.out.println("검색 키 : " + key);
			System.out.println("페이지 범위 : " + criteria);
			
			List<EmployeeVO> listEmployee = employeeService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = employeeService.countEmployee(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("페이징 정보 : " + pageMaker);
			
			model.addAttribute("listAllEmployee", listEmployee);
			model.addAttribute("listAllEmployeeSize", listEmployee.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "hrd_admin/hrd_information";
		}
	}
	
	@RequestMapping(value = "/search_employee", method = RequestMethod.POST)
	public String SearchEmployee(@RequestParam(value = "key", defaultValue = "") String key,
				HttpSession session, Criteria criteria, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			System.out.println("검색 키 : " + key);
			System.out.println("페이지 범위 : " + criteria);
			
			List<EmployeeVO> listEmployee = employeeService.getListWithPaging(criteria, key);
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(criteria);
			
			int totalCount = employeeService.countEmployee(key);
			pageMaker.setTotalCount(totalCount);
			System.out.println("페이징 정보 : " + pageMaker);
			
			model.addAttribute("listAllEmployee", listEmployee);
			model.addAttribute("listAllEmployeeSize", listEmployee.size());
			model.addAttribute("pageMaker", pageMaker);
			
			return "hrd_admin/hrd_information";
		}
	}
	
	@RequestMapping(value = "/hrd_enroll_jungbuk", method = RequestMethod.GET)
	public String HrdEnrollJungbuk(@RequestParam(value = "employee_id", defaultValue = "", required = false) String employee_id, 
				Model model, HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			EmployeeVO evo = new EmployeeVO();
			evo.setEmployee_id(employee_id);
			
			EmployeeVO employeeVO = employeeService.getEmployee(evo.getEmployee_id());
			
			if (employeeVO != null) {
				model.addAttribute("message", 1);
			} else {
				model.addAttribute("message", -1);
			}
			
			model.addAttribute("employee_id", employee_id);
			
			return "hrd_admin/hrd_idcheck";
		}
	}
	
	
	
}


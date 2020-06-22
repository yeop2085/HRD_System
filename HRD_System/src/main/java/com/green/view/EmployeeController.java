package com.green.view;

import java.io.File;
import java.io.IOException;

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

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	// 회원가입 출력 화면 
	@RequestMapping(value = "/employee_join", method = RequestMethod.GET)
	public String EmployeeJoin_GET(HttpSession session) {
		
		System.out.println("회원가입 : employee_sub_menu.jsp에서 employee_join 클릭");
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		}
		
		return "employee/employee_join";
	}
	
	// 메인화면에서 바로 넘어오기 때문에 일부러 아이디 확인 코드를 안넣었음.
	@RequestMapping(value = "/employee_join_main", method = RequestMethod.POST)
	public String EmployeeJoinMain() {
		
		return "employee/employee_join_main";
	}
	
	
	// 회원가입 출력 화면 
	@RequestMapping(value = "/employee_join", method = RequestMethod.POST)
	public String EmployeeJoin_POST(HttpSession session) {
		
		System.out.println("회원가입 : main.jsp에서 employee_join 클릭");
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		}
		
		return "employee/employee_join";
	}
	
	// 메인화면에서 바로 넘어오기 때문에 일부러 아이디 확인 코드를 안넣었음.
	@RequestMapping(value = "/employee_join_main_post", method = RequestMethod.POST)
	public String EmployeeJoinMainPost(@RequestParam(value = "image") MultipartFile uploadFile,
				EmployeeVO evo, HttpSession session) {
		
		String fileName = "";
		
		if (!uploadFile.isEmpty()) {
			String root_path = session.getServletContext().getRealPath("WEB-INF/resources/images/");
			System.out.println("root 경로 : " + root_path);
			
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
	
		return "redirect:/admin_index";
	}
	
	@RequestMapping(value = "/employee_join_post", method = RequestMethod.POST)
	public String EmployeeJoinPost(@RequestParam(value = "image") MultipartFile uploadFile,
				EmployeeVO evo, HttpSession session) {
		
		System.out.println("회원가입 : employee_join.jsp에서 employee_join_post() 클릭");
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		} else {
			String fileName = "";
			
			if (!uploadFile.isEmpty()) {
				String root_path = session.getServletContext().getRealPath("WEB-INF/resources/images/");
				System.out.println("root 경로 : " + root_path);
				
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
		
		return "redirect:/mymenu";
	}
	
	@RequestMapping(value = "/employee_menu")
	public String EmployeeMenuPost(HttpSession session, EmployeeVO evo, Model model) {
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		} else {
			
			EmployeeVO employeeVO = employeeService.getEmployee(loginUser.getEmployee_id());
			
			model.addAttribute("employeeVO", employeeVO);
			
			return "employee/employee_mymenu";		
		}
	}
	
	@RequestMapping(value = "/employee_update", method = RequestMethod.POST)
	public String EmployeeMyMenu(HttpSession session) {
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main";
		} 
		
		return "employee/employee_update";
		
	}
	
	// 이거는 로그인 했는지 확인 절차가 필요없다.
	@RequestMapping(value = "/employee_join_jungbuk", method = RequestMethod.GET)
	public String EmployeeJoinJungbuk(@RequestParam(value = "employee_id", defaultValue = "", required = false) String employee_id,
				Model model) {
		
		EmployeeVO evo = new EmployeeVO();
		evo.setEmployee_id(employee_id);
		
		EmployeeVO employeeVO = employeeService.getEmployee(evo.getEmployee_id());
		
		if (employeeVO != null) {
			model.addAttribute("message", 1);
		} else {
			model.addAttribute("message", -1);
		}
		
		model.addAttribute("employee_id", employee_id);
		
		return "employee/employee_join_jungbuk";
	}
	
	@RequestMapping(value = "/employee_check_jungbuk", method = RequestMethod.GET)
	public String EmployeeCheckJungbuk(@RequestParam(value = "employee_id", defaultValue = "", required = false) String employee_id, 
				Model model) {
		
		EmployeeVO evo = new EmployeeVO();
		evo.setEmployee_id(employee_id);
		
		EmployeeVO employeeVO = employeeService.getEmployee(evo.getEmployee_id());
		
		if (employeeVO != null) {
			model.addAttribute("message", 1);
		} else {
			model.addAttribute("message", -1);
		}
		
		model.addAttribute("employee_id", employee_id);
		
		return "employee/employee_check_jungbuk";
	}
	
	
}


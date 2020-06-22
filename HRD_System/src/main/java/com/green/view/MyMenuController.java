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
import com.green.biz.hrdAdmin.HrdAdminService;
import com.green.biz.hrdAdmin.HrdAdminVO;

@Controller
public class MyMenuController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private HrdAdminService hrdAdminService;
	
	@RequestMapping(value = "/mymenu", method = RequestMethod.GET)
	public String MyMenu(HttpSession session) {
		System.out.println("내정보 : header.jsp 에서 mymenu 클릭");
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		} 
		
		return "employee/employee_menu";
	}
	
	// 메인화면에서 바로 넘어오기 때문에 아이디 확인 코드는 일부러 뺏음
	@RequestMapping(value = "/employee_id_pwd_search_main", method = RequestMethod.POST)
	public String EmployeeIdPwdSearchMain() {
		
		return "employee/employee_idpwd_search_main";
	}	
	
	@RequestMapping(value = "/employee_idpwd_search")
	public String EmployeeIdpwdSearch_GET(HttpSession session) {
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		}
		
		return "employee/employee_idpwd_search";
		
	}
	
	// 메인화면에서 바로 넘어오기 때문에 아이디 확인 코드는 일부러 뺏음
	@RequestMapping(value = "/employee_id_search_main", method = RequestMethod.GET)
	public String EmployeeIdpwdSearchMain(@RequestParam(value = "employee_id", defaultValue = "", required = false) String employee_id, 
					Model model, HttpSession session) {
		
		EmployeeVO evo = new EmployeeVO();
		evo.setEmployee_id(employee_id);
		
		EmployeeVO employeeVO = employeeService.getEmployee(evo.getEmployee_id());
		
		if (employeeVO != null) {
			model.addAttribute("message", 1);
		} else {
			model.addAttribute("message", -1);
		}
		
		model.addAttribute("employee_id", employee_id);
		
		return "employee/employee_id_search_main";	
	}
	
	@RequestMapping(value = "/employee_id_search", method = RequestMethod.GET)
	public String EmployeeIdpwdSearch(@RequestParam(value = "employee_id", defaultValue = "", required = false) String employee_id, 
					Model model, HttpSession session) {
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main";
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
			
			return "employee/employee_id_search";
			
		}		
	}
	
	@RequestMapping(value = "/employee_pwd_search_main", method = RequestMethod.GET)
	public String EmployeePwdSearchMain(@RequestParam(value = "employee_pwd", defaultValue = "", required = false) String employee_pwd, 
			Model model, HttpSession session) {
		
		EmployeeVO evo = new EmployeeVO();
		evo.setEmployee_pwd(employee_pwd);
		
		EmployeeVO user = employeeService.getEmployeePwd(employee_pwd);
		
		if (user != null) {
			model.addAttribute("message", 1);
		} else {
			model.addAttribute("message", -1);
		}		
		
		model.addAttribute("employee_pwd", employee_pwd);
		
		return "employee/employee_pwd_search_main";
	}
	
	@RequestMapping(value = "/employee_pwd_search", method = RequestMethod.GET)
	public String EmployeePwdSearchGet(@RequestParam(value = "employee_pwd", defaultValue = "", required = false) String employee_pwd, 
			Model model, HttpSession session) {
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main";
		} else {
			
			EmployeeVO evo = new EmployeeVO();
			evo.setEmployee_pwd(employee_pwd);
			
			EmployeeVO user = employeeService.getEmployeePwd(employee_pwd);
			
			if (user != null) {
				model.addAttribute("message", 1);
			} else {
				model.addAttribute("message", -1);
			}
			
			model.addAttribute("employee_pwd", employee_pwd);
			
			return "employee/employee_pwd_search";
			
		}
	}
	
	@RequestMapping(value = "/employee_pwd_search", method = RequestMethod.POST)
	public String EmployeePwdSearchPost(@RequestParam(value = "employee_pwd", defaultValue = "", required = false) String employee_pwd, 
			Model model, HttpSession session) {
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main";
		} else {
			
			EmployeeVO evo = new EmployeeVO();
			evo.setEmployee_pwd(employee_pwd);
			
			EmployeeVO user = employeeService.getEmployeePwd(employee_pwd);
			
			if (user != null) {
				model.addAttribute("message", 1);
			} else {
				model.addAttribute("message", -1);
			}
			
			model.addAttribute("employee_pwd", employee_pwd);
			
			return "employee/employee_pwd_search";
			
		}
	}
	
	// 회원탈퇴 창으로 이동함
	@RequestMapping(value = "/employee_out_post", method = RequestMethod.POST)
	public String EmployeeOutGet(HttpSession session, Model model) {
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		} else {
			
			EmployeeVO employeeVO = employeeService.getEmployee(loginUser.getEmployee_id());
			
			model.addAttribute("employeeVO", employeeVO);
			
			return "employee/employee_out";	
		}
	}
	
	// 회원탈퇴 창으로 이동함
	@RequestMapping(value = "/employee_out", method = RequestMethod.GET)
	public String EmployeeOut(HttpSession session, Model model) {
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		} else {
			
			EmployeeVO employeeVO = employeeService.getEmployee(loginUser.getEmployee_id());
			
			model.addAttribute("employeeVO", employeeVO);
			
			return "employee/employee_out";	
		}
	}
	
	@RequestMapping(value = "/employee_out", method = RequestMethod.POST)
	public String EmployeeOut(HttpSession session) {
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		} else {
			
			EmployeeVO employeeVO = employeeService.getEmployee(loginUser.getEmployee_id());
			
			employeeService.deleteEmployee(employeeVO.getEmployee_id());
			
			return "redirect:/index";
		}
		
	}
	
	
	
	
	
	@RequestMapping(value = "/mymenu_ByAdmin", method = RequestMethod.GET)
	public String MyMenu_ByAdmin(HttpSession session) {
		System.out.println("내정보 : header_byAdmin.jsp 에서 mymenu_ByAdmin 클릭");
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			return "employee/hrd_menu";
		}
	}
	
	@RequestMapping(value = "/hrd_mymenu", method = RequestMethod.GET)
	public String HrdMenuGet(HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			HrdAdminVO hrdAdminVO = hrdAdminService.getAdmin(loginAdmin.getHrd_admin_id());
			
			model.addAttribute("hrdAdminVO", hrdAdminVO);
			
			return "employee/hrd_mymenu";
		}	
	}
	
	@RequestMapping(value = "/hrd_mymenu", method = RequestMethod.POST)
	public String HrdMenuPost(HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			HrdAdminVO hrdAdminVO = hrdAdminService.getAdmin(loginAdmin.getHrd_admin_id());
			
			model.addAttribute("hrdAdminVO", hrdAdminVO);
			
			return "employee/hrd_mymenu";
		}	
	}
	
	@RequestMapping(value = "/hrd_update", method = RequestMethod.POST)
	public String HrdUpdate(@RequestParam(value = "hrd_admin_id", defaultValue = "", required = false) String hrd_admin_id, 
							HrdAdminVO hvo, HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			hvo.setHrd_admin_id(hrd_admin_id);
			
			hrdAdminService.updateAdmin(hvo.getHrd_admin_id());
			
			return "redirect:/mymenu_ByAdmin";
			
		}		
	}
	
	// 이거 메인화면에서 회원가입화면으로 바로 넘어가는 거라 아이디 확인코드 일부러 안넣은거임
	@RequestMapping(value = "/admin_join", method = RequestMethod.POST)
	public String AdminJoin() {
		
		return "employee/admin_join";
	}
	
	@RequestMapping(value = "/hrd_join", method = RequestMethod.GET)
	public String HrdJoinGet(HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		}
		
		return "employee/hrd_join";
	}
	
	@RequestMapping(value = "/hrd_join", method = RequestMethod.POST)
	public String HrdJoinPost(HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		}
		
		return "employee/hrd_join";
	}
	
	// 이거 메인화면에서 회원가입화면으로 바로 넘어가는 거라 아이디 확인코드 일부러 안넣은거임	
	@RequestMapping(value = "/admin_join_post", method = RequestMethod.POST)
	public String AdminJoinPost(@RequestParam(value = "image") MultipartFile uploadFile, 
			HrdAdminVO hvo, HttpSession session) {
		
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
		
		hvo.setHrd_image(fileName);
		System.out.println(hvo);
		
		hrdAdminService.insertAdmin(hvo);
		
		return "redirect:/admin_index";
	}
	
	@RequestMapping(value = "/hrd_join_post", method = RequestMethod.POST)
	public String HrdJoinPost(@RequestParam(value = "image") MultipartFile uploadFile, 
				HrdAdminVO hvo, HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
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
			
			hvo.setHrd_image(fileName);
			System.out.println(hvo);
			
			hrdAdminService.insertAdmin(hvo);
		}
		
		return "redirect:/mymenu_ByAdmin";
	}
	
	@RequestMapping(value = "/admin_id_pwd_search", method = RequestMethod.POST)
	public String AdminIdPwdSearch() {
		
		return "employee/admin_idpwd_search";
	}
	
	@RequestMapping(value = "/hrd_idpwd_search", method = RequestMethod.GET)
	public String HrdIdpwdSearchGet(HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		}
		
		return "employee/hrd_idpwd_search";
	}
	
	@RequestMapping(value = "/hrd_idpwd_search", method = RequestMethod.POST)
	public String HrdIdpwdSearchPost(HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} 
		
		return "employee/hrd_idpwd_search";
	}
	
	@RequestMapping(value = "/hrd_id_search_admin", method = RequestMethod.GET)
	public String HrdIdSearchAdmin(@RequestParam(value = "hrd_admin_id", defaultValue = "", required = false) String hrd_admin_id, 
					HrdAdminVO hvo, Model model, HttpSession session) {
		
		hvo.setHrd_admin_id(hrd_admin_id);
		
		HrdAdminVO hrdAdminVO = hrdAdminService.getAdmin(hvo.getHrd_admin_id());
			
		if (hrdAdminVO != null) {
			model.addAttribute("message", 1);
		} else {
			model.addAttribute("message", -1);
		}
		
		model.addAttribute("hrd_admin_id", hrd_admin_id);
		
		return "employee/hrd_id_search_admin";
	}
	
	@RequestMapping(value = "/hrd_id_search", method = RequestMethod.GET)
	public String HrdPwdSearchId(@RequestParam(value = "hrd_admin_id", defaultValue = "", required = false) String hrd_admin_id, 
					HrdAdminVO hvo, Model model, HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			hvo.setHrd_admin_id(hrd_admin_id);
			
			HrdAdminVO hrdAdminVO = hrdAdminService.getAdmin(hvo.getHrd_admin_id());
				
			if (hrdAdminVO != null) {
				model.addAttribute("message", 1);
			} else {
				model.addAttribute("message", -1);
			}
			
			model.addAttribute("hrd_admin_id", hrd_admin_id);
			
			return "employee/hrd_id_search";
		}
	}
	
	@RequestMapping(value = "/hrd_pwd_search_admin", method = RequestMethod.GET)
	public String HrdPwdSearchMain(@RequestParam(value = "hrd_admin_pwd", defaultValue = "", required = false) String hrd_admin_pwd, 
					HrdAdminVO hvo, Model model, HttpSession session) {
		
		hvo.setHrd_admin_pwd(hrd_admin_pwd);
		
		HrdAdminVO hrdAdminVO = hrdAdminService.getAdminPwd(hvo.getHrd_admin_pwd());
		
		if (hrdAdminVO != null) {
			model.addAttribute("message", 1);
		} else {
			model.addAttribute("message", -1);
		}
		
		model.addAttribute("hrd_admin_pwd", hrd_admin_pwd);
		
		return "employee/hrd_pwd_search_admin";		
	}
	
	@RequestMapping(value = "/hrd_pwd_search", method = RequestMethod.GET)
	public String HrdPwdSearchPwd(@RequestParam(value = "hrd_admin_pwd", defaultValue = "", required = false) String hrd_admin_pwd, 
					HrdAdminVO hvo, Model model, HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			hvo.setHrd_admin_pwd(hrd_admin_pwd);
			
			HrdAdminVO hrdAdminVO = hrdAdminService.getAdminPwd(hvo.getHrd_admin_pwd());
			
			if (hrdAdminVO != null) {
				model.addAttribute("message", 1);
			} else {
				model.addAttribute("message", -1);
			}
			
			model.addAttribute("hrd_admin_pwd", hrd_admin_pwd);
			
			return "employee/hrd_pwd_search";		
		}
	}
	
	@RequestMapping(value = "/hrd_out", method = RequestMethod.GET)
	public String HrdOut(HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			HrdAdminVO hrdAdminVO = hrdAdminService.getAdmin(loginAdmin.getHrd_admin_id());
			
			model.addAttribute("hrdAdminVO", hrdAdminVO);
			
			return "employee/hrd_out";
		}
	}
	
	@RequestMapping(value = "/hrd_out_post", method = RequestMethod.POST)
	public String HrdOutPost(HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			HrdAdminVO hrdAdminVO = hrdAdminService.getAdmin(loginAdmin.getHrd_admin_id());
			
			model.addAttribute("hrdAdminVO", hrdAdminVO);
			
			return "employee/hrd_out";
		}
	}
	
	@RequestMapping(value = "/hrd_out", method = RequestMethod.POST)
	public String HrdOutPost(HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			HrdAdminVO hrdAdminVO = hrdAdminService.getAdmin(loginAdmin.getHrd_admin_id());
			
			hrdAdminService.deleteAdmin(hrdAdminVO.getHrd_admin_id());
			
			return "redirect:/mymenu_ByAdmin";
		}
	}
	
	@RequestMapping(value = "/hrd_admin_id_jungbuk", method = RequestMethod.GET)
	public String hrdAdminIdJungbuk(@RequestParam(value = "hrd_admin_id", defaultValue = "", required = false) String hrd_admin_id, 
					HrdAdminVO hvo, Model model, HttpSession session) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "admin_main";
		} else {
			
			hvo.setHrd_admin_id(hrd_admin_id);
			
			HrdAdminVO hrdAdminVO = hrdAdminService.getAdmin(hvo.getHrd_admin_id());
				
			if (hrdAdminVO != null) {
				model.addAttribute("message", 1);
			} else {
				model.addAttribute("message", -1);
			}
			
			model.addAttribute("hrd_admin_id", hrd_admin_id);
			
			return "hrd_admin/hrd_id_search";
		}
	}
	
	@RequestMapping(value = "/admin_jungbuk1", method = RequestMethod.GET)
	public String AdminJungbuk(@RequestParam(value = "hrd_admin_id", defaultValue = "", required = false) String hrd_admin_id, 
					HrdAdminVO hvo, Model model) {
			
		hvo.setHrd_admin_id(hrd_admin_id);
		
		HrdAdminVO hrdAdminVO = hrdAdminService.getAdmin(hvo.getHrd_admin_id());
			
		if (hrdAdminVO != null) {
			model.addAttribute("message", 1);
		} else {
			model.addAttribute("message", -1);
		}
		
		model.addAttribute("hrd_admin_id", hrd_admin_id);
		
		return "hrd_admin/admin_id_search";
	}
	
	
	
}




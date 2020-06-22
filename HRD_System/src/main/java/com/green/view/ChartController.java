package com.green.view;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.green.biz.disciplinary.DisciplinaryService;
import com.green.biz.employee.EmployeeService;
import com.green.biz.employee.EmployeeVO;
import com.green.biz.hrdAdmin.HrdAdminService;
import com.green.biz.hrdAdmin.HrdAdminVO;
import com.green.biz.retirement.RetirementService;
import com.green.biz.salary.SalaryService;
import com.green.biz.vacation.VacationService;

@Controller
public class ChartController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private HrdAdminService hrdAdminService;
	
	@Autowired
	private DisciplinaryService disciplinaryService;
	
	@Autowired
	private VacationService vacationService;
	
	@Autowired
	private SalaryService salaryService;
	
	@Autowired
	private RetirementService retirementService;
	
	@RequestMapping(value = "chart", method = RequestMethod.GET)
	public String Chart(HttpSession session) {
		
		EmployeeVO loginUser = (EmployeeVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "main/loginSay";
		}
		
		return "chart/chart";
	}
	
	
	
	@RequestMapping(value = "/chart_ByAdmin", method = RequestMethod.GET)
	public String ChartByAdmin(HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			// ��� �� ������ ����
			int getChartEmployee = employeeService.getChartEmployee();
			model.addAttribute("getChartEmployee", getChartEmployee);
			
			// �븮 �� ������ ����
			int getChartAssistantManager = employeeService.getChartAssistantManager();
			model.addAttribute("getChartAssistantManager", getChartAssistantManager);
			
			// ���� �� ��������
			int getChartSectionChief = employeeService.getChartSectionChief();
			model.addAttribute("getChartSectionChief", getChartSectionChief);
			
			// ���� �� ��������
			int getDeputyDepartmentHead = employeeService.getDeputyDepartmentHead();
			model.addAttribute("getDeputyDepartmentHead", getDeputyDepartmentHead);
			
			// ���� �� ��������
			int getDepartmentHead = employeeService.getDepartmentHead();
			model.addAttribute("getDepartmentHead", getDepartmentHead);
			
		}
		
		return "chart/chartList";
	}
	
	@RequestMapping(value = "/employee_position", method = RequestMethod.GET)
	public String EmployeePosition(HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			// ��� �� ������ ����
			int getChartEmployee = employeeService.getChartEmployee();
			model.addAttribute("getChartEmployee", getChartEmployee);
			
			// �븮 �� ������ ����
			int getChartAssistantManager = employeeService.getChartAssistantManager();
			model.addAttribute("getChartAssistantManager", getChartAssistantManager);
			
			// ���� �� ��������
			int getChartSectionChief = employeeService.getChartSectionChief();
			model.addAttribute("getChartSectionChief", getChartSectionChief);
			
			// ���� �� ��������
			int getDeputyDepartmentHead = employeeService.getDeputyDepartmentHead();
			model.addAttribute("getDeputyDepartmentHead", getDeputyDepartmentHead);
			
			// ���� �� ��������
			int getDepartmentHead = employeeService.getDepartmentHead();
			model.addAttribute("getDepartmentHead", getDepartmentHead);
			
		}
		
		return "chart/chartList";
	}
	
	@RequestMapping(value = "/employee_city", method = RequestMethod.GET)
	public String EmployeeCity(HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			// ������ ��� �� ��������
			int getChartSeoul = employeeService.getChartSeoul();
			model.addAttribute("getChartSeoul", getChartSeoul);
			
			// �λ��� ��� �� ��������
			int getChartBusan = employeeService.getChartBusan();
			model.addAttribute("getChartBusan", getChartBusan);
			
			// ��õ��� ��� �� ��������
			int getChartIncheon = employeeService.getChartIncheon();
			model.addAttribute("getChartIncheon", getChartIncheon);
			
			// ��⵵ ��� ��� �� ��������
			int getChartKyungGi = employeeService.getChartKyungGi();
			model.addAttribute("getChartKyungGi", getChartKyungGi);
			
			// ��û���� ��� ��� �� ��������
			int getChongNam = employeeService.getCheongNam();
			model.addAttribute("getChongNam", getChongNam);
			
			// �泲 ��� ��� �� ��������
			int getKyungNam = employeeService.getKyungName();
			model.addAttribute("getKyungNam", getKyungNam);
			
			// ������ ������ �� ��������
			int getChartSeoulAdmin = hrdAdminService.getChartSeoul();
			model.addAttribute("getChartSeoulAdmin", getChartSeoulAdmin);
			
			// ��õ��� ������ �� ��������
			int getChartIncheonAdmin = hrdAdminService.getChartIncheon();
			model.addAttribute("getChartIncheonAdmin", getChartIncheonAdmin);
			
			// ��⵵ ��� ������ �� ��������
			int getChartKyungGiAdmin = hrdAdminService.getChartKyungGi();
			model.addAttribute("getChartKyungGiAdmin", getChartKyungGiAdmin);
			
			// �λ� ��� ������ �� ��������
			int getChartBusanAdmin = hrdAdminService.getChartBusan();
			model.addAttribute("getChartBusanAdmin", getChartBusanAdmin);
			
			// �泲 ��� ������ �� ��������
			int getChungNameAdmin = hrdAdminService.getChungNam();
			model.addAttribute("getChungNameAdmin", getChungNameAdmin);
			
			// �泲 ��� ������ �� ��������
			int getKyungNameAdmin = hrdAdminService.getKyungNam();
			model.addAttribute("getKyungNameAdmin", getKyungNameAdmin);
			
		}
		
		return "chart/chartCity";
	}
	
	@RequestMapping(value = "/disciplinary_count", method = RequestMethod.GET)
	public String DisciplinaryCount(HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			// ¡���� ���� ��� �� ��������
			int getChartDisciplinaryNo = disciplinaryService.getChartDisciplinaryNo();
			model.addAttribute("getChartDisciplinaryNo", getChartDisciplinaryNo);
			
			// ¡���� �ִ� ��� �� ��������
			int getChartDisciplinaryYes = disciplinaryService.getChartDisciplinaryYes();
			model.addAttribute("getChartDisciplinaryYes", getChartDisciplinaryYes);
				
		}
		
		return "chart/disciplinaryCount";
	}
	
	@RequestMapping(value = "/vacation_reason_search", method = RequestMethod.GET)
	public String VacationReasonSearch(HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			// ���� ������ �����ް��� ��� �� ��������
			int getChartMyungjeongVacation = vacationService.getChartMyungjeongVacation();
			model.addAttribute("getChartMyungjeongVacation", getChartMyungjeongVacation);
			
			// ���� ������ �ؿܿ����� ��� �� ��������
			int getChartOverseasTrip = vacationService.getChartOverseasTrip();
			model.addAttribute("getChartOverseasTrip", getChartOverseasTrip);
			
			// ���� ������ ���������� ��� �� ��������
			int getChartFamilyTrip = vacationService.getChartFamilyTrip();
			model.addAttribute("getChartFamilyTrip", getChartFamilyTrip);
			
			// ���� ������ ������ ��� �� ��������
			int getChartSickLeave = vacationService.getChartSickLeave();
			model.addAttribute("getChartSickLeave", getChartSickLeave);
			
		}
		
		return "chart/vacationCount";
	}
	
	@RequestMapping(value = "/salary_amount", method = RequestMethod.GET)
	public String SalaryAmount(HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			int getChart2000000DownEmployee = salaryService.getChart2000000DownEmployee();
			model.addAttribute("getChart2000000DownEmployee", getChart2000000DownEmployee);
			
			int getChart3000000DownEmployee = salaryService.getChart3000000DownEmployee();
			model.addAttribute("getChart3000000DownEmployee", getChart3000000DownEmployee);
			
			int getChart4000000DownEmployee = salaryService.getChart4000000DownEmployee();
			model.addAttribute("getChart4000000DownEmployee", getChart4000000DownEmployee);
			
			int getChart5000000DownEmployee = salaryService.getChart5000000DownEmployee();
			model.addAttribute("getChart5000000DownEmployee", getChart5000000DownEmployee);
			
			int getChart5000000OverEmployee = salaryService.getChart5000000OverEmployee();
			model.addAttribute("getChart5000000OverEmployee", getChart5000000OverEmployee);
			
		}
		
		return "chart/salary_amount";
	}
	
	@RequestMapping(value = "/retirement_percent", method = RequestMethod.GET)
	public String RetirementPercent(HttpSession session, Model model) {
		
		HrdAdminVO loginAdmin = (HrdAdminVO) session.getAttribute("loginAdmin");
		
		if (loginAdmin == null) {
			return "main/loginSay";
		} else {
			
			int getChart5000000DowmEmployee = retirementService.getChart5000000DowmEmployee();
			model.addAttribute("getChart5000000DowmEmployee", getChart5000000DowmEmployee);
			
			int getChart10000000DowmEmployee = retirementService.getChart10000000DowmEmployee();
			model.addAttribute("getChart10000000DowmEmployee", getChart10000000DowmEmployee);
			
			int getChart10000000OverEmployee = retirementService.getChart10000000OverEmployee();
			model.addAttribute("getChart10000000OverEmployee", getChart10000000OverEmployee);
			
		}
		
		return "chart/retirement_percent";
	}
	
}



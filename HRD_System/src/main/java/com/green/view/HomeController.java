package com.green.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.green.biz.disciplinary.DisciplinaryService;
import com.green.biz.disciplinary.DisciplinaryVO;
import com.green.biz.employee.EmployeeService;
import com.green.biz.employee.EmployeeVO;
import com.green.biz.information.InformationService;
import com.green.biz.information.InformationVO;
import com.green.biz.retirement.RetirementService;
import com.green.biz.retirement.RetirementVO;
import com.green.biz.salary.SalaryService;
import com.green.biz.salary.SalaryVO;
import com.green.biz.vacation.VacationService;
import com.green.biz.vacation.VacationVO;

@Controller
public class HomeController {
	
	@Autowired
	private InformationService informationService;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private DisciplinaryService disciplinaryService;
	
	@Autowired
	private SalaryService salaryService;
	
	@Autowired
	private VacationService vacationService;
	
	@Autowired
	private RetirementService retirementService;
	
	// view 밑에 main.jsp로 이동시킴
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String Login(Model model) {
		
		List<InformationVO> informationList = informationService.listAllInformation();
		model.addAttribute("informationList", informationList);
		model.addAttribute("informationListSize", informationList.size());
		
		List<InformationVO> list3Information = informationService.list3Information();
		model.addAttribute("list3Information", list3Information);
		
		List<EmployeeVO> listAllEmployee = employeeService.listAllEmployee();
		model.addAttribute("listAllEmployee", listAllEmployee);
		model.addAttribute("listAllEmployeeSize", listAllEmployee.size());
		
		List<EmployeeVO> list3Employee = employeeService.list3Employee();
		model.addAttribute("list3Employee", list3Employee);
		
		List<DisciplinaryVO> disciplinaryList = disciplinaryService.listAllDisciplinary();
		model.addAttribute("disciplinaryList", disciplinaryList);
		model.addAttribute("disciplinaryListSize", disciplinaryList.size());
		
		List<DisciplinaryVO> list3Disciplinary = disciplinaryService.list3Disciplinary();
		model.addAttribute("list3Disciplinary", list3Disciplinary);
		
		List<SalaryVO> salaryList = salaryService.listAllSalary();
		model.addAttribute("salaryList", salaryList);
		model.addAttribute("salaryListSize", salaryList.size());
		
		List<SalaryVO> list3Salary = salaryService.list3Salary();
		model.addAttribute("list3Salary", list3Salary);
		
		List<VacationVO> vacationList = vacationService.listAllVacaction();
		model.addAttribute("vacationList", vacationList);
		model.addAttribute("vacationListSize", vacationList.size());
		
		List<VacationVO> list3Vacation = vacationService.list3Vacation();
		model.addAttribute("list3Vacation", list3Vacation);
		
		List<RetirementVO> retirementList = retirementService.listAllRetirement();
		model.addAttribute("retirementList", retirementList);
		model.addAttribute("retirementListSize", retirementList.size());
		
		List<RetirementVO> list3Retirement = retirementService.list3Retirement();
		model.addAttribute("list3Retirement", list3Retirement);
		
		
		// 사원 수 가지고 오기
		int getChartEmployee = employeeService.getChartEmployee();
		model.addAttribute("getChartEmployee", getChartEmployee);
		
		// 대리 수 가지고 오기
		int getChartAssistantManager = employeeService.getChartAssistantManager();
		model.addAttribute("getChartAssistantManager", getChartAssistantManager);
		
		// 과장 수 가져오기
		int getChartSectionChief = employeeService.getChartSectionChief();
		model.addAttribute("getChartSectionChief", getChartSectionChief);
		
		// 차장 수 가져오기
		int getDeputyDepartmentHead = employeeService.getDeputyDepartmentHead();
		model.addAttribute("getDeputyDepartmentHead", getDeputyDepartmentHead);
		
		// 부장 수 가져오기
		int getDepartmentHead = employeeService.getDepartmentHead();
		model.addAttribute("getDepartmentHead", getDepartmentHead);
		
		return "main";
	}
	
	
	@RequestMapping(value = "/admin_index", method = RequestMethod.GET)
	public String adminLogin(Model model) {
		
		List<InformationVO> informationList = informationService.listAllInformation();
		model.addAttribute("informationList", informationList);
		model.addAttribute("informationListSize", informationList.size());
		
		List<InformationVO> list3Information = informationService.list3Information();
		model.addAttribute("list3Information", list3Information);
		
		List<EmployeeVO> listAllEmployee = employeeService.listAllEmployee();
		model.addAttribute("listAllEmployee", listAllEmployee);
		model.addAttribute("listAllEmployeeSize", listAllEmployee.size());
		
		List<EmployeeVO> list3Employee = employeeService.list3Employee();
		model.addAttribute("list3Employee", list3Employee);
		
		List<DisciplinaryVO> disciplinaryList = disciplinaryService.listAllDisciplinary();
		model.addAttribute("disciplinaryList", disciplinaryList);
		model.addAttribute("disciplinaryListSize", disciplinaryList.size());
		
		List<DisciplinaryVO> list3Disciplinary = disciplinaryService.list3Disciplinary();
		model.addAttribute("list3Disciplinary", list3Disciplinary);
		
		List<SalaryVO> salaryList = salaryService.listAllSalary();
		model.addAttribute("salaryList", salaryList);
		model.addAttribute("salaryListSize", salaryList.size());
		
		List<SalaryVO> list3Salary = salaryService.list3Salary();
		model.addAttribute("list3Salary", list3Salary);
		
		List<VacationVO> vacationList = vacationService.listAllVacaction();
		model.addAttribute("vacationList", vacationList);
		model.addAttribute("vacationListSize", vacationList.size());
		
		List<VacationVO> list3Vacation = vacationService.list3Vacation();
		model.addAttribute("list3Vacation", list3Vacation);
		
		List<RetirementVO> retirementList = retirementService.listAllRetirement();
		model.addAttribute("retirementList", retirementList);
		model.addAttribute("retirementListSize", retirementList.size());
		
		List<RetirementVO> list3Retirement = retirementService.list3Retirement();
		model.addAttribute("list3Retirement", list3Retirement);
		
		
		// 사원 수 가지고 오기
		int getChartEmployee = employeeService.getChartEmployee();
		model.addAttribute("getChartEmployee", getChartEmployee);
		
		// 대리 수 가지고 오기
		int getChartAssistantManager = employeeService.getChartAssistantManager();
		model.addAttribute("getChartAssistantManager", getChartAssistantManager);
		
		// 과장 수 가져오기
		int getChartSectionChief = employeeService.getChartSectionChief();
		model.addAttribute("getChartSectionChief", getChartSectionChief);
		
		// 차장 수 가져오기
		int getDeputyDepartmentHead = employeeService.getDeputyDepartmentHead();
		model.addAttribute("getDeputyDepartmentHead", getDeputyDepartmentHead);
		
		// 부장 수 가져오기
		int getDepartmentHead = employeeService.getDepartmentHead();
		model.addAttribute("getDepartmentHead", getDepartmentHead);
		
		return "admin_main";
	}
	
	
}

package ksmart31.team01.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart31.team01.member.service.DepartmentService;
import ksmart31.team01.member.vo.Department;
import ksmart31.team01.member.vo.DepartmentJoinMember;


@Controller
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
		
	//조직도 리스트
	@GetMapping(value="/departmentView")
	public String getDepartmentList(Model model) {		
		List<Department> list = departmentService.getDepartmentList();		
		System.out.println(list+"DepartmentController getDepartmentList [GET] list");
		model.addAttribute("departmentList", list);		
		return "department/departmentView";		
	}
	
	@GetMapping(value="/ex1")
	public String getDepartmentJoinMemberList(Model model,String departmentName) {		
		System.out.println(departmentName + "DepartmentController getDepartmentJoinMemberList [GET] departmentName");
		List<DepartmentJoinMember> list = departmentService.getDepartmentJoinMemberList(departmentName);		
		System.out.println(list+"DepartmentController getDepartmentJoinMemberList [GET] list");
		model.addAttribute("departmentJoinMemberList", list);		
		return "department/ex1";		
	}
}

package ksmart31.team01.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.member.service.DepartmentService;
import ksmart31.team01.member.vo.Department;
import ksmart31.team01.member.vo.Member;

@Controller
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping(value="/departmentView")
	public String getDepartmentList(Model model) {
		List<Member> list = departmentService.getDepartmentList();		
		System.out.println(list+"list memberList.java");
		model.addAttribute("memberList", list);
		return "department/departmentView";
	}
	
	
}

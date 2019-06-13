package ksmart31.team01.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.member.service.DepartmentService;
import ksmart31.team01.member.vo.Department;

@Controller
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping(value="/departmentView")
	public String getDepartmentList(Model model) {
		List<Department> list = departmentService.getDepartmentList();
		
		System.out.println(list+"list DepartmentController.java");
		model.addAttribute("list", list);
		return "departmentView";
	}
}

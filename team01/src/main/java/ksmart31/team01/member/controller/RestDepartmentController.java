package ksmart31.team01.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.team01.member.service.DepartmentService;
import ksmart31.team01.member.vo.Member;

@RestController

public class RestDepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping(value="/restDepartmentView")
	public List<Member> getMemberList(String departmentCategoryCode) {
				
		return departmentService.getMemberList(departmentCategoryCode);
	}
}

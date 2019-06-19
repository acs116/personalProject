package ksmart31.team01.member.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import ksmart31.team01.member.service.DepartmentService;



@Controller
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
		
	//조직도 리스트
	@GetMapping(value="/departmentView")
	public String getDepartmentList(Model model,String departmentName) {		
		System.out.println(departmentName + "DepartmentController getDepartmentList [GET] departmentName");
		Map<String,Object> returnMap = departmentService.getDepartmentList(departmentName);		
		/*
		 * System.out.println(list+"DepartmentController getDepartmentList [GET] list");
		 */
		model.addAttribute("recursiveList", returnMap.get("recursiveList"));		
		model.addAttribute("departmentJoinMemberList", returnMap.get("departmentJoinMemberList"));
		return "department/departmentView";		
	}	
	
}

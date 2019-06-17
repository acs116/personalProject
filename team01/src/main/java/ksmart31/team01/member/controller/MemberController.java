package ksmart31.team01.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.member.service.MemberService;
import ksmart31.team01.member.vo.Member;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping(value="/departmentViewM")
	public String getMemberList(Model model,Member member) {
		List<Member> list = memberService.getMemberList(member);
		model.addAttribute("List", list);
		return "departmentView";
	}
}

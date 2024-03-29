package ksmart31.team01.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.member.service.MemberAccountService;
import ksmart31.team01.member.vo.MemberAccount;

@Controller
public class MemberAccountController {
	@Autowired
	private MemberAccountService memberAccountService;
	//memberAccount 리스트
	@GetMapping(value="/memberAccountListView")
	public String getMemberAccountList(Model model){
		List<MemberAccount> list = memberAccountService.getMemberAccountList();
		System.out.println(list + "MemberAccountController getMemberAccountList [get] list");
		model.addAttribute("memberAccountList", list);
		return "accountCode/memberAccountListView";
	}	
}

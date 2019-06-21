package ksmart31.team01.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.member.mapper.MemberAccountMapper;
import ksmart31.team01.member.vo.MemberAccount;

@Service
@Transactional
public class MemberAccountService {
	@Autowired
	private MemberAccountMapper memberAccountMapper;
	public List<MemberAccount> getMemberAccountList(){
		List<MemberAccount> list = memberAccountMapper.selectMemberAccountList();
		System.out.println(list + "MemberAccountService getMemberAccountList list");
		return list;
	}	
}

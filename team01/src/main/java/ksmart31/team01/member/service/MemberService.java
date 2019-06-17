package ksmart31.team01.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.member.mapper.MemberMapper;
import ksmart31.team01.member.vo.Member;

@Service
@Transactional
public class MemberService {
	@Autowired
	private MemberMapper memberMapper;
	public List<Member> getMemberList(Member member){
		return memberMapper.selectMemberList(member);
	}
}	
	
	

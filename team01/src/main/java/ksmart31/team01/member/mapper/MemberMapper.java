package ksmart31.team01.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.vo.Member;

@Mapper
public interface MemberMapper {

	
	public List<Member> selectMemberList(Member member); 
}

package ksmart31.team01.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.vo.Department;
import ksmart31.team01.member.vo.DepartmentJoinMember;
import ksmart31.team01.member.vo.Member;

@Mapper
public interface DepartmentMapper {
	//조직도 리스트
	public List<Department> selectDepartmentList();
	public List<DepartmentJoinMember> selectDepartmentJoinMemberList(String departmentName);
	
	
}

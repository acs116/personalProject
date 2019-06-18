package ksmart31.team01.member.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.member.mapper.DepartmentMapper;
import ksmart31.team01.member.vo.Department;
import ksmart31.team01.member.vo.DepartmentJoinMember;


@Service
@Transactional
public class DepartmentService {
	@Autowired
	private DepartmentMapper departmentMapper;
		
	//조직도 리스트
	public List<Department> getDepartmentList(){
		List<Department> list = departmentMapper.selectDepartmentList();
		System.out.println(list +"DepartmentService getMemberList list");		
		return list;
	}
	//department join member list
	public List<DepartmentJoinMember> getDepartmentJoinMemberList(String departmentName){
		List<DepartmentJoinMember> list = departmentMapper.selectDepartmentJoinMemberList(departmentName);
		System.out.println(list + "DepartmentService getDepartmentJoinMemberList list");
		return list;
	}
}

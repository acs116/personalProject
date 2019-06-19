package ksmart31.team01.member.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.vo.Department;
import ksmart31.team01.member.vo.DepartmentJoinMember;


@Mapper
public interface DepartmentMapper {
	//조직도 리스트
	public List<Department> selectDepartmentList();
	public List<DepartmentJoinMember> selectDepartmentJoinMemberList(Map<String, Object> map);
	
	
	
}

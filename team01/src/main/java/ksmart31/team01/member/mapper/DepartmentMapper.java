package ksmart31.team01.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.vo.Department;

@Mapper
public interface DepartmentMapper {

	public List<Department> selectDepartmentList();
}

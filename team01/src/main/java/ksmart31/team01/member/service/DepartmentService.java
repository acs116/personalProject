package ksmart31.team01.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.team01.member.mapper.DepartmentMapper;
import ksmart31.team01.member.vo.Department;

@Service
@Transactional
public class DepartmentService {
	@Autowired
	private DepartmentMapper departmentMapper;
	
	public List<Department> getDepartmentList(){
		return departmentMapper.selectDepartmentList();
	}
	
}

package ksmart31.team01.member.service;

import java.util.*;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
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
		
	//조직도 departmentView.html
	public Map<String, Object> getDepartmentList(String departmentName){
		//재귀쿼리 사용한 departmentName 조회 리스트
		List<Department> recursiveList = departmentMapper.selectDepartmentList();
		System.out.println(recursiveList +"DepartmentService getDepartmentList recursiveList");
		
		//department join member list
		
		
		int departmentNumber = StringUtils.countMatches(departmentName, "-");
		System.out.println("departmentNumber - 몇개? : " + departmentNumber);
				
		if(departmentName != null){	
			departmentName = departmentName.replaceAll("-","");
			System.out.println("departmentName - 제거 됐니? : " + departmentName);
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("departmentName", departmentName);
		map.put("departmentNumber", departmentNumber);
		
		
		List<DepartmentJoinMember> departmentJoinMemberList = departmentMapper.selectDepartmentJoinMemberList(map);
		
		System.out.println(departmentJoinMemberList + "DepartmentService getDepartmentList departmentJoinMemberList");
		
		
		Map<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("recursiveList", recursiveList);		
		returnMap.put("departmentJoinMemberList", departmentJoinMemberList);
		return returnMap;
	}	
	
}	

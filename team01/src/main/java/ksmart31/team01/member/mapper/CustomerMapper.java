package ksmart31.team01.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team01.member.vo.Account;
import ksmart31.team01.member.vo.Customer;

@Mapper
public interface CustomerMapper {
	//customer 리스트
	public List<Customer> selectCustomerList();
	
}

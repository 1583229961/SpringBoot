package com.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.Model.Employee;

@Mapper
public interface Employeemapper {

	Employee selectEmployee(@Param("id")Integer id,@Param("password")String password);
}

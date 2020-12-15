package com.example.demo.cmm.mpr;

import java.util.List;

import com.example.demo.uss.service.model.StudentDto;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {
	int insert(StudentDto student);
	StudentDto login(StudentDto student);
	StudentDto selectById(String userid);
	List<StudentDto> selectAll();
}

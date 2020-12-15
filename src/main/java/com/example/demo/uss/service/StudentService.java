package com.example.demo.uss.service;

import com.example.demo.uss.service.model.StudentDto;

import org.springframework.stereotype.Component;

@Component
public interface StudentService {
	public int register(StudentDto student);
	public StudentDto login(StudentDto student);
	public StudentDto detail(String userid);

}

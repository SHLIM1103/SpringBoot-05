package com.example.demo.cmm.mpr;

import com.example.demo.sym.service.model.TeacherDto;

import org.springframework.stereotype.Repository;

@Repository
public interface TeacherMapper {

	int insert(TeacherDto teacher);

}

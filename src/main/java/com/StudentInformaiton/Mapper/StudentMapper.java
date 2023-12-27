 package com.StudentInformaiton.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.StudentInformaiton.Entity.StudentDetails;
import com.StudentInformaiton.RequestVo.StudentRequestVo;

@Mapper
public interface StudentMapper {
	
	StudentMapper INSTANSE=Mappers.getMapper(StudentMapper.class);
	
	StudentDetails  convertVoToDo(StudentRequestVo vo);
	
	List<StudentRequestVo> convertDoToVo(List<StudentDetails> stu);

}

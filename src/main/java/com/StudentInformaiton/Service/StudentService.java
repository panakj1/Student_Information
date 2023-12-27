package com.StudentInformaiton.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentInformaiton.Entity.StudentDetails;
import com.StudentInformaiton.Mapper.StudentMapper;
import com.StudentInformaiton.RepoInterface.StudentRepository;
import com.StudentInformaiton.RequestVo.StudentRequestVo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository    studentRepository;
	
	
	public StudentDetails createStudentRecord(StudentRequestVo  vo) {
		StudentDetails stu=StudentMapper.INSTANSE.convertVoToDo(vo);
		
		return studentRepository.save(stu);
		
	}
	
	public List<StudentRequestVo> getAllRecord() {
		List<StudentDetails>  stu=studentRepository.findAll();  
		return StudentMapper.INSTANSE.convertDoToVo(stu);
}
}

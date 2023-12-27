package com.StudentInformaiton.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentInformaiton.RequestVo.StudentRequestVo;
import com.StudentInformaiton.Service.StudentService;

@RestController
@RequestMapping("/record")
public class StudentHomeControlller {
	
	@Autowired
	StudentService   studentService;
	@PostMapping(value="/save")
	public ResponseEntity<String> saveRecord(@RequestBody @Valid StudentRequestVo stu){
		
		studentService.createStudentRecord(stu);
		return new ResponseEntity<String>("Save succesfully",HttpStatus.CREATED);
	}
	
	@GetMapping(value="getAllStudentRecord")
	public ResponseEntity<List<StudentRequestVo>> getAllDetails(){
		
		List<StudentRequestVo> list=studentService.getAllRecord();
		return new ResponseEntity<List<StudentRequestVo>>(list,HttpStatus.OK);
	}

}

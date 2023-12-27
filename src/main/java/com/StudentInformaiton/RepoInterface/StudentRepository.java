package com.StudentInformaiton.RepoInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentInformaiton.Entity.StudentDetails;

public interface StudentRepository extends JpaRepository<StudentDetails, Long>{

}

package com.StudentInformaiton.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="STUDENT_RECORD")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long stuId;
	
	@Column(name="stuName")
	private String stuName;
	
	@Column(name="stuAddress")
	private String stuAddress;
	
	@Column(name="stuDepartmentName")
	private String stuDepartmentName;
	
	@Column(name="stuStatus")
	private boolean stuStatus;
	
	@Column(name="stuAge")
	private int stuAge;
	 
	@Column(name="stuFees")
	private double stuFees;

	public Long getStuId() {
		return stuId;
	}

	public void setStuId(Long stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuAddress() {
		return stuAddress;
	}

	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

	public String getStuDepartmentName() {
		return stuDepartmentName;
	}

	public void setStuDepartmentName(String stuDepartmentName) {
		this.stuDepartmentName = stuDepartmentName;
	}

	public boolean isStuStatus() {
		return stuStatus;
	}

	public void setStuStatus(boolean stuStatus) {
		this.stuStatus = stuStatus;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public double getStuFees() {
		return stuFees;
	}

	public void setStuFees(double stuFees) {
		this.stuFees = stuFees;
	}

}

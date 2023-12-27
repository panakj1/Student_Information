package com.StudentInformaiton.RequestVo;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequestVo {
	
    private Long stuId;
    @NotNull(message ="Name should not be blank")
	private String stuName;
    @NotNull(message ="Address should not be blank")
	private String stuAddress;
    @NotNull(message ="Department should not be blank")
	private String stuDepartmentName;
	private boolean stuStatus;
	@NotNull(message ="Age should not be blank")
	private int stuAge;
	@NotNull(message ="Fees should not be blank")
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

package com.StudentInformaiton.ResponseVO;

import java.util.Date;
import java.util.List;

import com.StudentInformaiton.RequestVo.StudentRequestVo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor(staticName="Created")
public class StudentResponseVO {
	
	private String text;
	private int sizeValue;
	private List<StudentRequestVo> data;
	private Date date;
	
	public StudentResponseVO(String text, int sizeValue, List<StudentRequestVo> data, Date date) {
		super();
		this.text = text;
		this.sizeValue = sizeValue;
		this.data = data;
		this.date = date;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getSizeValue() {
		return sizeValue;
	}
	public void setSizeValue(int sizeValue) {
		this.sizeValue = sizeValue;
	}
	public List<StudentRequestVo> getData() {
		return data;
	}
	public void setData(List<StudentRequestVo> data) {
		this.data = data;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

}

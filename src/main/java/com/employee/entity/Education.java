package com.employee.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Education {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String nameOfUni;
    private String collegeName;
    private String degree;
    private String grade;
    private String passingYear;
    private Long employeeId;
   
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameOfUni() {
		return nameOfUni;
	}
	public void setNameOfUni(String nameOfUni) {
		this.nameOfUni = nameOfUni;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getPassingYear() {
		return passingYear;
	}
	public void setPassingYear(String passingYear) {
		this.passingYear = passingYear;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

}

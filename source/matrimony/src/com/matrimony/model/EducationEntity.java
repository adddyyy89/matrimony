package com.matrimony.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "education")
class EducationEntity implements Serializable {

	private static final long serialVersionUID = 1540946752914004375L;

	@Id
	@Column(name = "courseid")
	private int courseId;

	@Column(name = "coursename", length = 50)
	private String courseName;

	@Column(name = "passingyear")
	private int passingYear;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(int passingYear) {
		this.passingYear = passingYear;
	}

}

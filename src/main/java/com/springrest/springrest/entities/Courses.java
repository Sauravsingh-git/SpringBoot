package com.springrest.springrest.entities;

public class Courses {
	private long id;
	private String courseName;
	private String description;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Courses(long id, String courseName, String description) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.description = description;
	}
}

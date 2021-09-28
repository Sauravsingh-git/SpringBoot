package com.springrest.springrest.services;

import java.util.ArrayList;

import com.springrest.springrest.entities.Courses;

public interface CourseService {
	public ArrayList<Courses> getCourses();
	
	public Courses getCourse(long courseId);
	
	public Courses addCourse(Courses course);
}

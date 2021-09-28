package com.springrest.springrest.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.CourseService;

@RestController
public class Mycontroller {
	
	@Autowired
	private CourseService courseService;
	@GetMapping("/home")
	public String home(){
		 return "this is home page";
	 }
	
	@GetMapping("/courses")
	public ArrayList<Courses> getCourses(){

		return this.courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses course) {
		return this.courseService.addCourse(course);
	}
}
	 
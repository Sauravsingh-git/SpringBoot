package com.springrest.springrest.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;

@Service
public class CoursesServiceImp implements CourseService{
	ArrayList<Courses> list;
	
	public CoursesServiceImp () {
		list = new ArrayList<>();
		list.add(new Courses(123, "Core Java Basics", "This courses gives information about java basics"));
		list.add(new Courses(133, "Python intermideate", "This courses gives information about intermideate python concepts"));
	}
	@Override
	public ArrayList<Courses> getCourses() {
		return list;
	}
	@Override
	public Courses getCourse(long courseId) {
		Courses course = null;
		for(Courses temp: list) {
			if(temp.getId() == courseId) {
				course = temp;
				break;
			}
		}
		return course;
	}
	@Override
	public Courses addCourse(Courses course) {
		list.add(course);
		return course;
	}

	@Override
	public Courses updateCourse (Courses course) {
		for(Courses temp : list) {
			if(temp.getId() == course.getId()) {
				temp.setCourseName(course.getCourseName());
				temp.setDescription(course.getDescription());
			}
		}
		return course;
	}
	
	@Override
	public void deleteCourse(long courseId) {
		for(Courses temp : list) {
			if(temp.getId() == courseId) {
				list.remove(temp);
			}
		}
	}
	
}

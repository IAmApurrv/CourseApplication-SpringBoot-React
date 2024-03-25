package com.course.courseappbackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.course.courseappbackend.entity.Course;
import com.course.courseappbackend.services.CourseService;

@CrossOrigin("http://localhost:3000")
@RestController
public class MainController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/courses")
	public List<Course> getCourses() // get all courses
	{
		return this.courseService.getCourses();
	}

	@GetMapping("/courses/{courseId}")
	public Optional<Course> getCourseById(@PathVariable String courseId) // get course by id
	{
//		return this.courseService.getCourse(Long.parseLong(courseId));
		return this.courseService.getCourse(Long.parseLong(courseId));
	}

	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) // add a course
	{
		return this.courseService.addCourse(course);
	}

	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) // update a course
	{
		return this.courseService.updateCourse(course);
	}

	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) // delete a course
	{
		try {
			this.courseService.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}

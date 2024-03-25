package com.course.courseappbackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.courseappbackend.dao.CourseDao;
import com.course.courseappbackend.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

	public CourseServiceImpl() {
	}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Optional<Course> getCourse(long courseId) {
//		return courseDao.getOne(courseId);
		return courseDao.findById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
//		Course entity = courseDao.courseDao.findById(courseId);
//		courseDao.delete(entity);
		Optional<Course> courseOptional = courseDao.findById(courseId);
		courseOptional.ifPresent(courseDao::delete);
	}

}

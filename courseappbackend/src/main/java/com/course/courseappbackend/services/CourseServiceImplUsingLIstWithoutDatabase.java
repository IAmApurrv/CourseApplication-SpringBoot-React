//package com.course.services;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.stereotype.Service;
//
//import com.course.entity.Course;
//
//@Service
//public class CourseServiceImplUsingLIstWithoutDatabase implements CourseService {
//
//	List<Course> list;
//
//	public CourseServiceImplUsingLIstWithoutDatabase() {
//		list = new ArrayList<>();
//		list.add(new Course(1, "Java", "for beginers"));
//		list.add(new Course(2, "SpringBoot", "for beginers"));
//		list.add(new Course(3, "Database", "for beginers"));
//		list.add(new Course(4, "React", "for beginers"));
//	}
//
//	@Override
//	public List<Course> getCourses() {
//		return list;
//	}
//
//	@Override
//	public Course getCourse(long courseId) {
//		Course course = null;
//		for (Course c : list) {
//			if (c.getId() == courseId) {
//				course = c;
//				break;
//			}
//		}
//		return course;
//	}
//
//	@Override
//	public Course addCourse(Course course) {
//		list.add(course);
//		return course;
//	}
//
//	@Override
//	public Course updateCourse(Course course) {
//		list.forEach(e -> {
//			if (e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
//		return course;
//	}
//
//	@Override
//	public void deleteCourse(long courseId) {
//		list = this.list.stream().filter(e -> e.getId() != courseId).collect(Collectors.toList());
//	}
//
//}

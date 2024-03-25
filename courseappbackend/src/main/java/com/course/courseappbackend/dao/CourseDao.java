package com.course.courseappbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.courseappbackend.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}

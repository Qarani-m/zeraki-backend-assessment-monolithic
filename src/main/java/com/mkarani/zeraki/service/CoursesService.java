package com.mkarani.zeraki.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mkarani.zeraki.dto.CourseRequest;
import com.mkarani.zeraki.entity.CourseEntity;

import java.util.List;
import java.util.Map;

public interface CoursesService {
    Map<String, List<String>> getCoursesByInstitution();

    CourseEntity addCourse(CourseRequest courseRequest);

    String deleteCourse(Long courseId);

    CourseEntity editCourseName(Long courseId, String name) throws JsonProcessingException;

    List<CourseEntity> sortCoursesByName(String direction);

    List<CourseEntity> getAllCourses();
}

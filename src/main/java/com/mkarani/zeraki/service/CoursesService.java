package com.mkarani.zeraki.service;

import com.mkarani.zeraki.entity.CourseEntity;

import java.util.List;

public interface CoursesService {
    List<CourseEntity> getCoursesByInstitution(Long institutionId);
}

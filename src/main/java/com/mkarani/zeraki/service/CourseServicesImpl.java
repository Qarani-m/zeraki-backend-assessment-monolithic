package com.mkarani.zeraki.service;


import com.mkarani.zeraki.entity.CourseEntity;
import com.mkarani.zeraki.repository.InstitutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServicesImpl implements CoursesService{
    @Autowired
    private InstitutionRepository institutionRepository;

    @Override
    public List<CourseEntity> getCoursesByInstitution(Long institutionId) {

        return null;
    }
}

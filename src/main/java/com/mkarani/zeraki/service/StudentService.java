package com.mkarani.zeraki.service;

import com.mkarani.zeraki.dto.ChangeInstitutionDto;
import com.mkarani.zeraki.dto.StudentRequest;
import com.mkarani.zeraki.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    String addStudent(StudentRequest studentDto) throws Exception;

    void deleteStudent(Long studentId);

    void editStudentName(Long studentId, String name);

    void changeStudentCourse(Long studentId, String course) throws Exception;

    StudentEntity transferStudent(Long studentId, ChangeInstitutionDto changeInstitutionDto) throws Exception;

    List<StudentEntity> listStudents();
}

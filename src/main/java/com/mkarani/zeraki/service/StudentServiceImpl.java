package com.mkarani.zeraki.service;


import com.mkarani.zeraki.dto.StudentRequest;
import com.mkarani.zeraki.entity.StudentEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    @Override
    public void addStudent(StudentRequest studentDto) {
        StudentEntity studentEntity = StudentEntity.builder()
                .regNumber(studentDto.getRegNumber())
                .build();

    }

    public String genRegNumber(){

        return null;
    }
}

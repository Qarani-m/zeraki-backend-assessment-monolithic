package com.mkarani.zeraki.repository;

import com.mkarani.zeraki.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
    List<StudentEntity> findByCourse(String courseCode);

    List<StudentEntity> findAllByInstitution(Long institutionId);
}

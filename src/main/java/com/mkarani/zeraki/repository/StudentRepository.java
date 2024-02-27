package com.mkarani.zeraki.repository;

import com.mkarani.zeraki.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}

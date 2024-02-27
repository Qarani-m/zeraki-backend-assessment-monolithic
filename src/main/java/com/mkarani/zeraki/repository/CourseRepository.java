package com.mkarani.zeraki.repository;

import com.mkarani.zeraki.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
}

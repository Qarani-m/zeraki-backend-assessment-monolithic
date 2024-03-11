package com.mkarani.zeraki.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.mkarani.zeraki.entity.InstitutionEntity;


import java.util.List;
import java.util.Optional;

@Repository
public interface InstitutionRepository extends JpaRepository<InstitutionEntity, Long> {
    Optional<InstitutionEntity> findByName(String name);
    @Query(value = "SELECT * FROM institutions WHERE name LIKE %:keyword%", nativeQuery = true)
    List<InstitutionEntity> findByNameContaining(String keyword);


    @Query(value = "SELECT * FROM institutions ORDER BY name DESC", nativeQuery = true)
    List<InstitutionEntity> findAllOrderedByNameDesc();

    @Query(value = "SELECT * FROM institutions ORDER BY name ASC", nativeQuery = true)
    List<InstitutionEntity> findAllOrderedByNameAsc();



}

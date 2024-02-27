package com.mkarani.zeraki.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "institutions", uniqueConstraints = @UniqueConstraint(columnNames = {"name"}))
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class InstitutionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String city;
    private String county;
    private String country;
    private String phoneNumber;

    @ManyToMany
    @JoinTable(
            name = "institution_course",
            joinColumns = @JoinColumn(name = "institution_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<CourseEntity> coursesOffered;

    // Getters and setters
}
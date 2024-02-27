package com.mkarani.zeraki.dto;


import com.mkarani.zeraki.entity.CourseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InstitutionRequest {
    private String name;
    private String address;
    private String city;
    private String county;
    private String country;
    private String phoneNumber;
    private List<CourseEntity> coursesOffered;
}

package com.mkarani.zeraki.dto;

import lombok.*;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class StudentRequest {
    private String regNumber;
    
    private String name;
    private String email;
    private String course;
    private String institution;
}

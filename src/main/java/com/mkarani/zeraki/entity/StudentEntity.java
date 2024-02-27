package com.mkarani.zeraki.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "institutions", uniqueConstraints = @UniqueConstraint(columnNames = {"regNumber"}))
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String regNumber;
    private String name;
    private String email;
    private List<String> course;
    private String institution;
}

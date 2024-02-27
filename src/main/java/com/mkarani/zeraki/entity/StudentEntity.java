package com.mkarani.zeraki.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "institutions", uniqueConstraints = @UniqueConstraint(columnNames = {"name"}))
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "regNumber", unique = true)
    private String regNumber;

    private String name;

    private String email;

//    @ManyToOne
//    @JoinColumn(name = "course_id")
//    private Course course;

    @ManyToOne
    @JoinColumn(name = "institution_id")
    private InstitutionEntity institution;
}

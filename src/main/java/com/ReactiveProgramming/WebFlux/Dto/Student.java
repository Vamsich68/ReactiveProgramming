package com.ReactiveProgramming.WebFlux.Dto;


import jakarta.annotation.Generated;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@AllArgsConstructor
@Table
@NoArgsConstructor
@Data
public class Student {
    @Id
    private Integer id;
    @Column
    private String name;
}

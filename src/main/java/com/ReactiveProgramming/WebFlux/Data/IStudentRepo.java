package com.ReactiveProgramming.WebFlux.Data;


import com.ReactiveProgramming.WebFlux.Dto.Student;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IStudentRepo extends ReactiveCrudRepository<Student,Integer> {

}

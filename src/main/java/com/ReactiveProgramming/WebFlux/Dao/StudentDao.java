package com.ReactiveProgramming.WebFlux.Dao;

import com.ReactiveProgramming.WebFlux.Data.IStudentRepo;
import com.ReactiveProgramming.WebFlux.Dto.Student;

import com.ReactiveProgramming.WebFlux.Dto.StudentDto;
import com.ReactiveProgramming.WebFlux.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class StudentDao {

    private final IStudentRepo studentRepo;
    @Autowired
    public StudentDao(IStudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Mono<Student> create(Mono<Student> student){
        System.out.println("service method called");
        return student.flatMap(studentRepo::save).log();
//        return student.map(AppUtils::dtoToEntity)
//                .flatMap(studentRepo::save)
//                .map(AppUtils::entityToDto);
    }
}

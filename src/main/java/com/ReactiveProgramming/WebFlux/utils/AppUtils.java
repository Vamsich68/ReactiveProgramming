package com.ReactiveProgramming.WebFlux.utils;

import com.ReactiveProgramming.WebFlux.Dto.Student;
import com.ReactiveProgramming.WebFlux.Dto.StudentDto;
import org.springframework.beans.BeanUtils;

public class AppUtils {
    public static StudentDto entityToDto(Student student){
        StudentDto student1= new StudentDto();
        BeanUtils.copyProperties(student,student1);
        return student1;
    }
    public static Student dtoToEntity(StudentDto studentDto){
        Student student1= new Student();
        BeanUtils.copyProperties(studentDto,student1);
        return student1;
    }
}

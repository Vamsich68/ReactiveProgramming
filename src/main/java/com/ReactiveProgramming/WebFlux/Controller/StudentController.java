package com.ReactiveProgramming.WebFlux.Controller;


import com.ReactiveProgramming.WebFlux.Dao.StudentDao;
import com.ReactiveProgramming.WebFlux.Data.IStudentRepo;
import com.ReactiveProgramming.WebFlux.Dto.Student;
import com.ReactiveProgramming.WebFlux.Dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
@RestController
//@RequestMapping("/reactive")
public class StudentController {
    @Autowired
    private StudentDao studentDao;
    @Autowired
    private IStudentRepo studentRepo;

    public StudentController(IStudentRepo studentRepo, StudentDao studentDao) {
        this.studentRepo = studentRepo;
        this.studentDao=studentDao;
    }

    @PostMapping("/student")
    public Mono<Student> saveStudent(@RequestBody Mono<Student> studentMono){
        try{
            Mono<Student> res= studentDao.create(studentMono);
            System.out.println(res.log());
            return res;
        }
        catch(Exception ex){
            throw new RuntimeException("error while saving");
        }

    }
    @PostMapping("/createStudent")
    public Mono<Student> createStudent(@RequestBody Student student ){
        try {
            return studentRepo.save(student);
        }
        catch (Exception ex){
          throw new RuntimeException(ex.getMessage());
        }


    }
}

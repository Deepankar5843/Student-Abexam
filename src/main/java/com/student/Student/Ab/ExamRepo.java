package com.student.Student.Ab;

import com.student.Student.Ab.model.ExamDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ExamRepo extends MongoRepository<ExamDetails, Integer> {
    List<ExamDetails> findByRollNumber(String rollNumber);
    List<ExamDetails> findBySubject(String subject);
    ExamDetails findByRollNumberAndSubject(String rollNumber, String subject);




//    @Query("")
//    Integer getNumberofPresent(String rollNumber);
}

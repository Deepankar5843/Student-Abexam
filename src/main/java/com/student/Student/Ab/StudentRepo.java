package com.student.Student.Ab;

import com.student.Student.Ab.model.StudentDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepo extends MongoRepository<StudentDetails, Integer> {
    Optional<List<StudentDetails>> findById(String id);

}

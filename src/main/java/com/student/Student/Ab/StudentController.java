package com.student.Student.Ab;

import com.student.Student.Ab.model.ExamDetails;
import com.student.Student.Ab.model.ExamDetailsResponseBody;
import com.student.Student.Ab.model.StudentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/student")

public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private ExamRepo examRepo;


    @PostMapping("/addStudentDetails")
    List<StudentDetails> addStudentDetails(@RequestBody List<StudentDetails> studentDetails) {
        return studentRepo.saveAll(studentDetails);
    }

    @PostMapping("/addExamDetails")
    List<ExamDetails> addExamDetails(@RequestBody List<ExamDetails> examDetails) {
        return examRepo.saveAll(examDetails);
    }

    @GetMapping("/studentDetails/{id}")
    public Optional<List<StudentDetails>> getStudentDetails(@PathVariable("id") String id) {
        return studentRepo.findById(id);

    }

    @GetMapping("/examDetails")
    public ExamDetails getMarks(@RequestParam String rollNumber,
                                                  @RequestParam String subject) {
        return examRepo.findByRollNumberAndSubject(rollNumber, subject);
    }

    @GetMapping("/subjectMarks")
    public List<ExamDetails> getMarksForSubject(@RequestParam String subject) {
        return examRepo.findBySubject(subject);
    }

    @GetMapping("/getStudentMarks")
    public List<ExamDetailsResponseBody> getMarks(@RequestParam String rollNumber) {
        List<ExamDetails> examDetails = examRepo.findByRollNumber(rollNumber);
        List<ExamDetailsResponseBody> examDetailsResponseBodies = new ArrayList<>();
        examDetails.stream().map(details -> examDetailsResponseBodies.add(ExamDetailsResponseBody.builder().marks(details.getMarks()).subject(details.getSubject()).build())).toList();
        return examDetailsResponseBodies;
    }


}

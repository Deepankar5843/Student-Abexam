package com.student.Student.Ab.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "ExamDetails")
public class ExamDetails {
    private String rollNumber;
    private String subject;
    private Integer marks;
}
package com.student.Student.Ab.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "StudentDetails")
public class StudentDetails {

    private String id;
    private String name;
}




package com.student.Student.Ab.model;

import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ExamDetailsResponseBody {
    private String subject;
    private Integer marks;
}

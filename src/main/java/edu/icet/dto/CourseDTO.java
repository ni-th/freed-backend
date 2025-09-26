package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {
    private int subjectID;
    private String level;
    private String subjectOrCourseName;
    private String subjectOrCourse;
}

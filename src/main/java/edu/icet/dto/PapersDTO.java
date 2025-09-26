package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PapersDTO {
    private int uploadID;
    private String level;
    private String paperType;
    private String part;
    private String subjectOrCourseName;
    private String fileCode;
    private int year;
    private String medium;
    private String URL;
    private String fileName;
    private String filePath;
    private LocalDateTime uploadTime;
}

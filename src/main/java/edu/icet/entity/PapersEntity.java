package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PapersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uploadID;
    private String level;
    private String paperType;
    private String part;
    private String subjectOrCourseName;
    private String fileCode;
    private int year;
    private String medium;
    private String URL;
    @CreationTimestamp
    private LocalDateTime uploadTime;
}

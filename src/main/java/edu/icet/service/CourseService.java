package edu.icet.service;

import edu.icet.dto.CourseDTO;

import java.util.List;

public interface CourseService {
    CourseDTO createCourse(CourseDTO courseDTO);
    List<CourseDTO> getAllCourses();
    CourseDTO getCourseById(int id);
    CourseDTO updateCourse(CourseDTO courseDTO);
    void deleteCourse(int id);
}

package edu.icet.service.impl;

import edu.icet.dto.CourseDTO;
import edu.icet.entity.CourseEntity;
import edu.icet.repository.CourseRepository;
import edu.icet.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CourseServiceimpl implements CourseService {
    private final CourseRepository courseRepository;
    private final ModelMapper mapper;
    @Override
    public CourseDTO createCourse(CourseDTO courseDTO) {
        CourseEntity entity = mapper.map(courseDTO, CourseEntity.class);
        CourseEntity savedEntity = courseRepository.save(entity);
        return mapper.map(savedEntity, CourseDTO.class);
    }

    @Override
    public List<CourseDTO> getAllCourses() {
        List<CourseDTO> courseDTOs = new ArrayList<>();
        courseRepository.findAll().forEach(courseEntity -> {
            courseDTOs.add(mapper.map(courseEntity, CourseDTO.class));
        });
        return courseDTOs;
    }

    @Override
    public CourseDTO getCourseById(int id) {
        return mapper.map(courseRepository.findById(id).get(), CourseDTO.class);

    }

    @Override
    public CourseDTO updateCourse(CourseDTO courseDTO) {
        CourseEntity entity = mapper.map(courseDTO, CourseEntity.class);
        CourseEntity savedEntity = courseRepository.save(entity);
        return mapper.map(savedEntity, CourseDTO.class);
    }

    @Override
    public void deleteCourse(int id) {
        courseRepository.deleteById(id);
    }
}

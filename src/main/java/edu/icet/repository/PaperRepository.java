package edu.icet.repository;

import edu.icet.entity.PaperEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaperRepository extends JpaRepository<PaperEntity, Integer> {

    List<PaperEntity> findByLevel(String level);





}

package edu.icet.repository;

import edu.icet.entity.PapersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaperRepository extends JpaRepository<PapersEntity, Integer> {
}

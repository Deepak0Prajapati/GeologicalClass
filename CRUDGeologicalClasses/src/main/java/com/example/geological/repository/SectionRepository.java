package com.example.geological.repository;

import com.example.geological.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SectionRepository extends JpaRepository<Section, Long> {
    List<Section> findByGeologicalClassesCode(String code);
}

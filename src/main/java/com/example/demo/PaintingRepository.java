package com.example.demo;

import com.example.demo.Painting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaintingRepository extends JpaRepository<Painting, Long> {
    List<Painting> findByTitleContainingIgnoreCase(String title);
}

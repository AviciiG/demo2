package com.example.demo;

import com.example.demo.Painting;
import com.example.demo.PaintingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaintingService {

    private final PaintingRepository paintingRepository;

    public PaintingService(PaintingRepository paintingRepository) {
        this.paintingRepository = paintingRepository;
    }

    public List<Painting> searchByTitle(String title) {
        return paintingRepository.findByTitleContainingIgnoreCase(title);
    }
}

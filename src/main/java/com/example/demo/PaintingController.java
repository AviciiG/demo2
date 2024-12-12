package com.example.demo;

import com.example.demo.Painting;
import com.example.demo.PaintingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PaintingController {

    private final PaintingService paintingService;

    public PaintingController(PaintingService paintingService) {
        this.paintingService = paintingService;
    }

    @GetMapping("/paintings")
    public String showSearchPage() {
        return "paintings";
    }

    @GetMapping("/painting-result")
    public String searchPainting(@RequestParam("title") String title, Model model) {
        List<Painting> paintings = paintingService.searchByTitle(title);
        model.addAttribute("paintings", paintings);
        model.addAttribute("searchTerm", title);
        return "painting-result";
    }
}

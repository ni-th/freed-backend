package edu.icet.controller;

import edu.icet.dto.PaperDTO;
import edu.icet.service.PaperService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/api/paper")
public class PaperController {
    private final PaperService paperService;

    @PostMapping("/create")
    public ResponseEntity<PaperDTO> createPaper(@RequestBody PaperDTO paperDTO) {
        PaperDTO createdPaper = paperService.createPaper(paperDTO);
        return ResponseEntity.ok(createdPaper);
    }

    @GetMapping("/all")
    public ResponseEntity<List<PaperDTO>> getAllPapers() {
        List<PaperDTO> papers = paperService.getAllPapers();
        return ResponseEntity.ok(papers);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<PaperDTO> getPaperById(@PathVariable int id) {
        PaperDTO paperDTO = paperService.getPaperById(id);
        return ResponseEntity.ok(paperDTO);
    }

    @PutMapping("/update")
    public ResponseEntity<PaperDTO> updatePaper(@RequestBody PaperDTO paperDTO) {
        PaperDTO updatedPaper = paperService.updatePaper(paperDTO);
        return ResponseEntity.ok(updatedPaper);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deletePaper(@PathVariable int id) {
        paperService.deletePaper(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/by-level")
    public ResponseEntity<List<PaperDTO>> getByLevel(@RequestParam(required = false) String level) {
        List<PaperDTO> papers;

        if (level != null && !level.isEmpty()) {
            papers = paperService.findByLevel(level); // fetch by level
        } else {
            papers = paperService.getAllPapers(); // fetch all papers if no level provided
        }

        return ResponseEntity.ok(papers);
    }

}

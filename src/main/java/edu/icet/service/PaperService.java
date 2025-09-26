package edu.icet.service;

import edu.icet.dto.PaperDTO;

import java.util.List;

public interface PaperService {
    PaperDTO createPaper(PaperDTO paperDTO);
    List<PaperDTO> getAllPapers();
    PaperDTO getPaperById(int id);
    PaperDTO updatePaper(PaperDTO paperDTO);
    void deletePaper(int id);
}

package edu.icet.service.impl;

import edu.icet.dto.PaperDTO;
import edu.icet.entity.PapersEntity;
import edu.icet.repository.PaperRepository;
import edu.icet.service.PaperService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PaperServiceImpl implements PaperService {

    private final PaperRepository paperRepository;
    private final ModelMapper mapper;


    public PaperDTO createPaper(PaperDTO paper) {

        return mapper.map(mapper.map(paper, PaperDTO.class), PaperDTO.class);
    }

    @Override
    public List<PaperDTO> getAllPapers() {
        List<PaperDTO> paperDTOList = new ArrayList<>();
        paperRepository.findAll().forEach(paper -> {
            paperDTOList.add(mapper.map(paper, PaperDTO.class));
        });
        return paperDTOList;
    }

    @Override
    public PaperDTO getPaperById(int id) {
        return mapper.map(paperRepository.findById(id).get(), PaperDTO.class);
    }

    @Override
    public PaperDTO updatePaper(PaperDTO paperDTO) {
        return mapper.map(paperRepository.save(mapper.map(paperDTO, PapersEntity.class)), PaperDTO.class);
    }

    @Override
    public void deletePaper(int id) {
        paperRepository.deleteById(id);
    }


}

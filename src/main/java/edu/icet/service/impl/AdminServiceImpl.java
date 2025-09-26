package edu.icet.service.impl;

import edu.icet.dto.AdminDTO;
import edu.icet.entity.AdminEntity;
import edu.icet.repository.AdminRepository;
import edu.icet.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class AdminServiceImpl implements AdminService {
    private final AdminRepository adminRepository;
    private final ModelMapper mapper;


    @Override
    public AdminDTO createAdmin(AdminDTO adminDTO) {
        AdminEntity entity = mapper.map(adminDTO, AdminEntity.class);
        AdminEntity savedEntity = adminRepository.save(entity);
        return mapper.map(savedEntity, AdminDTO.class);
    }

    @Override
    public List<AdminDTO> getAllAdmins() {
        List<AdminDTO> adminDTOs = new ArrayList<>();
        adminRepository.findAll().forEach(adminEntity -> {
            adminDTOs.add(mapper.map(adminEntity, AdminDTO.class));
        });
        return adminDTOs;
    }

    @Override
    public AdminDTO getAdminById(int id) {
        return mapper.map(adminRepository.getOne(id), AdminDTO.class);
    }

    @Override
    public AdminDTO updateAdmin(AdminDTO adminDTO) {
        AdminEntity entity = mapper.map(adminDTO, AdminEntity.class);
        AdminEntity savedEntity = adminRepository.save(entity);
        return mapper.map(savedEntity, AdminDTO.class);
    }

    @Override
    public void deleteAdmin(int id) {
        adminRepository.deleteById(id);
    }
    @Override
    public AdminDTO login(String username, String password) {
        Optional<AdminEntity> admin = adminRepository.findByEmailAndPassword(username, password);
        if (admin == null) {
            return null;
        }else{
            return mapper.map(admin, AdminDTO.class);
        }

    }
}

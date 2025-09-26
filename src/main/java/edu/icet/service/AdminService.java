package edu.icet.service;

import edu.icet.dto.AdminDTO;

import java.util.List;

public interface AdminService {
    AdminDTO createAdmin(AdminDTO adminDTO);
    List<AdminDTO> getAllAdmins();
    AdminDTO getAdminById(int id);
    AdminDTO updateAdmin(AdminDTO adminDTO);
    void deleteAdmin(int id);
    AdminDTO login(String username, String password);
}

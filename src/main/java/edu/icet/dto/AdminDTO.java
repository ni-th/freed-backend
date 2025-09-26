package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AdminDTO {
    private int adminID;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}

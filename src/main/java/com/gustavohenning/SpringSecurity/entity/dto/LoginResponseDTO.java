package com.gustavohenning.SpringSecurity.entity.dto;

import com.gustavohenning.SpringSecurity.entity.ApplicationUser;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class LoginResponseDTO {

    private ApplicationUser user;
    private String jwt;


}

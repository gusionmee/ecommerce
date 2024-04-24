package com.api.apiblog.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsersDTO {
    private String email;
    private String fistName;
    private String lastName;
    private String mobile;
    private String pass;
    private Long id;


}

package sena.crudbasic.Dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UsersDto {
    private int idUser;
    private String userName;
    private String email;
    private String password;
    private Timestamp createdAt;
    private boolean active;
}
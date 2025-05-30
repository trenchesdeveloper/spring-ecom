package com.trenchesdeveloper.store.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class UserDto {
    private Long id;

    private String name;

    private String email;

}

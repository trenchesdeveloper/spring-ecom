package com.trenchesdeveloper.store.mappers;

import com.trenchesdeveloper.store.dtos.UserDto;
import com.trenchesdeveloper.store.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);
}

package com.trenchesdeveloper.store.controllers;

import com.trenchesdeveloper.store.dtos.UserDto;
import com.trenchesdeveloper.store.entities.User;
import com.trenchesdeveloper.store.mappers.UserMapper;
import com.trenchesdeveloper.store.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @GetMapping
    public Iterable<UserDto> getAllUsers(
            @RequestParam(required = false) String sortBy
    ) {
        if (Set.of("id", "name", "email").contains(sortBy))
            sortBy = "id";
        return userRepository.findAll(
                Sort.by(sortBy)
                )
                .stream()
                .map(userMapper::toDto)
                .toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long id) {
        var user = userRepository.findById(id).orElse(null);

        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        var userDto = userMapper.toDto(user);
        return ResponseEntity.ok(userDto);
    }
}

package it.corso.mygym.controller;

import it.corso.mygym.model.User;
import it.corso.mygym.model.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/users")
public interface UserController {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    ResponseEntity<User> save(@RequestBody UserDto userDto);

    @GetMapping("/{id}")
    ResponseEntity<User> findById(@PathVariable(value="id") Long id);

    @GetMapping()
    ResponseEntity<List<User>> findAll();

    @DeleteMapping("/delete/{id}")
    ResponseEntity<?> delete(@PathVariable(value = "id") Long id);

    @PutMapping("/{id}")
    ResponseEntity<User> update(@PathVariable(value = "id") Long id, @Valid @RequestBody UserDto userDto);

}

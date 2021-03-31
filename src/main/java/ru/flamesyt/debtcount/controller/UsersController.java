package ru.flamesyt.debtcount.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/users")
@RestController
public class UsersController {
    //TODO: Сделать контроллер с авторизацией пользователя
    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public String getAllUsers(@RequestParam(value = "billId", required = false) String billId) {
        if (billId != null) {
            return "Info about users with billId " + billId;
        }
        return "all users";
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable long id) {
        return String.format("Here is user with id %d", id);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    public String addUser(@RequestBody String user) {
        return "User " + user + " successfully added";
    }
}

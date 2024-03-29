package ru.practicum.shareit.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.practicum.shareit.user.dto.UserDto;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService service;

    @GetMapping("/{userId}")
    public UserDto getById(@PathVariable long userId) {
        log.debug("Принят запрос на отображение пользователя {}", userId);
        return service.getById(userId);
    }

    @GetMapping
    public List<UserDto> getUsers() {
        log.debug("Принят запрос на вывод всех пользователей");
        return service.getAll();
    }

    @PostMapping
    public UserDto createUser(@RequestBody UserDto userDto) {
        log.debug("Принят запрос на создание пользователя по имени {}", userDto.getName());
        return service.add(userDto);
    }

    @PatchMapping("/{userId}")
    public UserDto updateUser(@PathVariable long userId, @RequestBody UserDto userDto) {
        log.debug("Принят запрос на обновление пользователя {}", userId);
        return service.update(userDto, userId);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable long userId) {
        log.debug("Принят запрос на удаление пользователя {}", userId);
        service.delete(userId);
    }
}
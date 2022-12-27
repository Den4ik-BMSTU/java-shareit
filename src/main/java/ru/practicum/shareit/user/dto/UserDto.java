package ru.practicum.shareit.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.practicum.shareit.misc.Marker;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class UserDto {

    //@Null(groups = Marker.OnUpdate.class) какой-то смысл у меня в этом был, сейчас вспомнить не могу, пока уберу,
    // если вспомню, то верну
    private Long id;
    @NotNull(groups = Marker.OnCreate.class)
    private String name;
    @NotNull(groups = Marker.OnCreate.class)
    @Email(groups = Marker.OnCreate.class)
    private String email;
}
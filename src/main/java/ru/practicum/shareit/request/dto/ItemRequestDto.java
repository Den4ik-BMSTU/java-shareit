package ru.practicum.shareit.request.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.practicum.shareit.misc.Marker;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ItemRequestDto {
    private Long id;
    @NotBlank(groups = Marker.OnCreate.class)
    private String description;
    private LocalDateTime created;
}

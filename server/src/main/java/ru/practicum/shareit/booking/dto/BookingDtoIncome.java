package ru.practicum.shareit.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class BookingDtoIncome {

    private LocalDateTime start;
    private LocalDateTime end;
    private Long itemId;
}
package ru.practicum.shareit.booking;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import ru.practicum.shareit.item.model.Item;
import ru.practicum.shareit.user.User;

import java.time.LocalDateTime;

/**
 * TODO Sprint add-bookings.
 */
@RequiredArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Booking {

    long id;
    LocalDateTime start;
    LocalDateTime end;
    Item item;
    User booker;
    String status;

}
package com.github.bvigentas.schoords.controller;

import com.github.bvigentas.schoords.entity.Room;
import com.github.bvigentas.schoords.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService service;

    @PostMapping
    public void add(@Validated @RequestBody Room room) {
        service.add(room);
    }

    @GetMapping("/{id}")
    private Room find(@PathVariable Long id) {
        return service.find(id);
    }

}

package com.github.bvigentas.schoords.service;

import com.github.bvigentas.schoords.entity.Room;
import com.github.bvigentas.schoords.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    @Autowired
    private RoomRepository repository;

    public void add(Room room) {

        Room roomDB = repository.findByDescricao(room.getDescricao());

        if (roomDB == null) {
            repository.save(room);
        } else {
            //Exception
        }

    }

    public Room find(Long id) {
        return repository.getOne(id);
    }

}

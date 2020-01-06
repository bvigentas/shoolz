package com.github.bvigentas.schoords.room.repository;

import com.github.bvigentas.schoords.room.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    Room findByDescricao(String descricao);

}

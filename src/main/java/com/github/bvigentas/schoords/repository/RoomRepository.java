package com.github.bvigentas.schoords.repository;

import com.github.bvigentas.schoords.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    Room findByDescricao(String descricao);

}

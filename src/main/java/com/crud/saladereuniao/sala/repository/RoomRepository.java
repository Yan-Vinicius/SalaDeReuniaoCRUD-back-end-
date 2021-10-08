package com.crud.saladereuniao.sala.repository;

import com.crud.saladereuniao.sala.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}

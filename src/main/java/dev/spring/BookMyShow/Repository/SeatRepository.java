package dev.spring.BookMyShow.Repository;

import dev.spring.BookMyShow.Model.Seat;
import dev.spring.BookMyShow.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SeatRepository extends JpaRepository<Seat, UUID> {

}

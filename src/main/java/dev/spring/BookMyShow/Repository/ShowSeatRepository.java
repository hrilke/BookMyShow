package dev.spring.BookMyShow.Repository;

import dev.spring.BookMyShow.Model.ShowSeat;
import dev.spring.BookMyShow.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, UUID> {

}

package dev.spring.BookMyShow.Repository;

import dev.spring.BookMyShow.Model.Theatre;
import dev.spring.BookMyShow.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, UUID> {

}

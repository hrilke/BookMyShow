package dev.spring.BookMyShow.Repository;

import dev.spring.BookMyShow.Model.Ticket;
import dev.spring.BookMyShow.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}

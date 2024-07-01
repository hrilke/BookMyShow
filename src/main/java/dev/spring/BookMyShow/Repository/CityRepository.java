package dev.spring.BookMyShow.Repository;

import dev.spring.BookMyShow.DTO.CityResponseDTO;
import dev.spring.BookMyShow.Model.City;
import dev.spring.BookMyShow.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CityRepository extends JpaRepository<City, UUID> {
    City getCityByName(String name);
}

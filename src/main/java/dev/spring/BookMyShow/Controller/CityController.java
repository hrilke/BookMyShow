package dev.spring.BookMyShow.Controller;

import dev.spring.BookMyShow.DTO.CityRequestDTO;
import dev.spring.BookMyShow.DTO.CityResponseDTO;
import dev.spring.BookMyShow.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    @Autowired
    private CityService cityservice;

    @GetMapping("/city/{name}")
    public ResponseEntity<CityResponseDTO> getCityByName(@PathVariable("name") String cityName) {
        CityResponseDTO cityResponseDTO = cityservice.getCityByName(cityName);
        return ResponseEntity.ok(cityResponseDTO);
    }

    @PostMapping("/city")
    public ResponseEntity<CityResponseDTO> createCity(@RequestBody CityRequestDTO cityRequestDTO) {
        CityResponseDTO cityResponseDTO = cityservice.saveNewCity(cityRequestDTO);
        return ResponseEntity.ok(cityResponseDTO);
    }
}

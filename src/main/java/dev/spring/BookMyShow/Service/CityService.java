package dev.spring.BookMyShow.Service;

import dev.spring.BookMyShow.DTO.CityRequestDTO;
import dev.spring.BookMyShow.DTO.CityResponseDTO;
import dev.spring.BookMyShow.Model.City;
import dev.spring.BookMyShow.Repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public CityResponseDTO getCityByName(String cityName) {
        City city = cityRepository.getCityByName(cityName);
        CityResponseDTO cityResponseDTO = new CityResponseDTO(city.getName(),city.getTheatreList());
        return cityResponseDTO;
    }

    public CityResponseDTO saveNewCity(CityRequestDTO cityRequestDTO) {
        City city = new City(cityRequestDTO.getName());
        cityRepository.save(city);
        return new CityResponseDTO(city.getName(),city.getTheatreList());
    }
}

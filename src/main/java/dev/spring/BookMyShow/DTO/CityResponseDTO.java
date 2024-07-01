package dev.spring.BookMyShow.DTO;
import dev.spring.BookMyShow.Model.Theatre;

import java.io.Serializable;
import java.util.List;

public class CityResponseDTO implements Serializable {
    private String name;
    private List<Theatre> theatreList;

}

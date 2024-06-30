package dev.spring.BookMyShow.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.ls.LSException;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel{
    private String name;
    private String address;
    @OneToMany
    private List<Auditorium> auditoriumList;

    public Theatre(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Theatre() {
    }
}

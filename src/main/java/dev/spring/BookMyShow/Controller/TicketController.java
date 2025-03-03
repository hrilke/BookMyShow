package dev.spring.BookMyShow.Controller;

import dev.spring.BookMyShow.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping("/hello")
    public ResponseEntity greet() {
        String greet = ticketService.greet();
        return ResponseEntity.ok(greet);
    }
}

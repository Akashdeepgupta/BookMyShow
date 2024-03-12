package dev.akash.BookMyShow.controller;

import dev.akash.BookMyShow.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //tells spring this is a controller based on rest Api
public class TicketController {
    @Autowired //create the dependency object and inject inside the controller
    private TicketService ticketService;

    @GetMapping("/hello")
    public ResponseEntity greet(){
        String greet = ticketService.greet();
        return ResponseEntity.ok(greet);
    }
}

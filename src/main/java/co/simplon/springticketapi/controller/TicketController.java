package co.simplon.springticketapi.controller;

import co.simplon.springticketapi.dao.LearnerDao;
import co.simplon.springticketapi.dao.TicketDao;
import co.simplon.springticketapi.model.Ticket;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/tickets")
@RestController
public class TicketController {

    private final TicketDao ticketDao;

    public TicketController(TicketDao ticketDao) {
        this.ticketDao = ticketDao;
    }

    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketDao.getAll();
    }

    @GetMapping("/{id}")
    public Ticket getTicket(@PathVariable Long id)  {  return ticketDao.get(id);  }

    @PostMapping
    public void createTicket(@RequestBody Ticket ticket) { ticketDao.save(ticket); }

    @PutMapping("/{id}")
    public void updateTicket(@PathVariable Long id)  {  ticketDao.update(id);  }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id) {ticketDao.delete(id);}

}

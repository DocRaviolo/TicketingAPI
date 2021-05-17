package co.simplon.springticketapi.dao;

import co.simplon.springticketapi.model.Ticket;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TicketDao implements Dao<Ticket> {

    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Ticket> ticketRowMapper;

    public TicketDao(JdbcTemplate jdbcTemplate, RowMapper<Ticket> ticketRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.ticketRowMapper = ticketRowMapper;
    }

    @Override
    public Ticket get(Long id) {
        return jdbcTemplate.queryForObject("select * from ticket where id = ?", ticketRowMapper, id);
    }

    @Override
    public List<Ticket> getAll() {
        return jdbcTemplate.query("select * from ticket", ticketRowMapper);
    }

    @Override
    public void save(Ticket ticket) {
       jdbcTemplate.update("INSERT INTO ticket (solved, description, idx_learner, date) VALUES (?,?,?,?)", ticket.getSolved(), ticket.getDescription(), ticket.getIdx_learner(), ticket.getDate() );
    }

    public void update(Long id) {
        jdbcTemplate.update("UPDATE ticket SET solved ='true' where id=?");
    }

    @Override
    public void delete(Long id) {
        jdbcTemplate.update("DELETE from ticket where id=?");
    }
}

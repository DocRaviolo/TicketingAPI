package co.simplon.springticketapi.dao;

import co.simplon.springticketapi.model.Learner;
import co.simplon.springticketapi.model.Ticket;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LearnerDao implements Dao<Learner> {

    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Learner> learnerRowMapper;

    public LearnerDao(JdbcTemplate jdbcTemplate, RowMapper<Learner> learnerRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.learnerRowMapper = learnerRowMapper;
    }

    @Override
    public Learner get(Long id) {
        return jdbcTemplate.queryForObject("select * from learner where id = ?", learnerRowMapper, id);
    }

    @Override
    public List<Learner> getAll() {
        return jdbcTemplate.query("select * from learner", learnerRowMapper);
    }

    @Override
    public void save(Learner learner) {
        //jdbcTemplate.query("select * from ticket", ticketRowMapper);
        // A vous de jouer
    }

    @Override
    public void delete(Long id) {
        // A vous de jouer
    }
}
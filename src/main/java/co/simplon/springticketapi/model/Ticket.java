package co.simplon.springticketapi.model;

import java.time.LocalDateTime;

public class Ticket {
    private Integer id;
    private Boolean solved;
    private String description;
    private Long idx_learner;
    private LocalDateTime date;

    public Ticket(LocalDateTime localDateTime) {
        this.date = localDateTime;
    }

    public Ticket(Integer id, LocalDateTime date, Boolean solved, String description, Long idx_learner) {
        this.id = id;
        this.date = date;
        this.solved = solved;
        this.description = description;
        this.idx_learner = idx_learner;
    }

    public Integer getId() { return id;    }
    public Boolean getSolved() { return solved;  }
    public String getDescription() {  return description; }
    public Long getIdx_learner() { return idx_learner; }
    public LocalDateTime getDate() { return date; }
}

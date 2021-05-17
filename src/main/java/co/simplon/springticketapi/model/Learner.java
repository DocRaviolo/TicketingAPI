package co.simplon.springticketapi.model;

public class Learner {
    private Long id;
    private String name;

    public Learner(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

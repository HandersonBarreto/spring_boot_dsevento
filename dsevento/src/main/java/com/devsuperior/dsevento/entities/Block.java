package com.devsuperior.dsevento.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_block")
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant start;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant endProject;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    public  Block(){

    }

    public Block(Instant endProject, Instant start, Integer id) {
        this.endProject = endProject;
        this.start = start;
        this.id = id;
    }

    public Instant getEndProject() {
        return endProject;
    }

    public void setEndProject(Instant endProject) {
        this.endProject = endProject;
    }

    public Instant getStart() {
        return start;
    }

    public void setStart(Instant start) {
        this.start = start;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Activity getActivity() {
        return activity;
    }
}

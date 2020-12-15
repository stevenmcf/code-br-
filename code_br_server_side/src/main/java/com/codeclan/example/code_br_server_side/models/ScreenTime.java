package com.codeclan.example.code_br_server_side.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="screenTime")

public class ScreenTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "hours")
    private int hours;

    @JsonIgnoreProperties({"screenTime"})
    @OneToOne (mappedBy = "screenTime", fetch = FetchType.LAZY)
    private DiaryEntry diaryEntry;

    public ScreenTime(int hours, DiaryEntry diaryEntry) {
        this.hours = hours;
        this.diaryEntry = diaryEntry;
    }

    public ScreenTime (){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}

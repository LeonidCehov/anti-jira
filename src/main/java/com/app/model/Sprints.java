package com.app.model;

import java.sql.Timestamp;

public class Sprints {
    private long id;
    private long projectId;
    private Timestamp startDate;
    private Timestamp endDate;
    private int sprintNr;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public int getSprintNr() {
        return sprintNr;
    }

    public void setSprintNr(int sprintNr) {
        this.sprintNr = sprintNr;
    }
}

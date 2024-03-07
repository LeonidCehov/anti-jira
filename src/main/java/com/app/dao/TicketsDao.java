package com.app.dao;

import com.app.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TicketsDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void storeNewTicket(Ticket ticket) {
        jdbcTemplate.update("INSERT INTO tickets (summary, description, reporter_id, project_id)" +
                "VALUES (?, ?, ?, ?)", ticket.getSummery(), ticket.getDescription(), ticket.getReporterId(),
                ticket.getProjectId());
    }
}

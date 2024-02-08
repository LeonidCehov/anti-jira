package com.app.dao;

import com.app.model.Statuses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StatusesDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void StoreNewStatuses(Statuses statuses){
        jdbcTemplate.update("INSERT INTO statuses(name)" + "VALUE ?)", statuses.getName());

    }
}

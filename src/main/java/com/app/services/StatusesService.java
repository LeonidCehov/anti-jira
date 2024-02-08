package com.app.services;

import com.app.dao.StatusesDAO;
import com.app.model.Statuses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusesService {
    @Autowired
    private StatusesDAO statusesDAO;

    public void storeNewStatuses(Statuses statuses){
        statusesDAO.StoreNewStatuses(statuses);

    }
}

package com.app.services;

import com.app.dao.LabelDao;
import com.app.model.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabelServices {
    @Autowired
    private LabelDao labelDao;

    public void storeNewLabel(Label label){
        labelDao.storeNewLabel(label);
    }
}

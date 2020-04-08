package lianxi.lianxi.dao.impl;

import lianxi.lianxi.dao.api.Showservice;
import lianxi.lianxi.entity.name;
import lianxi.lianxi.mapper.Showmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Showserviceimpl implements Showservice {

    @Autowired
    private Showmapper showmapper;

    @Override
    public List<name> show() {
        return  showmapper.show();
    }
}

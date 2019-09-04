package com.qfedu.ams.service.impl;

import com.qfedu.ams.dao.CountDao;
import com.qfedu.ams.entity.Count;
import com.qfedu.ams.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountServiceImpl implements CountService {

    @Autowired(required = false)
    private CountDao countDao;

    @Override
    public List<Count> findAllCount() {
        List<Count> list = countDao.findAllCount();
        return list;
    }
}

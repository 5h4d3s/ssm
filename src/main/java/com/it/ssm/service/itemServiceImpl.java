package com.it.ssm.service;

import com.it.ssm.dao.itemMapper;
import com.it.ssm.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class itemServiceImpl implements itemService{
    @Autowired
    private itemMapper itemMapper;
    @Override
    public Item findById(int id) {
        return itemMapper.finById(id);
    }
}

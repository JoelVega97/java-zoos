package com.lambda.zoo.services;

import com.lambda.zoo.models.Zoo;
import com.lambda.zoo.repository.ZooRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "zooService")
public class ZooServiceImpl implements ZooService {

    @Autowired
    ZooRepo zooRepo;

    @Override
    public List<Zoo> findAllZoos() {
        List<Zoo> list = new ArrayList<>();
        zooRepo .findAll()
                .iterator()
                .forEachRemaining(list::add);
        return list;
    }

    @Override
    public Zoo findZooById(long id) {
        return zooRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Zoo id " + id + " Not Found!"));
    }

}

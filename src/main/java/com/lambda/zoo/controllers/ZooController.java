package com.lambda.zoo.controllers;

import com.lambda.zoo.models.Zoo;
import com.lambda.zoo.services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/zoos")
public class ZooController {

    @Autowired
    ZooService zooService;

    @GetMapping(value = "/zoos", produces = "application/json")
    public ResponseEntity<?> findAllZoos() {
        List<Zoo> zooList = zooService.findAllZoos();
        return new ResponseEntity<>(zooList, HttpStatus.OK);
    }

}

package com.example.springwebvalidatorenumdate.controller;

import com.example.springwebvalidatorenumdate.model.Visit;
import com.example.springwebvalidatorenumdate.repo.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VisitController {

    @Autowired
    VisitRepository vr;

    @GetMapping
    public List<Visit> findVisit(){
        return vr.findAll();
    }
}

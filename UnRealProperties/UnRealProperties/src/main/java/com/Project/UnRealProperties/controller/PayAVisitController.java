package com.Project.UnRealProperties.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Project.UnRealProperties.model.PayAVisit;
import com.Project.UnRealProperties.service.PayAVisitService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PayAVisitController {

	@Autowired
    private final PayAVisitService payAVisitService;

    
    public PayAVisitController(PayAVisitService payAVisitService) {
        this.payAVisitService = payAVisitService;
    }

    @PostMapping("/payavisit")
    public ResponseEntity<String> payAVisit(@RequestBody PayAVisit payAVisit) {
        payAVisitService.savePayAVisit(payAVisit);
        return new ResponseEntity<>("PayAVisit saved successfully!", HttpStatus.CREATED);
    }
}
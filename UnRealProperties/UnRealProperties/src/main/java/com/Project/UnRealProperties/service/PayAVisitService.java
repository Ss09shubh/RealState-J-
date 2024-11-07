package com.Project.UnRealProperties.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.UnRealProperties.model.PayAVisit;
import com.Project.UnRealProperties.repository.PayAVisitRepository;

@Service
public class PayAVisitService {

    private final PayAVisitRepository payAVisitRepository;

    @Autowired
    public PayAVisitService(PayAVisitRepository payAVisitRepository) {
        this.payAVisitRepository = payAVisitRepository;
    }

    public PayAVisit savePayAVisit(PayAVisit payAVisit) {
        return payAVisitRepository.save(payAVisit);
    }
}
package com.pplanello.foodtracker.service.impl;

import com.pplanello.foodtracker.service.ProofService;
import org.springframework.stereotype.Service;

@Service
public class ProofServiceImpl implements ProofService {

    @Override
    public String helloWorld() {
        return "Hello World!";
    }
}

package com.pplanello.foodtracker.controller;

import com.pplanello.foodtracker.service.ProofService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("proof")
public class ProofController {

    @Autowired
    private ProofService proofService;

    @GetMapping()
    public ResponseEntity<String> getProof() {
        return new ResponseEntity<>(proofService.helloWorld(), HttpStatus.OK);
    }
}

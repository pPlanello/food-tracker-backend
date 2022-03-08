package com.pplanello.foodtracker.controller;

import com.pplanello.foodtracker.service.ProofService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("proof")
@Tag(name = "ProofController", description = "This is a example controller")
public class ProofController {

    @Autowired
    private ProofService proofService;

    @Operation(summary = "", description = "")
    @GetMapping()
    public ResponseEntity<String> getProof() {
        return new ResponseEntity<>(proofService.helloWorld(), HttpStatus.OK);
    }
}

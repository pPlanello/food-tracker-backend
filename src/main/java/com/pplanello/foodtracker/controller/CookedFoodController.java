package com.pplanello.foodtracker.controller;

import com.pplanello.foodtracker.entity.CookedFood;
import com.pplanello.foodtracker.service.CookedFoodService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("cooked-food")
@Tag(name = "CookedFoodController", description = "This is a controller for cooked food")
public class CookedFoodController {

    @Autowired
    private CookedFoodService cookedFoodService;

    @GetMapping("")
    @Operation(summary = "Get all", description = "Obtain all the entity of cooked food in database")
    public ResponseEntity<List<CookedFood>> getAllCookedFood() {
        return new ResponseEntity<>(cookedFoodService.getAllCookedFood(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get by Id", description = "Obtain the entity of cooked food in database by identifier")
    public ResponseEntity<CookedFood> getCookedFoodById(@PathVariable("id") @Parameter(name = "id", description = "Identifier of cooked food") Long id) {
        return new ResponseEntity<>(cookedFoodService.getCookedFoodById(id), HttpStatus.OK);
    }

    @PostMapping("")
    @Operation(summary = "Create", description = "Create a cooked food")
    public ResponseEntity<CookedFood> createCookedFood(@RequestBody CookedFood cookedFood) {
        return new ResponseEntity<>(cookedFoodService.createCookedFood(cookedFood), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update", description = "Update a cooked food")
    public ResponseEntity<CookedFood> updateCookedFood(@PathVariable("id") @Parameter(name = "id", description = "Identifier of cooked food") Long id, @RequestBody CookedFood cookedFood) {
        return new ResponseEntity<>(cookedFoodService.updateCookedFood(cookedFood, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete", description = "Delete a cooked food")
    public ResponseEntity<Long> deleteCookedFood(@PathVariable("id") @Parameter(name = "id", description = "Identifier of cooked food") Long id) {
        return new ResponseEntity<>(cookedFoodService.deleteCookedFood(id), HttpStatus.OK);
    }
}

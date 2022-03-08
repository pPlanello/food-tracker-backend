package com.pplanello.foodtracker.service.impl;

import com.pplanello.foodtracker.entity.CookedFood;
import com.pplanello.foodtracker.repository.CookedFoodRepository;
import com.pplanello.foodtracker.service.CookedFoodService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CookedFoodServiceImpl implements CookedFoodService {

    private static final Logger log = LogManager.getLogger(CookedFoodServiceImpl.class);

    @Autowired
    private CookedFoodRepository cookedFoodRepository;

    @Override
    public List<CookedFood> getAllCookedFood() {
        List<CookedFood> cookedFoodList = new ArrayList<>();
        try {
            cookedFoodList = cookedFoodRepository.findAll();
        } catch (Exception e) {
            // TODO: Manage error
            log.error(String.valueOf(e), e);
        }
        return cookedFoodList;
    }

    @Override
    public CookedFood getCookedFoodById(Long id) {
        Optional<CookedFood> cookedFood = null;
        try {
            cookedFood = cookedFoodRepository.findById(id);
        } catch (Exception e) {
            // TODO: Manage error
            log.error(String.valueOf(e), e);
        }
        return cookedFood.orElse(null);
    }

    @Override
    public CookedFood createCookedFood(CookedFood cookedFood) {
        CookedFood cookedFoodCreated = null;
        if (cookedFood.getCreatedOn() == null) {
            cookedFood.setCreatedOn(LocalDateTime.now());
        }
        try {
            cookedFoodCreated = cookedFoodRepository.save(cookedFood);
        } catch (Exception e) {
            // TODO: Manage error
            log.error(String.valueOf(e), e);
        }
        return cookedFoodCreated;
    }

    @Override
    public CookedFood updateCookedFood(CookedFood cookedFood, Long id) {
        CookedFood cookedFoodCreated = null;
        try {
            cookedFoodCreated = cookedFoodRepository.saveAndFlush(cookedFood);
        } catch (Exception e) {
            // TODO: Manage error
            log.error(String.valueOf(e), e);
        }
        return cookedFoodCreated;
    }

    @Override
    public Long deleteCookedFood(Long id) {
        Optional<CookedFood> cookedFood = null;
        try {
            cookedFood = cookedFoodRepository.findById(id);
        } catch (Exception e) {
            // TODO: Manage error
            log.error(String.valueOf(e), e);
        }
        // Delete if exist
        if (cookedFood.isPresent()) {
            cookedFoodRepository.delete(cookedFood.get());
            return id;
        }
        return null;
    }
}
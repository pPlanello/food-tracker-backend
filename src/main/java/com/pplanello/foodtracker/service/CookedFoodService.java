package com.pplanello.foodtracker.service;

import com.pplanello.foodtracker.entity.CookedFood;

import java.util.List;

public interface CookedFoodService {

    /**
     * Obtain all the cooked food
     *
     * @return {@link List} of {@link CookedFood}
     */
    List<CookedFood> getAllCookedFood();

    /**
     * Obtain the cooked food
     *
     * @param id identifier of cooked food
     * @return {@link CookedFood}
     */
    CookedFood getCookedFoodById(Long id);

    /**
     * Create a cooked food
     *
     * @param cookedFood to create
     * @return {@link CookedFood} created
     */
    CookedFood createCookedFood(CookedFood cookedFood);
}

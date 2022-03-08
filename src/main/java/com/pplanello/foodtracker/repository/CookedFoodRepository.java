package com.pplanello.foodtracker.repository;

import com.pplanello.foodtracker.entity.CookedFood;
import com.pplanello.foodtracker.repository.custom.CookedFoodRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CookedFoodRepository extends JpaRepository<CookedFood, Long>, JpaSpecificationExecutor<CookedFood>, CookedFoodRepositoryCustom {
}

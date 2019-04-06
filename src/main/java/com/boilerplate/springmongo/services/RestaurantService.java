package com.boilerplate.springmongo.services;

import com.boilerplate.springmongo.models.Restaurant;
import com.boilerplate.springmongo.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public List<Restaurant> getByBuilding(String building) {
        return restaurantRepository.findBybuilding(building);
    }
}

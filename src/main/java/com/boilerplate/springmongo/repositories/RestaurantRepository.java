package com.boilerplate.springmongo.repositories;

import com.boilerplate.springmongo.models.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RestaurantRepository extends CrudRepository<Restaurant, String> {

    List<Restaurant> findBybuilding(String building);
}

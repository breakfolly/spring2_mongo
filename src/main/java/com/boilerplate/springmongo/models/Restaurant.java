package com.boilerplate.springmongo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Restaurant {
    @Id
    public String id;

    public String name;
    public String building;
    public String descAddress;
    public Double score = 0.0;

    public Restaurant() {}

    public Restaurant(String restaurantFromContent) {
        String[] splitRestaurant = restaurantFromContent.split("\n");
        name = splitRestaurant[0];

        if (splitRestaurant.length > 1) {
            building = splitRestaurant[1];
        }

        if (splitRestaurant.length > 2) {
            descAddress = splitRestaurant[2];
        }
    }
}

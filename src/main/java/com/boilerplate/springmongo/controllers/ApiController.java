package com.boilerplate.springmongo.controllers;

import com.boilerplate.springmongo.services.RestaurantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    Logger logger = LoggerFactory.getLogger(ApiController.class);

    @Autowired
    private RestaurantService restaurantService;

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public Map<String, Object> index(@RequestBody Map<String, Object> requestMap) {
        return Map.of("buildings", restaurantService.getByBuilding("H스퀘어 N동"));
    }

}

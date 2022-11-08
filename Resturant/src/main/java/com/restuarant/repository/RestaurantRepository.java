package com.restuarant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.restuarant.model.Resturant;

@Repository
public interface RestaurantRepository extends MongoRepository<Resturant,Long>{

}

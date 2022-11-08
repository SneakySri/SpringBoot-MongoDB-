package com.restuarant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.restuarant.model.menu;

@Repository
public interface MenuRepository extends MongoRepository<menu, Long> {

	menu save(menu men);

}

package com.mongo.poc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.poc.model.ItemCategoryModel;

public interface ItemCategoryRepository extends MongoRepository<ItemCategoryModel, String> {
}

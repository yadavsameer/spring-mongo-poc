package com.mongo.poc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.poc.model.ItemModel;

public interface ItemRepository extends MongoRepository<ItemModel, String> {
    public void deleteAllByCategoryId(String categoryId);
    //public List<ItemModel> findAllByCategoryId(String categoryId);
}

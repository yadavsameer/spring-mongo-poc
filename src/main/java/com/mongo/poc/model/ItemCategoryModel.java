package com.mongo.poc.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "ItemCategoryModel")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemCategoryModel {
    private String id;
    private String name;
}

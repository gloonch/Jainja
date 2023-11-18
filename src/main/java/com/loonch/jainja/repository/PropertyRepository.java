package com.loonch.jainja.repository;

import com.loonch.jainja.model.Property;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertyRepository extends MongoRepository<Property, String> {

    @Query("{host: ObjectId(?0)}")
    List<Property> getPropertiesByHostId(String id);
}

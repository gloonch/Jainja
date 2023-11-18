package com.loonch.jainja.service;

import com.loonch.jainja.model.Property;
import com.loonch.jainja.repository.PropertyRepository;
import com.loonch.jainja.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PropertyService {

    private PropertyRepository propertyRepository;

    public PropertyService(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    public List<Property> getAll() {
        return propertyRepository.findAll();
    }

    public void create(Property property) {
        propertyRepository.save(property);
    }

    public void delete(String id) {
        propertyRepository.deleteById(id);
    }
}

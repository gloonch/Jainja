package com.loonch.jainja.controller;

import com.loonch.jainja.model.Property;
import com.loonch.jainja.service.PropertyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/property")
public class PropertyController {

    private final PropertyService propertyService;

    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @GetMapping
    public ResponseEntity<List<Property>> getAllProperties() {
        return ResponseEntity.ok(propertyService.getAll());
    }

    @PostMapping
    public ResponseEntity createProperty(@RequestBody Property property) {
        propertyService.create(property);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteProperty(@PathVariable String id) {
        propertyService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/host/{id}")
    public ResponseEntity<List<Property>> getPropertiesByHostId(@PathVariable String id) {
        return ResponseEntity.ok(propertyService.getPropertiesByHostId(id));
    }

}

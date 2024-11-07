package com.Project.UnRealProperties.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Project.UnRealProperties.model.Property;
import com.Project.UnRealProperties.service.PropertyService;
import java.util.List;
@RestController
@RequestMapping("/api/Properties")
@CrossOrigin(origins = "http://localhost:3000")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping
    public List<Property> getAllProperties() {
        return propertyService.getAllProperties();
    }

    @GetMapping("/{id}")
    public Property getPropertyById(@PathVariable("id") Long id) {
        return propertyService.getPropertyById(id);
    }

    @PostMapping
    public Property addProperty(@RequestBody Property property) {
        return propertyService.addProperty(property);
    }

    @DeleteMapping("/{id}")
    public void deleteProperty(@PathVariable("id") Long id) {
        propertyService.deleteProperty(id);
    }
}

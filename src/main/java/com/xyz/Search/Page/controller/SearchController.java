package com.xyz.Search.Page.controller;

import com.xyz.Search.Page.model.Manufacturer;
import com.xyz.Search.Page.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/SearchPage")
public class SearchController {
    @Autowired
    private SearchService service;


    @PostMapping("/add")
    public Manufacturer addManufacturer(@RequestBody Manufacturer manufacturer) {
        service.addCompany(manufacturer);
        return manufacturer;
    }

    @PostMapping("/search")
    public ResponseEntity<List<Manufacturer>> getManufacturer(@RequestBody Manufacturer manufacturer)
    {
    List<Manufacturer>manufacturers=service.getManufacturerDetails(manufacturer.getLocation(), manufacturer.getManufacturing_process());
    return ResponseEntity.ok(manufacturers);
    }
}
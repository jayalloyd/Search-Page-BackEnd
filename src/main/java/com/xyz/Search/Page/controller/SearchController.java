package com.xyz.Search.Page.controller;

import com.xyz.Search.Page.model.Manufacturer;
import com.xyz.Search.Page.service.SearchService;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
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
    @Hidden
    public Manufacturer addManufacturer(@RequestBody Manufacturer manufacturer) {
        service.addCompany(manufacturer);
        return manufacturer;
    }
@Operation
        (
                description = "Post Endpoint for search by criteria",
                summary = "this is a summary for search end point",responses = {
                        @ApiResponse(
                                description = "success",
                                responseCode = "200"
                        )
        }
        )
    @PostMapping("/search")
    @Tag(name="SearchByCriteria")
    public ResponseEntity<List<Manufacturer>> getManufacturer(@RequestBody Manufacturer manufacturer)
    {
    List<Manufacturer>manufacturers=service.getManufacturerDetails(manufacturer.getLocation(), manufacturer.getManufacturing_process());
    return ResponseEntity.ok(manufacturers);
    }
}
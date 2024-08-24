package com.xyz.Search.Page.service;

import com.xyz.Search.Page.model.Manufacturer;
import com.xyz.Search.Page.repo.ServiceRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {
    @Autowired
    private ServiceRepo repo;
    private static final Logger log = LoggerFactory.getLogger(SearchService.class);
    public List<Manufacturer> getManufacturerDetails(String location, String manufacturing_process) {
        log.info("Fetching details for location: {} and manufacturing process: {}", location, manufacturing_process);

        return repo.findByCriteria(location, manufacturing_process);


    }


    public void addCompany(Manufacturer manufacturer) {
        repo.save(manufacturer);

    }
}

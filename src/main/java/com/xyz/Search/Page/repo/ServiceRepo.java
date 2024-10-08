package com.xyz.Search.Page.repo;


import com.xyz.Search.Page.model.Manufacturer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ServiceRepo extends JpaRepository<Manufacturer,Integer> {


    @Modifying
    @Transactional
    @Query(value = "INSERT INTO manufacturer ( supplier_id,company_name,website,location,nature_of_business, manufacturing_process) VALUES (:supplier_id,:company_name,:website,:location,:nature_of_business, :manufacturing_process)", nativeQuery = true)
    void save(@Param("supplier_id") Integer supplier_id, @Param("company_name") String company_name, @Param("website") String website, @Param("location") String location, @Param("nature_of_business") String nature_of_business, @Param("manufacturing_process") String manufacturing_process);
    @Query("SELECT m FROM Manufacturer m WHERE m.location = :location AND m.manufacturing_process = :manufacturing_process ")
   List<Manufacturer> findByCriteria(@Param("location") String location, @Param("manufacturing_process") String manufacturing_process);


//        @Query("SELECT m FROM Manufacturer m WHERE m.location = :location AND m.manufacturing_process = :manufacturing_process ")
//    List<Manufacturer> findByCriteria(@Param("location") String location, @Param("manufacturing_process") String manufacturing_process);
}
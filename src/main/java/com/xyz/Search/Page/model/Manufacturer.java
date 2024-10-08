package com.xyz.Search.Page.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="manufacturer")
public class Manufacturer {
    @Id
    private int supplier_id;
    private String company_name;
    private String website;
    private String location;
    private String nature_of_business;
    private String manufacturing_process;

    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNature_of_Business() {
        return nature_of_business;
    }

    public void setNature_of_Business() {
        this.nature_of_business = nature_of_business;
    }

    public Manufacturer() {
    }

    public Manufacturer(int supplier_id, String company_name, String website, String location, String nature_of_business, String manufacturing_process) {
        this.supplier_id = supplier_id;
        this.company_name = company_name;
        this.website = website;
        this.location = location;
        this.nature_of_business = nature_of_business;

        this.manufacturing_process = manufacturing_process;
    }

    public String getManufacturing_process() {
        return manufacturing_process;
    }

    public void setManufacturing_process(String manufacturing_process) {
        this.manufacturing_process = manufacturing_process;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "supplier_id=" + supplier_id +
                ", company_name='" + company_name + '\'' +
                ", website='" + website + '\'' +
                ", location='" + location + '\'' +
                ", nature_of_Business='" + nature_of_business + '\'' +
                ", manufacturing_process='" + manufacturing_process + '\'' +
                '}';
    }
}

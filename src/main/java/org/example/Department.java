package org.example;
import java.util.Objects;

public class Department {
    private String Admin;
    private String records;
    private String Lab;
    private String physiotherapy;
    private String pharmacy;
    private String theatre;
    private String ICU;
    private String nursery;

    public String getAdmin() {
        return Admin;
    }

    public void setAdmin(String admin) {
        Admin = admin;
    }

    public String getRecords() {
        return records;
    }

    public void setRecords(String records) {
        this.records = records;
    }

    public String getLab() {
        return Lab;
    }

    public void setLab(String lab) {
        Lab = lab;
    }

    public String getPhysiotherapy() {
        return physiotherapy;
    }

    public void setPhysiotherapy(String physiotherapy) {
        this.physiotherapy = physiotherapy;
    }

    public String getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(String pharmacy) {
        this.pharmacy = pharmacy;
    }

    public String getTheatre() {
        return theatre;
    }

    public void setTheatre(String theatre) {
        this.theatre = theatre;
    }

    public String getICU() {
        return ICU;
    }

    public void setICU(String ICU) {
        this.ICU = ICU;
    }

    public String getNursery() {
        return nursery;
    }

    public void setNursery(String nursery) {
        this.nursery = nursery;
    }
}

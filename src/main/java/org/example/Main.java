package org.example;
import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    User Avon = new User();
    Avon.setName("Avon");
        System.out.println("The name of the hospital is :" + Avon.getName());
        Department clinicalCare = new Department();
        clinicalCare.setAdmin("Admin");
        clinicalCare.setRecords("Records");
        clinicalCare.setLab("Lab");
        clinicalCare.setPhysiotherapy("Physiotherapy");
        clinicalCare.setPharmacy("Pharmacy");
        clinicalCare.setTheatre("Theatre");
        clinicalCare.setICU("ICU");
        clinicalCare.setNursery("Nursery");
        Department clinicalCare1 = new Department();
        clinicalCare1.setAdmin("Admin");
        clinicalCare1.setRecords("Records");
        clinicalCare1.setLab("Lab");
        clinicalCare1.setPhysiotherapy("Physiotherapy");
        clinicalCare1.setPharmacy("Pharmacy");
        clinicalCare1.setTheatre("Theatre");
        clinicalCare1.setICU("ICU");
        clinicalCare1.setNursery("Nursery");
        System.out.println("Are they equal:"+ Objects.equals(clinicalCare, clinicalCare1));
        System.out.println("The name of my hospital is:" + Avon.getName());

    }
}
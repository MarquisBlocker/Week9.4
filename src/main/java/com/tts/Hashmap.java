package com.tts;
import java.util.*;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> carMap = new HashMap<>();
        carMap.put("Accord", "Honda");
        carMap.put("Civic", "Honda");
        carMap.put("CRV", "Honda");
        carMap.put("Camry", "Toyota");
        carMap.put("Corolla", "Toyota");
        carMap.put("Highlander", "Toyota");
        carMap.put("Altima", "Nissan");
        carMap.put("Maxima", "Nissan");
        carMap.put("Rogue", "Nissan");

        System.out.println ("We have the largest selection of Honda's, Toyota's, and Nissan's available!");
        System.out.println ("What car model are you looking for? " );
        String carModel = scanner.next();
        String make = carMap.get(carModel);
        if(make == null){
            System.out.println("Sorry we don't have that");
        } else {
            System.out.println("Our " + make + " selection is right this way!");
        }
    }
}







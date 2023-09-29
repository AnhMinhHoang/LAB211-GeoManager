/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import model.Country;

/**
 *
 * @author GoldCandy
 */
public class Algorithm implements Comparator<Country>{
    protected Validation valid = new Validation();
    protected Country currentCountry = new Country();
    
    public boolean checkExistCode(ArrayList<Country> countries, String code){
        for(Country country: countries){
            if(country.getCountryCode().equals(code)) return true;
        }
        return false;
    }
    
    public void addCountryInformation(ArrayList<Country> countries){
        Country country = new Country();
        String code = valid.inputString("Enter code of country");
        if (checkExistCode(countries, code)){
            System.out.println("Code already exist!");
            return;
        }
        country.setCountryCode(code);
        country.setCountryName(valid.inputString("Enter name of country"));
        country.setTotalArea(valid.inputNumber("Enter total Area", 0));
        country.setCountryTerrain(valid.inputString("Enter terrain of country"));
        countries.add(country);
        this.currentCountry = country;
    }
    
    public void recentDisplay(){
        if(currentCountry.getCountryTerrain().isEmpty()){
            System.out.println("There is no country yet!");
            return;
        }
        System.out.printf("%s%20s%20s%20s\n", "ID", "Name", 
                                    "Total Area", "Terrain");
        currentCountry.display();
    }
    
    public void displayAscendingOrder(ArrayList<Country> countries){
        if(countries.isEmpty()){
            System.out.println("There is no country yet!");
            return;
        }
        Algorithm algorithm = new Algorithm();
        Collections.sort(countries, algorithm);
        System.out.printf("%s%20s%20s%20s\n", "ID", "Name", 
                                    "Total Area", "Terrain");
        for(Country country: countries){
            country.display();
        }
    }
    
    public void search(ArrayList<Country> countries){
        int count = 0;
        if(countries.isEmpty()){
            System.out.println("There is no country yet!");
            return;
        }
        
        String strMatch = valid.inputString("Enter the name you want to search for");
        System.out.printf("%s%20s%20s%20s\n", "ID", "Name", 
                                    "Total Area", "Terrain");
        for(Country country: countries){
            if(country.getCountryName().toLowerCase().contains(strMatch.toLowerCase())){
                country.display();
                count++;
            }
        }
        if(count == 0){
            System.out.println("Not found!");
        }
    }

    @Override
    public int compare(Country o1, Country o2) {
        return o1.getCountryName().compareTo(o2.getCountryName());
    }
}

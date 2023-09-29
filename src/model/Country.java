/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author GoldCandy
 */
public class Country extends EastAsiaCountries{
    private String countryTerrain;

    public Country(String countryTerrain, String countryCode, String countryName, float totalArea) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }
    
    public Country(){
        super();
        this.countryTerrain = "";
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }
    
    @Override
    public void display(){
        System.out.printf("%s%20s%20f%20s\n", this.getCountryCode(),
                                                        this.getCountryName(),
                                                        this.getTotalArea(),
                                                        this.getCountryTerrain());
    }
}

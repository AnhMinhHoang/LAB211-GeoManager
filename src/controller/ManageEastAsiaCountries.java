/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import java.util.ArrayList;
import model.Country;
import view.Menu;

/**
 *
 * @author GoldCandy
 */
public class ManageEastAsiaCountries extends Menu{
    
    protected static String[]mc = {"Input the information of 11 countries in East Asia",
                                    "Display the information of country you're just input",
                                    "Search the information of country by user-entered name",
                                    "Display the information of countries sorted name in ascending order",
                                    "Exit"};
    Algorithm algorithm;
    ArrayList<Country> countries;
    
    public ManageEastAsiaCountries(){
        super("MENU", mc);
        algorithm = new Algorithm();
        countries = new ArrayList();
    }

    @Override
    public void execute(int choice) {
        switch(choice){
            case 1:{
                algorithm.addCountryInformation(countries);
                break;
            }
            case 2:{
                algorithm.recentDisplay();
                break;
            }
            case 3:{
                algorithm.search(countries);
                break;
            }
            case 4:{
                algorithm.displayAscendingOrder(countries);
                break;
            }
            case 5:{
                System.out.println("EXIT...");
                System.exit(0);
            }
            default:{
                System.out.println("No such choice!");
            }
        }
    }    
}

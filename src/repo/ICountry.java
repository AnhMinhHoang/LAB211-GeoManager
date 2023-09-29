/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repo;

import java.util.ArrayList;
import model.Country;

/**
 *
 * @author GoldCandy
 */
public interface ICountry {

    public void addCountryInformation(ArrayList<Country> countries);

    public void displayAscendingOrder(ArrayList<Country> countries);

    public void recentDisplay();

    public void search(ArrayList<Country> countries);
}

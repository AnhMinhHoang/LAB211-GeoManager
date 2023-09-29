/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author GoldCandy
 */
public class Validation {
    
    public String inputString(String title){
        String s = "";
        while(s.isBlank() || s.isEmpty()){
            Scanner sc = new Scanner(System.in);
            System.out.print(title+": ");
            s = sc.nextLine();
        }
        return s;
    }
    
    public float inputNumber(String title, int min){
        float a;
        while(true){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print(title+": ");
                a = sc.nextFloat();
                if(a < min){
                    System.out.println("Please enter number > "+ min);
                    continue;
                }
                return a;
            }
            catch(InputMismatchException e){
                System.out.println("Please enter number");
            }
        }
    }
}

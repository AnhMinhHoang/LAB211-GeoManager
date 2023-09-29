/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author GoldCandy
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Menu<T> {

    protected String title;
    protected ArrayList<T> list = new ArrayList<>();

    public Menu(String title, String[] mc) {
        this.title = title;
        for (String item : mc) {
            list.add((T) item);
        }
    }

    public void display() {
        System.out.printf("%37s\n" , title);
        System.out.println("===========================================================================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
        System.out.println("===========================================================================");
    }

    public int getChoice() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public abstract void execute(int choice);

    public void run() {
        int choice = list.size() + 1;
        while (choice != list.size()) {
            try {
                display();
                System.out.print("Please choice one option: ");
                choice = getChoice();
            } catch (InputMismatchException e) {
                choice = list.size() + 1;
            }
            execute(choice);
        }
    }
}

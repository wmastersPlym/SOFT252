/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author wmasters
 */
public class MyWeight {
    
    public static Scanner s = new Scanner(System.in);
    
    public static void main(String args[]) {
        int kg;
        double pounds;
        
        System.out.println("Please enter your weight in kg: ");
        kg = s.nextInt();
        pounds = kg*2.2;
        System.out.println("Your weight in kg: " + kg + ". Your weight in pounds: " + pounds);
        
    }
}

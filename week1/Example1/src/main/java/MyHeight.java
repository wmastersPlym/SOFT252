
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wmasters
 */
public class MyHeight {
    
    public static Scanner s = new Scanner(System.in);
    
    public static void main(String args[]) {
        int cm;
        
        System.out.println("Please enter your height in cm: ");
        cm = s.nextInt();
        
        double inches = cm/2.54;
        double feet = inches/12;
        double inchesLeft = inches % 12;
        
        System.out.println("Your height in cm: " + cm + ". Your height in feet: " + (int)feet  + " foot " + String.format("%.2f",inchesLeft) + " inches");
    }
}

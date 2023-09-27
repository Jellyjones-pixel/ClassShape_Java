/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classshape;

/**
 *
 * @author jelly_joneske
 */
import java.util.Scanner;
public class ClassShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        double area=length*width;
        System.out.println("Area of the rectangle: "+area);
       
    }
    
}

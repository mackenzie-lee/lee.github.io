/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program01;

/**
 *
 * @author Kenzie
 */
public class Fahrenheit {
    
}

/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       // integers, keyboard
        int c1, sum;
        Scanner keyboard = new Scanner(System.in);

        // Enter Celsius value, num1
        System.out.println("Enter Celsius temperature: ");
        c1 = keyboard.nextInt();

        // Forumula for Fahrenheit, Output final value
        sum = (9.0/5.0) * c1 + 32;
        System.out.println("The temperature in Fahrenheit is" + sum);
   }
}

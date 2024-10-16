package MaximunFinder;

import java.util.Scanner;
import java.lang.Math;
public class MaxFinder {

    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);

        System.out.print("Enter three floting-point value sparated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = Math.max(number1,Math.max(number2, number3));

        System.out.println("Maximum is: "+result);
        input.close();
    }
    
}

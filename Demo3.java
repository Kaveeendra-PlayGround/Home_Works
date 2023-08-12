// Celcius to Fahrenheit Converter

import java.util.Scanner;

public class Demo3 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Celcius Value : ");
        double c = scanner.nextDouble();
        scanner.nextLine();

        double f = convertCelcius(c);

        System.out.printf("Fahrenheit Value = %.2f \n", f);
        if (f>50) System.out.println("It is hot");
        
    }

    public static double convertCelcius (double c){
        double f = c*9/5 + 32;
        return f;

    }
}

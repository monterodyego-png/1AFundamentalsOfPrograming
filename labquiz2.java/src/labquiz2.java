import java.util.Scanner;
public class labquiz2 {
    public static void main(String[] args)
    {Scanner inputDevice = new Scanner(System.in);


        System.out.println("Welcome to Adobo Cooking Show ");

        String name;
        double kilo;
        double ss = 0.5;
        double vg = 0.33;

        System.out.print("Please enter your name: ");
        name = inputDevice.nextLine();
        System.out.print("How many kilo of pork will you cook?");
        kilo = inputDevice.nextDouble();


        System.out.println("The ratio of soy sauce for " + kilo + " kg is = " + ( kilo * ss) );

        System.out.print("The ratio of vinegar for " + kilo + " kg is = "+ ( kilo * vg) );

    }
}
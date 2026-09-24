import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class labquiz1 {
    public static void main(String[] args) {
        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.print("Enter your Birth Year: ");
            String birthyearInput = dataln.readLine();
            int birthyear = Integer.parseInt(birthyearInput);

            System.out.println("You were born last " + birthyear + ".");



            System.out.print("You are now " + ( 2026 - birthyear) + "yrs old." );

        }catch(IOException e) {

            System.err.println("Errorr reading input stream.");

        }catch (NumberFormatException e){

            System.err.println("Invalid number format!Please enter digits only.");
        }
    }
}
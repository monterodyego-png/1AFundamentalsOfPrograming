/*Instructions
        An applicant will accepted to the Jedi Knight Military Academy is he is least 200 cm. tall;
        age is between 21 and 25, inclusive; and a citizen of the Planet Endor.
        However, if the applicant is a recommendee of Jedi Master Obi Wan, he is accepted
        automatically regardless of his height, age and citizenship.
         Write a program that would input the applicant’s height, age,
         citizenship code(“C” for citizen of Endor, “N” for non-citizen),
          and recommendee code (“R” for recommendee, “N” for non-recommendee) and
           then output whether the applicant is accepted or rejected.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class decisioncontrolsystemassignment4bufferedreader {
    public static void main(String[]args){

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{

        System.out.print("Enter height(cm): ");
        int height = Integer.parseInt(br.readLine());
        System.out.print("Enter age: ");
        int age=Integer.parseInt(br.readLine());
        System.out.print("Are you a citizen of the Planet Endor? Type 'C' if yes and 'N' if no. ");
        char citizenship=br.readLine().toUpperCase().charAt(0);
        System.out.print("Are you a recommendee of Jedi Master Obi Wan? Type 'R' if yes and 'N' if no. ");
        char recommendee=br.readLine().toUpperCase().charAt(0);

        if( recommendee == 'R'){
            System.out.println("You are accepted to the Jedi Knight Military Academy!");
        }
        else if ( citizenship =='C' && height >= 200 && age>=21 && age<=25) {
            System.out.println("You are accepted to the Jedi Knight Military Academy!");
        }
        else{
            System.out.println("You are not accepted!");
        }

    }
    catch (IOException e){

    }
}}

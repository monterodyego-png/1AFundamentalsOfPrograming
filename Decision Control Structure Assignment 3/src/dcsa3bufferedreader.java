import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class dcsa3bufferedreader {
    public static void main(String[]args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Enter NSAT score:  ");
            int nsatScore= Integer.parseInt(br.readLine());
            System.out.print("Enter monthly salary of parent:  ");
            int monthlySalaryOfParents=Integer.parseInt(br.readLine());
            System.out.print("Enter your Entrance exam score:  ");
            int entranceExamScore= Integer.parseInt(br.readLine());

            if (monthlySalaryOfParents >= 10000 && nsatScore <90 && entranceExamScore <85 ){
                System.out.println("Your application for a college scholarship is rejected!");
            }
            else if (monthlySalaryOfParents<=3500 && nsatScore>90 && entranceExamScore>90 ){
                System.out.println("Your application for a college scholarship is accepted!");
            }
            else {
                System.out.println("Your application for a college scholarship is subjected for further study.");
            }
        }
        catch (IOException e){

        }

    }
}

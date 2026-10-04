import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class leapyearbufferedreader {
    public static void main(String []args){

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        try{
            int year;
            System.out.print("Enter Year:  ");
            year=Integer.parseInt(rd.readLine());

            if((year % 4 == 0 && year % 100 !=0) ||(year % 400 == 0)) {
                System.out.println("Year " + year + " is a Leap year!");
            }
            else{
                System.out.println("Year " + year + " is NOT a Leap year!");
            }
        }
        catch (IOException e) {
            System.out.println("Error!! Input year only.");
        }


    }
}
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.time.Year;
public class leapyearbufferedreader {
    public static void main(String []args){

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));



        try{   int year;
            System.out.print("Enter Year:  ");
            year=Integer.parseInt(rd.readLine());

            if(Year.of(year).isLeap()){
                System.out.println("Year " + year + " is a Leap year!");
            }
            else{
                System.out.println("Year " + year + " is NOT a Leap year!");
            }
        }
        catch (IOException e) {
            System.out.println("Error!! Input year only.");
        }

    }
}

 */
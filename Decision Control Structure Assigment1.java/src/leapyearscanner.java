import java.util.Scanner;
public class leapyearscanner{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int year;

        System.out.print("Enter year: ");
        year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)) {
            System.out.println("Year " + year + " is a leap year");
        }
        else {
            System.out.println("Year " + year + " is  NOT a leap year");
        }
        sc.close();
    }
}

/*
import java.util.Scanner;
import java.time.Year;
public class leapyearscanner{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int year;

        System.out.print("Enter year: ");
        year = sc.nextInt();

        if (Year.of(year).isLeap()){
            System.out.println("Year " + year + " is a leap year");
        }
        else{
            System.out.println("Year " + year + " is  NOT a leap year");
        }
        sc.close();
    }
}*/
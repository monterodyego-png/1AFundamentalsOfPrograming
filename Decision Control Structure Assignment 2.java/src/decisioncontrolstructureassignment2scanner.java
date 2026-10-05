/*Write an application that prompts an employee for an hourly pay rate and hours worked.
Compute gross pay (hours times rate), withholding tax, and net pay (gross pay minus withholding tax).
 Withholding tax is computed as a percentage of gross pay based on the following:

Gross Pay (Php)         Withholding (%)
0 to 2000.00            10
2001 to 4000            12
4001 to 10000           15
10001 and over          20
*/
import java.util.Scanner;
import java.text.DecimalFormat;
public class decisioncontrolstructureassignment2scanner {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");

        System.out.print("Enter hourly pay rate: ");
        double payrate = sc.nextDouble();

        System.out.print("Enter hours worked:  ");
        double hours = sc.nextDouble();


        double grosspay = hours * payrate;
        double withHoldingtax;

        if (grosspay <= 2000){
            withHoldingtax= grosspay * 0.1;
        }
        else if (grosspay <= 4000 ) {
            withHoldingtax = grosspay * .12;
        }
        else if ( grosspay <= 10000) {
            withHoldingtax = grosspay * .15;
        }
        //else if (grosspay > 10000 ) {

        //}
        else {
            withHoldingtax = grosspay * .2;
        }
        double netpay = grosspay - withHoldingtax;

        System.out.println("Gross pay: " + dc.format(grosspay));
        System.out.println("Withholding tax: "+ dc.format(withHoldingtax));
        System.out.println("Net pay: "+ dc.format(netpay));

        sc.close();
    }
}
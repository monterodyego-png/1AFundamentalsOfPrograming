/*Write an application that prompts an employee for an hourly pay rate and hours worked.
Compute gross pay (hours times rate), withholding tax, and net pay (gross pay minus withholding tax).
Withholding tax is computed as a percentage of gross pay based on the following:

Gross Pay (Php)         Withholding (%)
0 to 2000.00            10
2001 to 4000            12
4001 to 10000           15
10001 and over          20
*/import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class decisioncontrolstructureassignment2bufferedreader {
    public static void main(String[]args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df=new DecimalFormat("0.00");



        try{

            System.out.print("Enter hourly pay rate:  ");
            double payrate = Double.parseDouble(br.readLine());
            System.out.print("Enter hours worked: ");
            double hrs = Double.parseDouble(br.readLine());
            double gross = hrs * payrate;
            double tax;


            if (gross <=2000){
                tax = gross*.1;
            }
            else if (gross <= 4000) {
                tax= gross*.12;
            }
            else if (gross<=10000) {
                tax = gross * .15;
            }
            else{
                tax = gross*.2;
            }
            double netpay = gross- tax;
            System.out.println("Gross pay: "+ df.format(gross));
            System.out.println("Withholding tax:"+ df.format(tax));
            System.out.println("Net pay: "+ df.format(netpay));
        }
        catch (IOException e){

        }

    }
}

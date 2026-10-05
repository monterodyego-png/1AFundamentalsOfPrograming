/*Write an application that prompts an employee for an hourly pay rate and hours worked.
Compute gross pay (hours times rate), withholding tax, and net pay (gross pay minus withholding tax).
 Withholding tax is computed as a percentage of gross pay based on the following:

Gross Pay (Php)         Withholding (%)
0 to 2000.00            10
2001 to 4000            12
4001 to 10000           15
10001 and over          20
*/
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class decisioncontrolstructureassignment2joptions {
    public static void main(String[]args){
        DecimalFormat df = new DecimalFormat("0.00");

        double pay = Double.parseDouble(JOptionPane.showInputDialog("Enter your hourly pay rate: "));
        double hours = Double.parseDouble(JOptionPane.showInputDialog("Enter Hours worked:  "));
        double gross= hours * pay;
        double withholdingtax;

        if (gross <= 2000){
            withholdingtax = gross * .1;
        }
        else if (gross <= 4000) {
            withholdingtax = gross * .12;
        }
        else if (gross <= 10000) {
            withholdingtax = gross * .15;
        }
        else {
            withholdingtax = gross * .2;
        }
        double netpay = gross - withholdingtax ;

        String message = "Gross pay:"+ df.format(gross) + "\n Withholding tax: "+ df.format(withholdingtax) + "\n Netpay : "+ df.format(netpay);

        JOptionPane.showMessageDialog(null,message);


        //JOptionPane.showMessageDialog(null,"Gross pay:"+ gross);
        //JOptionPane.showMessageDialog(null,"Withholding tax: "+ withholdingtax);
        //JOptionPane .showMessageDialog(null,"Netpay : "+ netpay);

    }
}

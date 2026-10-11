import javax.swing.JOptionPane;
public class dcsa3joptionpane {
    public static void main(String[]args){
        /*3. To avail of a college scholarship, an applicant must provide three figures:
         his NSAT score, monthly salary of his parents, and entrance examination score.
         The college may either decide to accept, reject, or further study his application based on the following conditions:
Rejected is any of the following exists:
a. Parents' salary is above 10,000
b. NSAT score is below 90
c. Entrance exam score is below 85
Accepted if all of the following are met:
a) Parents' salary is at most 3,500
b) Average of NSAT and entrance exam is at least 91
Any application which is neither accepted nor rejected will be subjected for further study.
Make a program that would input the NSAT score, parents' salary and entrance exam score and then output
whether the applicant is accepted, rejected or, for further study.*/
        int nsatScore = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter NSAT score: "));
        int monthlySalary = Integer.parseInt(JOptionPane.showInputDialog("Enter monthly salary of parent:  "));
        int entranceExamScore = Integer.parseInt(JOptionPane.showInputDialog("Enter your Entrance exam score:  "));

        if (monthlySalary >= 10000 && nsatScore <90 && entranceExamScore <85 ){
            JOptionPane.showMessageDialog(null,"Your application for a college scholarship is rejected!");
        }
        else if (monthlySalary<=3500 && nsatScore>90 && entranceExamScore>90 ){
            JOptionPane.showMessageDialog(null,"Your application for a college scholarship is accepted!");
        }
        else {
            JOptionPane.showMessageDialog(null,"Your application for a college scholarship is subjected for further study.");
        }
    }
}

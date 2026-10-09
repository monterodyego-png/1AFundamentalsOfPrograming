import javax.swing.JOptionPane;

public class decisioncontrolsystemassignment4JOptionsPane {
    public static void main(String[]args){
        /*Instructions
        An applicant will accepted to the Jedi Knight Military Academy is he is least 200 cm. tall;
        age is between 21 and 25, inclusive; and a citizen of the Planet Endor.
        However, if the applicant is a recommendee of Jedi Master Obi Wan, he is accepted
        automatically regardless of his height, age and citizenship.
         Write a program that would input the applicant’s height, age,
         citizenship code(“C” for citizen of Endor, “N” for non-citizen),
          and recommendee code (“R” for recommendee, “N” for non-recommendee) and
           then output whether the applicant is accepted or rejected.*/

        int height=Integer.parseInt( JOptionPane.showInputDialog("Enter your height(cm): "));
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age:  "));
        char citizenship=JOptionPane.showInputDialog("Are you a citizen of the Planet Endor? Type 'C' if yes and 'N' if no. ").toUpperCase().charAt(0);
        char recommendee=JOptionPane.showInputDialog("Are you a recommendee of Jedi Master Obi Wan? Type 'R' if yes and 'N' if no. ").toUpperCase().charAt(0);

        if( recommendee == 'R'){
            JOptionPane.showMessageDialog(null,"You are accepted to the Jedi Knight Military Academy!");
        }
        else if ( citizenship =='C' && height >= 200 && age>=21 && age<=25) {
            JOptionPane.showMessageDialog(null,"You are accepted to the Jedi Knight Military Academy!");
        }
        else{
            JOptionPane.showMessageDialog(null,"You are not accepted!");
        }
    }
}

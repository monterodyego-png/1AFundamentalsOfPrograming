import javax.swing.JOptionPane;
public class leapyearjoptions {
    public static void main(String[] args){

        int year;

        year = Integer.parseInt(JOptionPane.showInputDialog("Enter year: "));

        if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)) {
            JOptionPane.showMessageDialog(null, "Year " + year +
                    " is a leap year");
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Year " + year + " is  NOT a leap year");
        }

    }
}

/*
import java.time.Year;
import javax.swing.JOptionPane;
public class leapyearjoptions {
    public static void main(String[] args){

        int year;

        year = Integer.parseInt(JOptionPane.showInputDialog("Enter year: "));

        if (Year.of(year).isLeap()){
            JOptionPane.showMessageDialog(null, "Year " + year +
                    " is a leap year");
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Year " + year + " is  NOT a leap year");
        }

    }}*/
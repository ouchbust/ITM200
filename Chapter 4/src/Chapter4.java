
import javax.swing.JOptionPane;
public class CH4Q1 {

    public static void main(String[] args) {

        String strName = JOptionPane.showInputDialog("Please enter a name or leave blank when done.");
        int pos = strName.indexOf(" ");
        System.out.println("Index location of space: " + pos);
        String firstName = strName.substring(0, pos);
        String lastName = strName.substring(pos+1);
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println("My name is " + lastName + ", " + firstName + " " + lastName + ". ");
    }

}
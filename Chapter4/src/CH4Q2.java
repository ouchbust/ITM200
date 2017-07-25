import javax.swing.JOptionPane;
public class CH4Q2 {

	public static void main(String[] args) {
	String strName = JOptionPane.showInputDialog("Please enter a name or leave blank when done.");
	int pos = strName.indexOf(" ");
	int pos2 = strName.indexOf(" ", pos + 1);
	
	System.out.println(pos);
	System.out.println(pos2);
	
	String firstName = strName.substring(0, pos);
	String middleName = strName.substring(pos + 1, pos2);
	String lastName= strName.substring(pos2+1);
	
	firstName = firstName.substring(0,1).toUpperCase() +
	firstName.substring(1).toLowerCase();
	lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
	middleName = middleName.substring(0,1).toUpperCase();
	
	System.out.println("My name is " + lastName + ", " + firstName + " " + middleName + ".");
	
	}

}

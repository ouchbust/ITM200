import javax.swing.JOptionPane;

public class CH03Q1 {
	// Main method
	public static void main(String[] args) {
	//Enter temperature in Celsius
	String celsiusString = JOptionPane.showInputDialog(null, "Enter a tempperature in Celsius:", "Exercise2_1 Input", JOptionPane.QUESTION_MESSAGE);
	
	//Convert string to double
	double celsius = Double.parseDouble(celsiusString);
	
	//Convert it to Celsius
	double farenheit = (9.0 / 5 ) * celsius + 32;
	
	//Display the results (console & msgbox)
	System.out.println("Temperature: " + celsius + " Celsius is " + farenheit + " degrees in Farenheit.");
	JOptionPane.showMessageDialog(null, "Temperature: " + celsius + " Celsius is " + farenheit + " degrees in Farenheit");
	
	//Rounds it to two decimals
	farenheit = Math.round(farenheit * 100) / 100.0;
	//Display the result
	System.out.println("Temperature: " + celsius + "Celsius is " + farenheit + "degrees in Farenheit.");
	JOptionPane.showMessageDialog(null, "Temperature: " + celsius + " Celsius is " + farenheit + " degrees in Farenheit");
	
	}

}

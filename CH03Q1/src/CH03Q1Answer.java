import javax.swing.JOptionPane;

public class CH03Q1Answer {
	// Main method
	public static void main(String[] args) {
	//Enter temperature in Celsius
	String farenheitString = JOptionPane.showInputDialog(null, "Enter a temperature in Farenheit:", "Exercise2_1 Input", JOptionPane.QUESTION_MESSAGE);
	
	//Convert string to double
	double farenheit = Double.parseDouble(farenheitString);
	
	//Convert it to Celsius
	double celsius = (farenheit - 32) * (5.0 / 9.0);
	
	//Display the results (console & msgbox)
	System.out.println("Temperature: " + farenheit + " farenheit is " + celsius + " degrees in celsius.");
	JOptionPane.showMessageDialog(null, "Temperature: " + farenheit + " farenheit is " + celsius + " degrees in celsius");
	
	//Rounds it to two decimals
	celsius = Math.round(celsius * 100) / 100.0;
	
	//Display the result
	System.out.println("Temperature: " + farenheit + "fareheit is " + celsius + " degrees in celsius.");
	JOptionPane.showMessageDialog(null, "Temperature: " + farenheit + " farenheit is " + celsius + " degrees in celsius");
	
	}

}

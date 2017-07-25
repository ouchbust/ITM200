import javax.swing.JOptionPane;

public class CH03Q2 {

	public static void main(String[] args) {
	//Get info from user and convert to appropriate data type
	//Enter yearly interest rate (ie 8%)
	String var = JOptionPane.showInputDialog(null, "Enter yearly interest rate (ie 8%): " , "LabCH3Q3", JOptionPane.QUESTION_MESSAGE);
	//Convert string to int
	double interestRate = Double.parseDouble(var);
	//Your interest rate is = 
	System.out.println("Your interest rate is " + interestRate + ".");
	
	//Obtain monthly interest by dividing by 1200
	double monthlyInterestRate = interestRate / 1200;
	//Enter number of years
	var = JOptionPane.showInputDialog(null, "Enter number of years:", "LabCH3Q3", JOptionPane.QUESTION_MESSAGE);
	//Convert string to int
	double numberofYears = Double.parseDouble(var);
	System.out.println("Your loan years is " + numberofYears + ".");
	//Enter loan amount
	var = JOptionPane.showInputDialog(null, "Enter loan amount", "LabCH3Q3", JOptionPane.QUESTION_MESSAGE);
	//convert string to int
	double loanAmount = Double.parseDouble(var);
	System.out.println("Your loan amount is " + loanAmount + ".");
	//Calculate payment
	double monthlyPayment = loanAmount * monthlyInterestRate / (1	- 1 / Math.pow(1 + monthlyInterestRate, numberofYears * 12));
	double totalPayment = monthlyPayment * numberofYears * 12;
	//Format to keep two digits after the decimal point
	monthlyPayment = Math.round(monthlyPayment * 100) / 100.0;
	totalPayment = Math.round(totalPayment * 100) / 100.0;
	//Display results
	System.out.println("The monthly payment is " + monthlyPayment);
	System.out.println("The total payment is " + totalPayment);
	}

}

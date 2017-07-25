import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Assignment1 {

	public static void main(String[] args) {
	
	//DECLARE VARIABLES AND HEADER
	final double OTRate = 1.5;
	int cnt = 0;
	double basePay;
	double hours;
	double baseHours = 0;
	double overtimeHours;
	double netSalary = 0;
	double totalSalary = 0;
	double averageSalary = 0;
	double totalHours = 0;
	double totalBasePay = 0;
	
	NumberFormat formatter = new DecimalFormat("$###,###,###,##0.00");
	
	System.out.printf("%15s  %10s %10s %15s \n", "Last Name", "Base","Hours", "Net Salary");

	//INPUT NAME AND ISOLATE LAST
	String strName = JOptionPane.showInputDialog("Please enter a name. Leave blank when done.");
	while(!strName.equals("")) {
		int pos = strName.indexOf(" ");
		String lastName = strName.substring(pos+1);
		lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
		
		//INPUT BASE PAY
		String strbasePay = JOptionPane.showInputDialog("Please enter a base pay.");
		basePay = Double.parseDouble(strbasePay);
		//INPUT HOURS WORKED AND SEPERATE OT HOURS FROM BASE HOURS
		String strHours = JOptionPane.showInputDialog("Please enter a hours worked.");
		hours = Double.parseDouble(strHours);
			if (hours > 40) {
				baseHours = 40;
				overtimeHours = hours - 40;
			}
			else {
				overtimeHours = 0;
				baseHours = hours;
			}
		
		//CALCULATE NET SALARY AND REPEAT LOOP FOR NAME
			netSalary = (baseHours*basePay) + (overtimeHours*OTRate);
				netSalary = Math.round(netSalary * 100) / 100.0;
		//CALCULATE TOTALS
			totalSalary += netSalary;
			totalHours += hours;
			totalBasePay += basePay;
			cnt += 1;
			strName = JOptionPane.showInputDialog("Please enter a name. Leave blank when done.");
		

	System.out.printf("%15s  %10s %10s %15s \n", lastName, "$"+basePay , hours , "$"+netSalary);
	}
		
	//FOOTER AND ROUND AVERAGE VALUES
	averageSalary = totalSalary / cnt;
		averageSalary = Math.round(averageSalary * 100) / 100.0;
	double averageHours = totalHours/cnt;
		averageHours = Math.round(averageHours * 100) / 100.0;
	double averageBasePay = totalBasePay/cnt;
		averageBasePay = Math.round(averageBasePay * 100) / 100.0;
	System.out.println("_______________________________________________________________________");
	System.out.printf("%15s  %10s %10s %15s \n", "AVERAGES","$"+averageBasePay , averageHours , "$"+averageSalary);
	//System.out.println("Averages: " + "$"+averageSalary);
	System.out.println("Number of employees processed: " + cnt);
			
	


	}
	}



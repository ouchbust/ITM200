import javax.swing.JOptionPane;

public class Ch7Q3 {

	public static void main(String[] args) {
	String strDay = JOptionPane.showInputDialog("Enter day in DD format.");
	
	String strMonth = "";
	String numStr = JOptionPane.showInputDialog("Enter month number.");
	int month = Integer.parseInt(numStr);
	
	String strYear = JOptionPane.showInputDialog("Enter year in YYYY format."); 
	int year = Integer.parseInt(strYear);
	boolean isLeapYear = ((year % 4 ==0) && (year % 100 != 0) || (year % 400 ==0));
	
	switch(month) {
		case 1:
			strMonth = "January";
			break;
		case 2:
			strMonth = "February";
			break;
		case 3:
			strMonth = "March";
			break;
		case 4:
			strMonth = "April";
			break;
		case 5:
			strMonth = "May";
			break;
		case 6:
			strMonth = "June";
			break;
		case 7:
			strMonth = "July";
			break;
		case 8:
			strMonth = "August";
			break;
		case 9:
			strMonth = "September";
			break;
		case 10:
			strMonth = "October";
			break;
		case 11:
			strMonth = "November";
			break;
		case 12:
			strMonth = "December";
			break;
		default:
			strMonth = "Invalid month";
			break;
	}
	
	int numdays;
	switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			numdays = 31;
			break;
		case 4: case 6: case 9: case 11:
			numdays = 30;
		case 2:
			if (isLeapYear)
				numdays = 29;
			else
				numdays = 29;
			break;
		default:
			numdays = 0;
			break;		
	}
	System.out.println(strMonth + " " + strDay + ", " + strYear);
	System.out.println("Number of days in a month: " + numdays);
	}

}

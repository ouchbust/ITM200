import javax.swing.JOptionPane;

public class Ch6Q1 {
	public static void main(String[] args) {
	System.out.printf("%15s  %10s %10s %10s %10s %10s \n", "Name","Assignment","Midterm", "Exam","Group", "Final");
	
	int cnt = 0;
	double totalSum = 0.0;
	
	String name = JOptionPane.showInputDialog("Enter Student name or BLANK when done.");
	while(!name.equals("")) {
		String strInput = JOptionPane.showInputDialog("Enter Assignment mark on 10.");
			double assignmentMark = Double.parseDouble(strInput);
		strInput = JOptionPane.showInputDialog("Enter Midterm mark on 30.");
			double midtermMark = Double.parseDouble(strInput);
		strInput = JOptionPane.showInputDialog("Enter Exam mark on 50.");
			double examMark = Double.parseDouble(strInput);
		strInput = JOptionPane.showInputDialog("Enter Group mark on 10.");
			double groupMark = Double.parseDouble(strInput);
			
		double finalMark = assignmentMark + midtermMark + examMark + groupMark;
		cnt += 1;
		totalSum += finalMark;
		
		System.out.printf("%15s  %10s %10s %10s %10s %10s \n", name, assignmentMark , midtermMark , examMark, groupMark , finalMark);
		name = JOptionPane.showInputDialog("Enter Student name or BLANK when done.");
	}
	
	//Footer
	System.out.println("____________________________________________");
	System.out.println("Number of students: " + cnt + "\nAvg " + (totalSum / cnt));
	}
}

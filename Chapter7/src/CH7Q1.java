//Made by Me. 
import javax.swing.JOptionPane;
public class CH7Q1 {

	public static void main(String[] args) {
		String numStr;
		int largerValue = (int)(Math.random() * 10);
		int smallerValue = (int)(Math.random() * 10);
		if (largerValue > smallerValue)
			JOptionPane.showMessageDialog(null, "Values were in correct variables.");
		else {
			int temp;
			temp = largerValue;
			largerValue = smallerValue;
			smallerValue = temp;
			JOptionPane.showMessageDialog(null,"Values moved to correct variables.");
			}
	System.out.println("Larger Value = " + largerValue);
	System.out.println("Smaller Value = " + smallerValue);
	
	numStr = JOptionPane.showInputDialog("What is " + largerValue + " - " + smallerValue + "?");
	int answer = Integer.parseInt(numStr);
	if (answer == largerValue - smallerValue){
			System.out.println("You are correct!");
			System.out.println(largerValue + " - " + smallerValue + " = " + answer);
		}
		else{
			System.out.println("You are wrong!");
			JOptionPane.showMessageDialog(null,largerValue + " - " + smallerValue + " = " + (largerValue - smallerValue));
			System.out.println(largerValue + " - " + smallerValue + " = " + (largerValue - smallerValue));

		}
	}

}

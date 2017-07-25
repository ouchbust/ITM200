import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Ch5Q1 {
	public static void main(String[] args) {
		String strSales = JOptionPane.showInputDialog("Enter Sales.");
		double sales = Integer.parseInt(strSales);
		String region = JOptionPane.showInputDialog("Enter Region.");
		region = region.toUpperCase().trim();
		double discount = 0.0;
		
	if (region.equals("EAST")){
		if(sales < 0){
				JOptionPane.showMessageDialog(null,"Sales is negative. Please run program again.");
				System.exit(0);
		}
		else if (sales < 4000000)
			discount = 0.0125;
		else if (sales <= 15000000)
			discount = 0.0225;
		else
			discount = 0.0325;
	}
	
	else if (region.equals("CENTRAL")){
		if(sales < 0){
			JOptionPane.showMessageDialog(null,"Sales is negative. Please run program again.");
			System.exit(0);
	}
		else if (sales < 15000000)
			discount = 0.015;
		else if (sales <= 22000000)
			discount = 0.025;
		else
			discount = 0.035;
	}
	else if (region.equals("WEST")){
	
		if(sales < 0){
			JOptionPane.showMessageDialog(null,"Sales is negative. Please run program again.");
			System.exit(0);
	}
		else if (sales < 8000000)
			discount = 0.0225;
		else if (sales <= 12000000)
			discount = 0.0325;
			else
				discount = 0.0425;
	}
	else{
		System.out.println("Incorrect region.");
		System.exit(0);
	}
	
	NumberFormat formatter = new DecimalFormat("###,###,###,##0.00");
	strSales = "4" + formatter.format(sales);
	String strAmount = "$" + formatter.format((1 - discount) * sales);
	
	System.out.println("With sales of " + strSales + " in the " + region + " region");
	System.out.println("a customer should get a " + discount * 100.0 + "% discount and pay only " + strAmount + ".");
	
		}
	}
	
	


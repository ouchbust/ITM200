import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
public class CH4Q3 {

	public static void main(String[] args) {
	//Header & Variable
	System.out.printf("%-15s      %15s      %15s    %15s\n", "Name","Amount","HST","Total");
	
	final double HST = .13;
	String strAmount;
	double amount;
	double amountHST;
	double total;
	NumberFormat formatter = new DecimalFormat("$###,###,###,##0.00");
	String strName;
	String strAmt;
	String strHST;
	String strTot;
	
//BODY 1 ***************************
	
	strName = JOptionPane.showInputDialog("Input a name");
	strAmount = JOptionPane.showInputDialog("Input a dollar amount");
	amount = Double.parseDouble(strAmount);
	amountHST = amount * HST;
	total = amount + amountHST;
	
	strAmt = formatter.format(amount);
	strHST = formatter.format(amountHST);
	strTot = formatter.format(total);
	
	System.out.printf("%-15s     %,15.2f    %,15.2f     %,15.2f\n", strName,amount,amountHST,total);
	
	strName = (strName + "               ").substring(0, 15);
	strAmt="***************" + strAmt;
	strAmt = strAmt.substring(strAmt.length() - 15);
	strHST="***************" + strHST;
	strHST = strAmt.substring(strHST.length() - 15);
		strTot = "***************" + strTot;
		strTot = strTot.substring(strTot.length() - 15);
    System.out.println(strName + "     " + strAmt + "          " + strHST + "     " + strTot);
	
  //BODY 2 ***************************
	
  	strName = JOptionPane.showInputDialog("Input a name");
  	strAmount = JOptionPane.showInputDialog("Input a dollar amount");
  	amount = Double.parseDouble(strAmount);
  	amountHST = amount * HST;
  	total = amount + amountHST;
  	
  	strAmt = formatter.format(amount);
  	strHST = formatter.format(amountHST);
  	strTot = formatter.format(total);
  	
  	System.out.printf("%-15s     %,15.2f    %,15.2f     %,15.2f\n", strName,amount,amountHST,total);
  	
  	strName = (strName + "               ").substring(0, 15);
  	strAmt="***************" + strAmt;
  	strAmt = strAmt.substring(strAmt.length() - 15);
  	strHST="***************" + strHST;
  	strHST = strAmt.substring(strHST.length() - 15);
  		strTot = "***************" + strTot;
  		strTot = strTot.substring(strTot.length() - 15);
      System.out.println(strName + "          " + strAmt + "          " + strHST + "          " + strTot);
      
	}

}


import javax.swing.JOptionPane;
import java.io.*;
public class Chapter10_Q1 {

    public static void main(String[] args) throws IOException
    {
        String fileName = "products.txt";
        FileWriter outputFile = new FileWriter(fileName);
        BufferedWriter outputBuffer = new BufferedWriter(outputFile);
        PrintWriter printStream = new PrintWriter(outputBuffer);

        String companyName = JOptionPane.showInputDialog("Please enter company name.");
        printStream.println(companyName);
        System.out.println(companyName);

        String strVar = JOptionPane.showInputDialog("Enter a code or leave blank to quit.");
        while (!strVar.equals(""))
        {
            String code = strVar;
            String desc = JOptionPane.showInputDialog("Enter description.");
            String inv = JOptionPane.showInputDialog("Enter inventory quantity.");
            String price = JOptionPane.showInputDialog("Enter price: ");
            String cost = JOptionPane.showInputDialog("Enter cost: ");

            printStream.println(code + "," + desc + "," + inv + "," + price + "," + cost);
            System.out.println(code + "," + desc + "," + inv + "," + price + "," + cost);
            strVar = JOptionPane.showInputDialog("Enter code or leave blank to quit.");
        }
        printStream.close();
    }
}

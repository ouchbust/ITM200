import javax.swing.JOptionPane;
import java.io.*;
public class Chapter10_Q2 {
    public static String[] code = new String[1000];
    public static String[] desc = new String[1000];
    public static double[] inv = new double[1000];
    public static double[] price = new double[1000];
    public static double[] cost = new double[1000];

    public static double[] retailvalue = new double[1000];
    public static double[] profitvalue = new double[1000];

    public static int count = 0;
    public static int bookCount = 0;
    public static int softwareCount = 0;
    public static double totalInv = 0.0;
    public static double totalValue = 0.0;
    public static double totalProfit = 0.0;

    public static void main(String[] args) throws IOException
    {
    String filename = "products.txt";
    FileReader inputFile = new FileReader("products.txt");
    BufferedReader inputBuffer = new BufferedReader(inputFile);

    String header = inputBuffer.readLine();
    System.out.printf("%-10s %-20s %10s %10s %10s %15s %15s \n", "Code", "Description", "Qty", "Price", "Cost", "Retail Value", "Profit Value");

    String numString = inputBuffer.readLine();
    while (numString != null);
        {
            System.out.println(numString);

            String[] a = numString.split(",");
            code[count] = (a[0]).trim();
            desc[count] = (a[1]).trim();
            inv[count] = Double.parseDouble((a[2]).trim());
            price[count] = Double.parseDouble((a[3]).trim());
            cost[count] = Double.parseDouble((a[4]).trim());

            retailvalue[count] += price[count] * inv[count];
            profitvalue[count] += (price[count] - cost[count]) * inv[count];

            totalInv += inv[count];
            totalValue += retailvalue[count];
            totalProfit += profitvalue[count];

            if (code[count].substring(0, 1).equals("J"))
                bookCount++;
            else if (code[count].substring(0, 1).equals("N"))
                softwareCount++;

            System.out.printf("%-10s %-20s %10.0f %10.2f %10.2f %15.2f %15.2f \n", code[count], desc[count], inv[count], price[count], cost[count], retailvalue[count], profitvalue[count]);

            count++;
            numString = inputBuffer.readLine();
        }
        inputBuffer.close();

        System.out.println("The total number of products read in was " + count);
        System.out.print("The total number of inventory items read in was " + totalInv);
        System.out.println("The total number of books read in was " + bookCount);
        System.out.println("The total retail value of inventory is " + totalValue);
        System.out.println("The total profit value of inventory is " + totalProfit);
        }
    }


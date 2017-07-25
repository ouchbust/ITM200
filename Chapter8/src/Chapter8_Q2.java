import javax.swing.JOptionPane;
public class Chapter8_Q2 {
    public static String code = "";
    public static String desc = "";
    public static double inv = 0.0;
    public static double price = 0.0;
    public static double cost = 0.0;
    public static double retailvalue = 0.0;
    public static double profitvalue = 0.0;

    public static void main (String[] args) {
        code = getInputString("Please enter product code.");
        desc = getInputString("Please enter description.");
        inv = getInputDouble("Please enter inventory.");
        price = getInputDouble("Please enter price.");
        cost = getInputDouble("Please enter cost.");
        retailvalue = processInput(inv,price);
        profitvalue = processInput(inv,price,cost);
        doOutput();
    }
    public static String getInputString(String msg){
        String s = JOptionPane.showInputDialog(msg);
        return s;
    }
    public static double getInputDouble(String msg) {
        String s = JOptionPane.showInputDialog(msg);
        double value = Double.parseDouble(s);
        return value;
    }
    public static double processInput(double inv, double price){
        return inv * price;
    }
    public static double processInput(double inv, double price, double cost){
        return (price - cost) * inv;
    }

    public static void doOutput() {
        System.out.printf("%-10s %-15s %10s %10s %10s %15s %15s \n", "Code", "Description", "Qty", "Price", "Cost", "Retail Value", "Profit Value");
        System.out.printf("%-10s %-15s %10.0f %10.2f %10.2f %15.2f %15.2f \n", code, desc, inv, price, cost, retailvalue, profitvalue);
    }

    }

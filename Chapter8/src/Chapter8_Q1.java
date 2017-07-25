import javax.swing.JOptionPane;
public class Chapter8_Q1 {
    public static void main(String[] args) {
        String code = getInputString("Please enter product code.");
        String desc = getInputString("Please enter description.");
        double inv = getInputDouble("Please enter inventory.");
        double price = getInputDouble("Please enter price.");
        double cost = getInputDouble("Please enter cost.");
        double retailvalue = processInput(inv, price);
        double profitvalue = processInput(inv, price, cost);
        doOutput(code, desc, inv, price, cost, retailvalue, profitvalue);
    }
    public static String getInputString(String msg) {
        String s = JOptionPane.showInputDialog(msg);
        return s;
    }
    public static double getInputDouble(String msg) {
        String s = JOptionPane.showInputDialog(msg);
        double value = Double.parseDouble(s);
        return value;
    }
    public static double processInput(double inv, double price) {
        return inv * price;
    }
    public static double processInput(double inv, double price, double cost) {
        return (price - cost) * inv;
    }
    public static void doOutput(String code, String desc, double inv, double price, double cost, double retVal, double profVal) {
        System.out.printf("%-10s %-15s %10s %10s %10s %15s %15s \n", "Code", "Description", "Qty", "Price", "Cost", "Retail Value", "Profit Value");
        System.out.printf("%-10s %-15s %10.0f %10.2f %10.2f %15.2f %15.2f \n", code, desc, inv, price, cost, retVal, profVal);
    }

}

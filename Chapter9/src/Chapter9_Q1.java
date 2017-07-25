import javax.swing.JOptionPane;
public class Chapter9_Q1 {
    public static String[] code = new String[1000];
    public static String[] desc = new String[1000];
    public static double[] inv = new double[1000];
    public static double[] price = new double[1000];
    public static double[] cost = new double[1000];
    public static double[] retailvalue = new double[1000];
    public static double[] profitvalue = new double[1000];
    public static int cnt = 0;
    public static double totalRetail = 0.0;
    public static double totalProfit = 0.0;

    public static void main(String[] args) {

        System.out.printf("%-10s %-20s %10s %10s %10s %15s %15s \n", "Code", "Description", "Qty","Price","Cost","Retail Value", "Profit Value");

        String str = JOptionPane.showInputDialog("Enter code or BLANK when done.");
        while(!str.equals("")) {
            code[cnt] = str;
            desc[cnt] = getInputString("Please enter description.");
            inv[cnt] = getInputDouble("Please enter inventory.");
            price[cnt] = getInputDouble("Please enter price.");
            cost[cnt] = getInputDouble("Please enter cost.");
            retailvalue[cnt] = processInput(inv[cnt], price[cnt]);
            profitvalue[cnt] = processInput(inv[cnt], price[cnt], cost[cnt]);
            totalRetail += retailvalue[cnt];
            totalProfit += profitvalue[cnt];
            doOutput();
            cnt += 1;
            str = JOptionPane.showInputDialog("Enter code or BLANK when done.");
        }
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-10s %-20s %10s %10s %10s %15s %15s \n", "# of Items: ", cnt, "", "", "", totalRetail, totalProfit);
    }
    public static String getInputString(String msg) {
        String s = JOptionPane.showInputDialog(msg);
        return s;
    }
    public static double getInputDouble(String msg) {
        String s =  JOptionPane.showInputDialog(msg);
        double value = Double.parseDouble(s);
        return value;
    }
    public static double processInput(double inv, double price){
        return inv * price;
    }
    public static double processInput(double inv, double price, double cost) {
        return (price - cost) * inv;
    }
    public static void doOutput() {
        System.out.printf("%-10s %-20s %,10.0f %,10.2f %,10.2f %15f %15f \n", code[cnt], desc[cnt], inv[cnt], price[cnt], cost[cnt], retailvalue[cnt], profitvalue[cnt]);

    }
}

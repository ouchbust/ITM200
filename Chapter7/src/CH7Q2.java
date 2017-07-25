import javax.swing.JOptionPane;
public class CH7Q2 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Enter sentence");
		String cs = JOptionPane.showInputDialog("Enter character");
		int count = 0;
		char c;
		char tc = cs.charAt(0);
		for (int i = 0; i < s.length(); i++) {
		c = s.charAt(i);
		System.out.println(c);
		if (c == tc){
				count++;
				System.out.println(count);
		}
		}
		System.out.println("Character " + tc + " appears " + count + " times in\n\"" + s + "\"");
	}

}

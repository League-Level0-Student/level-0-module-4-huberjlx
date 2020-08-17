package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class testscores {

	public static void main(String[] args) {
	
		String score = JOptionPane.showInputDialog("What did you get on your test? ");
		double response = Double.parseDouble(score);


if (response >= 90) {
	JOptionPane.showMessageDialog(null, "Wow, good job!");
}
else if(response >= 80) {
	JOptionPane.showMessageDialog(null, "Try harder but not too shabby");
}
else {
	JOptionPane.showMessageDialog(null, "Study more, much more");
}
	}

}

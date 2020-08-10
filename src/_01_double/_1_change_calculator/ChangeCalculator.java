package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels =JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int nickelss = (int) (Integer.parseInt(nickels)*5);

		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog("How many dimes do you have? ");
int dimess = (int) (Integer.parseInt(dimes)*10);
		// Ask the user how many quarters they have, and convert their answer
String quarters = JOptionPane.showInputDialog("How many quarters do you have? ");
int quarterss = (int) (Integer.parseInt(quarters)*25);
		// Calculate how much money the user has.  Hint: Use a double variable 
int money = nickelss+dimess+quarterss;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
if( money % 100 < 10 ) {
	JOptionPane.showMessageDialog(null, "You have $"+money/100 + ".0" + (money % 100 ));
} else {
	JOptionPane.showMessageDialog(null, "You have $"+money/100 + "." + (money % 100 ));	
}


	}
}


package _02_boolean._1_sleepy_head;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend = false;
		// Write code to ask the user what day it is.
        String question = JOptionPane.showInputDialog("What day of the week is it? ");
		// Set the boolean isWeekend based on the value they enter
        
        if (question.equalsIgnoreCase("Saturday")) {
        	isWeekend = true;
        }
        else if (question.equalsIgnoreCase("Sunday")) {
	    isWeekend = true;
        }
        else {
        	isWeekend = false;
        }
        if (isWeekend=true) {
        	JOptionPane.showMessageDialog(null,"Sleep in");
        }
        else if (isWeekend=false) {
        	JOptionPane.showMessageDialog(null, "Don't sleep in. You will be late for school");
        }
		
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
		String question2 = JOptionPane.showInputDialog("How did you do on your exam? ");
		int question02 = Integer.parseInt(question2);
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		if (question02 >= 70) {
        	passedExam = true;
        }
        else if (question02<=69) {
	    passedExam = false;
        }
		// If the user passed the exam, congratulate them
        if (passedExam=true) {
        	JOptionPane.showMessageDialog(null,"Good job");
        }
        else if (passedExam=false) {
        	JOptionPane.showMessageDialog(null, "Better luck next time,");
        }
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		JOptionPane.showMessageDialog(null, "ggwp You lost or won");
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String question3 = JOptionPane.showInputDialog("What color do you want your shape?");
		if (question3.equalsIgnoreCase("red")) {
			isRed=true;
		}
		else {
			isRed=false;
		}
		boolean isSquare = false;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String question4 = JOptionPane.showInputDialog("What shape do you want ");
		if (question4.equalsIgnoreCase("square")) {
			isSquare=true;
		}
		else {
			isRed=false;
		}
		
		if (isRed == true && isSquare == true) {
			drawRedSquare();
		}
		else {
			JOptionPane.showMessageDialog(null, "I don't know how to draw that shape.");
		}
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare(){
		Robot rob = new Robot();
		// Complete the rest of this method
		rob.setPenColor(Color.red);
		rob.penDown();
		for (int i=0; i <4;i++) {
			rob.move(300);
			rob.turn(90);
		}
		
	}	
}

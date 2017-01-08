import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int year = 2016;
		/**int yearborn = year - 30; 
		*JOptionPane.showMessageDialog(null, "You were born in " + yearborn);
		**/
		if(age.equals("30")){
			JOptionPane.showMessageDialog(null, "You are too old to play this game.");
		}
		

	}

}




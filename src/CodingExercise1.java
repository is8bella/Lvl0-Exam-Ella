import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class CodingExercise1 {
	 

    public static void main(String[] args) {
   	 	String user = JOptionPane.showInputDialog("What color would you like Bender to draw in: yellow or blue?");
   	 	Robot Bender = new Robot();
   	 	Bender.setPenWidth(10);
   	 		if(user.equals("yellow")){
   	 			Bender.setPenColor(250, 0, 0);
   	 		}
   	 		else if(user.equals("blue")){
   	 			Bender.setPenColor(0, 0, 250);
   	 		}
   	 	move(Bender);
    }
 
    static void move(Robot Bender){
    	Bender.penDown();
	 for (int i = 0; i <= 4; i++) {
		 Bender.move(100);
		 Bender.turn(90);
	}

 }

    
   

}

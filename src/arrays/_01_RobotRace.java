package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		Random x = new Random();

		// 2. create an array of 5 robots.
		Robot[] bob = new Robot[10];

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < bob.length; i++) {
			bob[i] = new Robot();
			bob[i].miniaturize();
			bob[i].setSpeed(5000);
			bob[i].setX(100);
			bob[i].setY(500);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean isRacing = true;
		while (isRacing == true) {

			for (int i = 0; i < bob.length; i++) {
				int thing= x.nextInt(11)+1;
				
				for (int k=0; k<thing; k++) {
					bob[i].move(10);
					bob[i].turn(5);
					if (bob[i].getX()<=101 && bob[i].getY()==500) {
						JOptionPane.showMessageDialog(null, "Robot "+(i+1)+" won the race! Party");
						isRacing= false;
						
						System.exit(0);
					}
				}
				
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		
		// 7. declare that robot the winner and throw it a party!
		
		// 8. try different races with different amounts of robots.
		
		// 9. make the robots race around a circular track.
		for (int j=0; j>5; j++) {
			
			
			}
	}
}
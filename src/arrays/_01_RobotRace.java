package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	
	//2. create an array of 5 robots.
	Robot [] arr = new Robot[5];
	//3. use a for loop to initialize the robots.
	for (int i = 0; i <= 4; i++) {
		arr[i] = new Robot("mini");
		arr[i].setSpeed(100);
	}
		//4. make each robot start at the bottom of the screen, side by side, facing up
		arr[0].moveTo(160, 300);
		arr[1].moveTo(160, 300);
		arr[2].moveTo(160, 300);
		arr[3].moveTo(160, 300);
		arr[4].moveTo(160, 300);
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		boolean inProgress = true;
		while(inProgress) {
			for (int i = 0; i < arr.length; i++) {
				Random rand = new Random();
				for (int j = 0; j < rand.nextInt(51); j++) {
					arr[i].move(10);
					arr[i].turn(5);
				}
				if (arr[i].getY()<=300 && arr[i].getX()<=163) {
					JOptionPane.showMessageDialog(null, "Robot at lane " + (i+1) + " is a winner.");
					inProgress=false;
				}
			}
		}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.

	}
}
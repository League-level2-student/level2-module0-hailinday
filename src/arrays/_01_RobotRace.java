package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	
	//2. create an array of 5 robots.
	Robot [] arr = new Robot[5];
	//3. use a for loop to initialize the robots.
	for (int i = 0; i <= 4; i++) {
		arr[i] = new Robot("mini");
	}
		//4. make each robot start at the bottom of the screen, side by side, facing up
		arr[0].moveTo(160, 600);
		arr[1].moveTo(340, 600);
		arr[2].moveTo(520, 600);
		arr[3].moveTo(700, 600);
		arr[4].moveTo(880, 600);
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	for (int i = 0; i < arr.length; i++) {
		Random rand = new Random();
		arr[i].move(rand.nextInt(10));
	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	
	int i =0;
	while(arr[i].getY()>= 0 && i < arr.length) {
		Random r = new Random();
		arr[i].setY(arr[i].getY() -  r.nextInt(10));
		i++;
	}
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.

	}
}
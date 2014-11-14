
//import java.awt.Color;

import kareltherobot.*;

public class ZRunnerRunner implements Directions
{	
	
	public static void main(String[] args)
	{
		World.setVisible(true);
		World.setDelay(5);
		World.setSize(10, 10);
		
		
		
		ZRunner bob = new ZRunner(1,1,East,infinity,8);
		
		bob.walkStraight();
		bob.returnStuff();
		bob.stairStep();
		bob.finish();
		
		bob.setVisible(false);
		
		World.setDelay(10);
		
		
		while(true)
		{
			
			bob.turnLeft();
			//Colors();
			
		}
	}
}

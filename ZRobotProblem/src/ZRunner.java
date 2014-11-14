import kareltherobot.*;

public class ZRunner extends Robot
{
	private int moves;
	public ZRunner(int street, int avenue, Direction direction, int beepers, int steps) 
	{
		super(street, avenue, direction, beepers);
		moves = steps;
	}

	public void walkStraight()
	{
		for(int x = 0; x < moves; x++)
		{
			putBeeper();
			move();
		}
	}
	
	public void returnStuff()
	{
		turnLeft();
		turnLeft();
		
		for(int x = 0; x < moves; x++)
		{
			move();
		}
	}
	
	public void stairStep()
	{
		turnLeft();
		turnLeft();
		turnLeft();
		
		for(int x = 0; x < moves - 1; x++)
		{
			
			
			move();
			turnLeft();
			turnLeft();
			turnLeft();
			move();
			putBeeper();
			turnLeft();
			
		}
		
		
	}
	public void finish()
	{
		turnLeft();
		
		for(int x = 1; x < moves; x++)
		{
			
			move();
			putBeeper();
			
		}
	}
	
}

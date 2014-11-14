import kareltherobot.*;

public class CheckerRobot extends Robot{

	public CheckerRobot(int st, int av, Direction d, int n){
		super(st, av, d, n);	
	}

	//predicates only test the environment
	//predicates should never change the environment
	
	public boolean frontIsBlocked(){
		
		return !frontIsClear();		
	}
	
	public boolean notNextToABeeper(){
		
		return !nextToABeeper();
	}
	
	public boolean rightIsClear(){
		
		turnRight();
		if(frontIsClear()){
			
			turnLeft();
			return true;
			
		} else {
			
			turnLeft();
			return false;
			
		}
		
	}
	
	public boolean facingEastOrWest(){
		
		if(facingEast())
			return true;
		if(facingWest())
			return true;
		else
			return false;
	}
	
	public boolean facingNorthAndHasABeeper(){
		
		if(facingNorth()){
			if(nextToABeeper()){
				return true;
			}
		} else {
			return false;
		}
	}
	
}
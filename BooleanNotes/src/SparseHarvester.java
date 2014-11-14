import kareltherobot.*;

public class SparseHarvester extends Robot{

	
	public SparseHarvester(int st, int ave, Direction d, int n) {
		
		super(st, ave, d, n);
		 
		}

	public void pickBeeper(){
		if(nextToABeeper() )
		{
			super.pickBeeper();
		} else {
			putBeeper();
		}
	}
	
	public void moveAndPick() {
		move();
		pickBeeper();
	}
	
	public void pickRow() {
		moveAndPick();
		moveAndPick();
		moveAndPick();
		moveAndPick();
		moveAndPick();
	}
	
	public void turnAroundLeft() {
		move();
		turnLeft();
		move();
		turnLeft();
	}
	
	public void turnAroundRight() {
		move();
		turnRight();
		move();
		turnRight();
	}
	
	public void turnRight() {
		World.setDelay(0);
		turnLeft();
		turnLeft();
		turnLeft();
		World.setDelay(5);
	}
	
	public void pickTwoRows() {
		pickRow();
		turnAroundLeft();
		pickRow();
		turnAroundRight();
	}
	
	public void harvestField() {
		pickTwoRows();
		pickTwoRows();
		pickTwoRows();
	}
	
	public void faceNorthIfFacingSouth(){
		if(facingSouth())
		{
			turnLeft();
			turnLeft();
		}
	}
	
	
}

import kareltherobot.*;

public class wallOutliner extends Robot {

	public wallOutliner(int s, int a, Direction d, int n){
		super(s ,a ,d ,n);
	}
	
	private void turnRight(){
		World.setDelay(0);
		turnLeft();
		turnLeft();
		turnLeft();
		World.setDelay(5);
	}
	
	private void testWall(){
		turnLeft();
		if(frontIsClear()){
			move();
			turnLeft();
			move();
		} else {
			putBeeper();
			turnRight();
			move();
		}
	}
	
	private void outlineWall(){
		while(frontIsClear())
		testWall();
		
	}
		
	
	public static void main(String[] args) {
		World.setVisible(true);
		World.setDelay(5);
		World.readWorld("question4.kwld");		
		
		wallOutliner bob = new wallOutliner(5,5,East,infinity);
		bob.outlineWall();
		

	}
}

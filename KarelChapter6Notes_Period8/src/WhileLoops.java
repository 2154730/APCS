import kareltherobot.*;

public class WhileLoops extends Robot{

	public WhileLoops(int st, int av, Direction d, int n) {
		super(st, av, d, n);
	}


	public void clearBeepers(){
		while(nextToABeeper())
			pickBeeper();
	}
	
	public void move(int n){
		for(int i = 0; i < n; i++){
				move();
		}
	}
	
	//while loop should return false eventually.
	//infinite loops =/= good.
	
	public void faceNorth(){
		while(!facingNorth()){
			turnLeft();
		}
	}
	
	public void clearAllBeepersToTheWall(){
		while(frontIsClear()){
			move();
			pickBeeper();
		}
	}
	
	public void pickLine(){
		move();
		while(nextToABeeper()){
			pickBeeper();
			move();
		}
	}
	
	public static void main(String[] args) {
		World.readWorld("fieldCH6.kwld");
		World.setDelay(5);
		World.setVisible(true);
		
		WhileLoops bob = new WhileLoops(3,2, East, infinity);
		bob.pickLine();
	}
	

}

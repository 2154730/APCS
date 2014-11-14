import kareltherobot.*;

public class FiveBeeperPlacer extends Robot {

	private void makeRow(){
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				putBeeper();
			}
			move();
		}
		turnLeft();
		
	}
	
	private void makeSquare(){
		for(int i = 0; i < 4; i++){
			makeRow();
		}
	}
	
	public FiveBeeperPlacer(int street, int avenue, Direction direction, int beepers) 
	{
		super(street, avenue, direction, beepers);
	}

	public static void main(String[] args) {
		World.setVisible(true);
		World.setDelay(5);
		
		FiveBeeperPlacer bob = new FiveBeeperPlacer(2, 2, East, infinity); 
		bob.makeSquare();
	}

}

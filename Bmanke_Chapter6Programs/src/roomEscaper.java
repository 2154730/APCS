import kareltherobot.*;

public class roomEscaper extends Robot {

	public roomEscaper(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		
	}
	
	private void checkWall(){
		World.setDelay(0);
		turnLeft();
		World.setDelay(5);
	}
	
	private boolean leftIsClear(){
		World.setDelay(0);
		turnLeft();
		if(frontIsClear()){
			turnRight(); 
			World.setDelay(5);
			return true;
		} else {
			turnRight(); 
			World.setDelay(5);
			return false;
		}
	}
	
	private void turnRight(){
		World.setDelay(0);
		turnLeft();
		turnLeft();
		turnLeft();
		World.setDelay(5);	
	}
	
	private void escapeRoom(int n){
		for(int i = 0; i < n; i++){
			if(frontIsClear()){
				move();
				checkWall();
				while(!frontIsClear()){
				turnRight();
				}	
			}
		}
	}

	public static void main(String[] args) {
		World.setVisible(true);
		World.setDelay(5);
		World.readWorld("roomEscape.kwld");
		
		roomEscaper bob = new roomEscaper(2,3, North, infinity);
		bob.escapeRoom(12);
		bob.turnOff();

	}
	
}

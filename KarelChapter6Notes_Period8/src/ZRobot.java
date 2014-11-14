import kareltherobot.*;


public class ZRobot extends Robot{
	
	public ZRobot(int s, int a, Direction d, int n) {
		super(s, a, d, n);
		// TODO Auto-generated constructor stub
	}

	public void move(int n){
		for(int i = 0; i < n; i++){
				move();
		}
	}
	
	public void turnRight(){
		World.setDelay(0);
		turnLeft();
		turnLeft();
		turnLeft();
		World.setDelay(5);
	}
	
	public void climbStep(){
		move();
		turnRight();
		move();
		putBeeper();
	}
	
	public void makeZ(int n){
		for(int i = 0; i < n; i++){
			putBeeper();
			move();
			for(int j = 0; j < n; j++){
				climbStep();
			}
			
		}
	}

	public static void main(String[] args) {
		World.setVisible(true);
		World.setDelay(5);
		
		ZRobot bob = new ZRobot(1,1,East,infinity);
		bob.makeZ(5);

	}

}

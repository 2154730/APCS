import kareltherobot.*;

public class Hurdler extends Robot {
	
	public Hurdler(int st, int av, Direction d, int num) {
		super(st, av, d, num);
		
	}
	
	public void turnRight(){
		World.setDelay(0);
		turnLeft();
		turnLeft();
		turnLeft();
		World.setDelay(5);
	}
	
	public void climbWall(){
		if(frontIsClear()){
			move();
			climbWall();
		}
		else {
			turnLeft();
			climbWall();
		}
	}

	public void move(int n){
		for(int x = 0; x < n; x++){
			move(n);
		}
	}
	
}

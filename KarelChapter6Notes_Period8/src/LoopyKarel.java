import kareltherobot.*;

public class LoopyKarel extends Robot{


	public LoopyKarel(int st, int av, Direction d, int n){
		super(st,av,d,n);
	}

	public void turnRight(){
		for(int i = 0; i < 3; i++){
			turnLeft();
		}
	}
	
	public void move(int n){ // overloaded move(n); method, takes parameter n.
		for(int i = 0; i < n; i++)
			move();
	}
	
	public void move(int numOfMoves, int numOfBeepers){
		for(int i = 0; i < numOfMoves; i++){ //moves a certain number of times
			for(int j = 0; j < numOfBeepers; j++){ //puts certain number of beepers
				World.setDelay(0);
				putBeeper();
				World.setDelay(5);
			}
			move();
		}
	}
	
	/* 											//	old method w/o parameters for sizing and num of beepers.
	public void walkSquareOfLength_6(){
		for(int i = 0; i < 4; i++){
			for(int x = 0; x < 6; x++){
				for(int k = 0; k < 100; k++){
					World.setDelay(0);
					putBeeper();
					World.setDelay(5);
				}
				move(1);
			}
			turnLeft();
		}
	}
	*/
	
	public void walkSquareOfLength(int sideLength, int num){
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < sideLength; j++){
				for(int k = 0; k < num; k++){
					World.setDelay(0);
					putBeeper();
					World.setDelay(5);
				}
				move(1);
			}
			turnLeft();
		}
	}
	
	public static void main(String[] args) {
		World.setVisible(true);
		World.setDelay(5);
		
		LoopyKarel bob = new LoopyKarel(1,1, North, infinity);
		bob.turnRight();
		
		while(true)
		bob.walkSquareOfLength(4, 1000);
	}

}

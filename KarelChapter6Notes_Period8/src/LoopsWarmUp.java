import kareltherobot.*;

public class LoopsWarmUp extends LoopyKarel {

	public LoopsWarmUp(int st, int av, Direction d, int n) {
		super(st, av, d, n);
	}

	/*
	 * public void climb(int n, int b){
	 *	for(int i = 0; i < n; i++){
	 *		turnLeft();
	 *		move();
	 *		turnRight();
	 *		move();
	 *		for(int j = 0; j < b; j++){
	 *			putBeeper();
	 *		}
	 *	}
	 *}
	 *
	 */
	
	
	/*
	* public void move(int n){
	*	for(int i = 0; i < n; i++){
	*		for(int j = 0; j < i; j++){
	*			putBeeper();
	*		}
	*		move();	
	*	}
	*}
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		World.setVisible(true);
		World.setDelay(5);
		World.setSize(5,40);
		LoopsWarmUp bob = new LoopsWarmUp(1, 1, East, infinity);
		bob.move(7000);
	}

}

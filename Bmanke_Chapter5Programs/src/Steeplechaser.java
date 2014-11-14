import kareltherobot.*;

public class Steeplechaser extends Hurdler {
	
	
	public Steeplechaser(int st, int av, Direction d, int num) {
		super(st, av, d, num);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		World.readWorld("jumpingWorld.kwld");
		World.setVisible(true);
		World.setSize(10,10);
		Hurdler bob = new Hurdler(1,1,North,0);
		
		bob.climbWall();

		
	}

}

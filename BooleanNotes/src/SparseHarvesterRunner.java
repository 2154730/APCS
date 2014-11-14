import kareltherobot.*;

public class SparseHarvesterRunner implements Directions {

	public static void main(String[] args) {
		World.setVisible(true);
		World.setDelay(5);
		World.setSize(30,30);
		World.readWorld("randomField.kwld");
		
		SparseHarvester eddie = new SparseHarvester(2,2,East,infinity);
		
		eddie.harvestField();
		}

	}


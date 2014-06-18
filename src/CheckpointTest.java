import edu.umn.crisys.spf.CheckpointControl;


public class CheckpointTest {
	
	private static final int LOOPS = 8;
	private static final int CHECKPOINT_EVERY = 4;

	public static boolean symbBool(boolean b, int i) {
		return b;
	}
	
	public static void main(String[] args) {
		for (int i=0; i < LOOPS; i++) {
			if (symbBool(true, i)) {
				System.out.println("true");
			} else { 
				System.out.println("false");
			}
			if (CHECKPOINT_EVERY != 0 && i % CHECKPOINT_EVERY == 0) {
				CheckpointControl.setCheckpointFromInside();
			}
		}
	}

}

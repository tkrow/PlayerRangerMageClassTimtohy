
public class PlayerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//New Archer object
		Archer myArcher = new Archer(89);
		myArcher.performActions();
		
		//New Mage object
		Mage myMage = new Mage(98);
		myMage.performActions();
		
		// Sets the Archer object's stats
		myArcher.setAimAbility(95);
		myArcher.setDefensePoints(40);
		
		// Sets the Mage object's stats
		myMage.setDefensePoints(25);
		myMage.setHitPoints(85);
		
		// I am only printing out the setter/getter obtained values just to see if I did this right.
		// Sorry if this bothers you
		System.out.println(" myArcher.getAimAbility: " + myArcher.getAimAbility());
		System.out.println(" myMage.getMagicPoints: " + myMage.getMagicPoints());
	}

}

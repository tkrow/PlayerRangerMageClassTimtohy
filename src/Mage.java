
public class Mage extends Player {
	private int magicPoints;

	// Constructor for Mage
	public Mage(int MagicPoints) {
		setMagicPoints(MagicPoints);
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Mage is attacking...");
	}

	public void castSpell() {
		System.out.println("Casting a spell...");
	}

	@Override
	public void performActions() {
		// TODO Auto-generated method stub
		attack();
		castSpell();
	}

	public int getMagicPoints() {
		if (magicPoints > 0 && magicPoints <=100)
		{
			return magicPoints;
		}
		else
		{
			// This only exists since nothing is able to be output otherwise
			return magicPoints;
		}
	}

	public void setMagicPoints(int magicPoints) {
		this.magicPoints = magicPoints;
	}
}


public class Archer extends Player {
	private int aimAbility;

	public Archer(int AimAbility) {
		setAimAbility(AimAbility);
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Archer is attacking...");
	}
	
	public void Aim() {
		System.out.println("Focusing...");
	}

	@Override
	public void performActions() {
		// TODO Auto-generated method stub
		attack();
		Aim();
	}

	public int getAimAbility() {
		if (aimAbility > 0 && aimAbility <= 100) {
			return aimAbility;
		}
		else {
			return aimAbility;
		}
	}

	public void setAimAbility(int aimAbility) {
		this.aimAbility = aimAbility;
	}
	
}

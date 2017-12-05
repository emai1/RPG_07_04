public class Monster extends Character{

	public Monster() {
		health = 150;
		strength = (int) (45 * Math.random()) + 20;
		defense = 40;
		attack = 1.0;
	}
	
	public String toString() {
		return "Monster status " + System.lineSeparator() 
				+ "Health: " + health + System.lineSeparator()
				+ "Strength: " + strength + System.lineSeparator()
				+ "Defense: " + defense + System.lineSeparator()
				+ "Attack: " + attack + System.lineSeparator();
	}
}

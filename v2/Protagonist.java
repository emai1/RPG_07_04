public class Protagonist extends Character {
	
	private static final double[] DEFAULT_STATS = { 125, 100, 40, 0.4 };
	
	private String name;

	public Protagonist(String nameInput) {
		name = nameInput;
		health = (int) DEFAULT_STATS[0];
		strength = (int) DEFAULT_STATS[1];
		defense = (int) DEFAULT_STATS[2];
		attack = DEFAULT_STATS[3];
	}	

	public String getName() {
		return name;
	}
	
	public void specialize() {
		strength = (int) DEFAULT_STATS[1] + 10;
		defense = (int) DEFAULT_STATS[2] -10;
	}
	
	public void normalize() {
		strength = (int) DEFAULT_STATS[1];
		defense = (int) DEFAULT_STATS[2];
	}
	
	public String toString() {
		// reconsider what fields need to be printed
		return "Protag" + System.lineSeparator()
			 + "Name: " + name + System.lineSeparator()
			 + "Health: " + health + System.lineSeparator()
			 + "Strength: " + strength + System.lineSeparator()
			 + "Defense: " + defense + System.lineSeparator()
			 + "Attack: " + attack + System.lineSeparator();
	}
}

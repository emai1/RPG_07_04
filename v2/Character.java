public class Character {
	
	protected int health;
	protected int strength;
	protected int defense;
	protected double attack;
	
	public int getDefense() {
		return defense;
	}
	
	public boolean isAlive() {
		return health > 0;
	}
	
	public void lowerHP(int damage) {
		if (damage > health)
			health = 0;
		else
			health -= damage;
	}
	
	public int attack(Character defender) {
		int damage = (int) (strength * attack) - defender.getDefense();
		// negative damage seems like a bad design...
		if (damage < 0)
			damage = 1;
		defender.lowerHP( damage);
		return damage;
	}
	
}
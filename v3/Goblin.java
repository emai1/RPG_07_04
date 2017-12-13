public class Goblin extends Monster {
	
	public Goblin() {	
		super();
		health -= 20;
		strength = (int) (35 * Math.random()) + 10;
	}
		
	public String toString() {
		return "Goblin / " + super.toString();
	}
}
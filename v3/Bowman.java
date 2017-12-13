public class Bowman extends Protagonist {
	
	public Bowman(String name) {
		super(name);
		health -= 10;
		strength += 10;
		defense -= 5;
		attack += 0.25;
	}
	
	public String toString() {
		return "Class: Bowman" 
			 + System.lineSeparator()
			 + super.toString();
	}
}
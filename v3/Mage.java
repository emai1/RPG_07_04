public class Mage extends Protagonist {

    public Mage(String newName) {
        super(newName);
        health += 10;
        attack += 1.5;
    }

    public String toString() {
        return "Class: Mage"
			 + System.lineSeparator()
			 + super.toString();
    } 
}
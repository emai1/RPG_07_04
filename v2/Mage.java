public class Mage extends Protagonist {

    public Mage(String newName) {
        super(name);
        health += 10
        attack += 1.5
    }

    public String  toString() {
        super.toString()
        + System.lineSeparator() "This protagonist is a mage.";
    } 
}
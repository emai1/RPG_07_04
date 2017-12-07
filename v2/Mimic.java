public class Mimic extends Monster{
    
    public Mimic() {
        super();
        health -= 50;
        strength += 10;
        defense += 20;
        attack += 0.5;
    }

    public String toString() {
        return "Mimic / "
			 + super.toString();
    } 
}

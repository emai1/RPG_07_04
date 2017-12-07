public class Zombie extends Monster{
    
    public Zombie() {
        super();
        defense += 20;
        health += 5;
    }

    public String toString() {
        return "Zombie / "
			 + super.toString();
    } 
}
public class UserOfRPGv2 {
	public static void main(String[] args) {
		// Character[] agents = { new Protagonist("newProtag"), 
							   // new Mage("newMage"), 
							   // new Bowman("newBowman"),
							   // new Berserker("newBerserker"),
							   // new Monster(),
							   // new Zombie(),
							   // new Goblin(),
							   // new Mimic(),
							// };
							   
		// Compilation error; incompatible types, the Protag types can't be converted.
		Monster[] agents = { //new Protagonist("newProtag"), 
							  // new Mage("newMage"), 
							   //new Bowman("newBowman"),
							  // new Berserker("newBerserker"),
							   new Monster(),
							   new Zombie(),
							   new Goblin(),
							   new Mimic(),
							};
							
		// Actual error: UserOfRPGv2.java:14: error: incompatible types: Protagonist cannot be converted to Monster
        //  Monster[] agents = { new Protagonist("newProtag"),

		
		// for ( Character agent : agents ) 
			 // System.out.println( agent);
		 
		// Compilation error; Can't find method getName
		for (Monster agent : agents)
			System.out.println( agent.getName());
		
		//Actual error: UserOfRPGv2.java:30: error: cannot find symbol
                        // System.out.println( agent.getName());

		
	}
		
}
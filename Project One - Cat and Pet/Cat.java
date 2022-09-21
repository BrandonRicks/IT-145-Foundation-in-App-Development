public class Cat extends Pet {	// Subclass of Pet
	
	private static int catSpaceNbr; // Attribute
	
	public Cat() {	// Default constructor
		super();
		catSpaceNbr = -1;
	}

	public Cat(String type, String name, int age, boolean dog, boolean cat, int stay, double amount, int space) {	// Constructor
		super(type,name,age,dog,cat,stay,amount);
		catSpaceNbr = space;
	}

	public static void setCatSpaceNbr(int space) {   // Setter
		catSpaceNbr = space;
	}

	public static int getCatSpaceNbr() {	// Getter
		return catSpaceNbr;
	}
}
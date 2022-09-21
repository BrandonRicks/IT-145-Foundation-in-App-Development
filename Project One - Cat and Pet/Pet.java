public class Pet {

	private static String petType;   // Private variables for Pet class
	private static String petName;
	private static int petAge;
	private static boolean dogSpace;
	private static boolean catSpace;
	private static int daysStay;
	private static double amountDue;
	
	public Pet() {	 // Default constructor
		petAge = 0;
		petName = "";
		petType = "";
		dogSpace = false;
		catSpace = false;
		amountDue = 0;
		daysStay = 0;
	}

	public Pet(String type, String name, int age, boolean dog, boolean cat, int stay, double amount) {   // Constructor to initialize variables
		petType = type;
		petName = name;
		petAge = age;
		dogSpace = dog;
		catSpace = cat;
		daysStay = stay;
		amountDue = amount;
	}	
	
	public static void setPetType(String type) {	// Setters for Pet class attributes
		petType = type;
	}
	public static void setPetName(String name) {
		petName = name;
	}
	public static void setPetAge(int age) {
		petAge = age;
	}
	public static void setDogSpace(boolean dog) {
		dogSpace = dog;
	}
	public static void setCatSpace(boolean cat) {
		catSpace = cat;
	}
	public static void setDaysStay(int stay) {
		daysStay = stay;
	}
	public static void setAmountDue(double amount) {
		amountDue = amount;
	}
	
	public static String getPetType() {	// Getters for Pet class Attributes
		return petType;
	}
	public static String getPetName() {
		return petName;
	}
	public static int getPetAge() {
		return petAge;
	}
	public static boolean getDogSpace() {
		return dogSpace;
	}
	public static boolean getCatSpace() {
		return catSpace;
	}
	public static int daysStay() {
		return daysStay;
	}
	public static double getAmountDue() {
		return amountDue;
	}
	
	public static void checkIn() {   // UML diagram methods
		
	}
	public static void checkOut() {
		
	}
	public static void getPet() {
		
	}
	public static void createPet() {
		
	}
	public static void updatePet() {
		
	}
}

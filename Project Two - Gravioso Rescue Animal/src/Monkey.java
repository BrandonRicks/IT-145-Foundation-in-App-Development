// SNHU IT-145 Project Two
// Modifications: B. Ricks
// 11/2019

public class Monkey extends RescueAnimal {

    // Instance variables
    public int bodyLength;
    public int tailLength;
    public int height;
    public String species;
    public int torsoMeasurements;
    public int skillMeasurements;
    public int neckMeasurements;

    // Constructor
    public Monkey() {
    }

    // Accessor (getters) Methods
	public int getBodyLength() {
		return bodyLength;
	}

	public int getTailLength() {
		return tailLength;
	}

	public int getHeight() {
		return height;
	}

	public String getSpecies() {
		return species;
	}

	public int getTorsoMeasurements() {
		return torsoMeasurements;
	}

	public int getSkillMeasurements() {
		return skillMeasurements;
	}

	public int getNeckMeasurements() {
		return neckMeasurements;
	}

    // Mutator (setters) Methods
	public void setBodyLength(int bodyLength) {
		this.bodyLength = bodyLength;
	}

	public void setTailLength(int tailLength) {
		this.tailLength = tailLength;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public void setTorsoMeasurements(int torsoMeasurements) {
		this.torsoMeasurements = torsoMeasurements;
	}

	public void setSkillMeasurements(int skillMeasurements) {
		this.skillMeasurements = skillMeasurements;
	}

	public void setNeckMeasurements(int neckMeasurements) {
		this.neckMeasurements = neckMeasurements;
	}

}
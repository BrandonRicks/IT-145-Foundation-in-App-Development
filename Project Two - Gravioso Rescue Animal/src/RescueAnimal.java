// SNHU IT-145 Project Two
// Modifications: B. Ricks
// 11/2019

import java.text.SimpleDateFormat;

public class RescueAnimal {

    // Instance variables
    private String name;
    private String type;
    private String gender;
    private int age;
    private float weight;
    private SimpleDateFormat acquisitionDate;
    private SimpleDateFormat statusDate;
    private String acquisitionSource;
    private Boolean reserved;

    private String trainingLocation;
    private SimpleDateFormat trainingStart;
    private SimpleDateFormat trainingEnd;
    private String trainingStatus;

    private String inServiceCountry;
    private String inServiceCity;
    private String inServiceAgency;
    private String inServicePOC;
    private String inServiceEmail;
    private String inServicePhone;
    private String inServicePostalAddress;

    // Constructor
    public RescueAnimal() {
    }

    // Accessor (getters) methods
	private String getName() {
		return name;
	}

	private String getType() {
		return type;
	}

	private String getGender() {
		return gender;
	}

	private int getAge() {
		return age;
	}

	private float getWeight() {
		return weight;
	}

	private SimpleDateFormat getAcquisitionDate() {
		return acquisitionDate;
	}

	private SimpleDateFormat getStatusDate() {
		return statusDate;
	}

	private String getAcquisitionSource() {
		return acquisitionSource;
	}

	private Boolean getReserved() {
		return reserved;
	}

	private String getTrainingLocation() {
		return trainingLocation;
	}

	private SimpleDateFormat getTrainingStart() {
		return trainingStart;
	}

	private SimpleDateFormat getTrainingEnd() {
		return trainingEnd;
	}

	private String getTrainingStatus() {
		return trainingStatus;
	}

	private String getInServiceCountry() {
		return inServiceCountry;
	}

	private String getInServiceCity() {
		return inServiceCity;
	}

	private String getInServiceAgency() {
		return inServiceAgency;
	}

	private String getInServicePOC() {
		return inServicePOC;
	}

	private String getInServiceEmail() {
		return inServiceEmail;
	}

	private String getInServicePhone() {
		return inServicePhone;
	}

	private String getInServicePostalAddress() {
		return inServicePostalAddress;
	}
	
	// Mutator (setters) methods
	private void setName(String name) {
		this.name = name;
	}

	private void setType(String type) {
		this.type = type;
	}

	private void setGender(String gender) {
		this.gender = gender;
	}

	private void setAge(int age) {
		this.age = age;
	}

	private void setWeight(float weight) {
		this.weight = weight;
	}

	private void setAcquisitionDate(SimpleDateFormat acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	private void setStatusDate(SimpleDateFormat statusDate) {
		this.statusDate = statusDate;
	}

	private void setAcquisitionSource(String acquisitionSource) {
		this.acquisitionSource = acquisitionSource;
	}

	private void setReserved(Boolean reserved) {
		this.reserved = reserved;
	}

	private void setTrainingLocation(String trainingLocation) {
		this.trainingLocation = trainingLocation;
	}

	private void setTrainingStart(SimpleDateFormat trainingStart) {
		this.trainingStart = trainingStart;
	}

	private void setTrainingEnd(SimpleDateFormat trainingEnd) {
		this.trainingEnd = trainingEnd;
	}

	private void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}

	private void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}

	private void setInServiceCity(String inServiceCity) {
		this.inServiceCity = inServiceCity;
	}

	private void setInServiceAgency(String inServiceAgency) {
		this.inServiceAgency = inServiceAgency;
	}

	private void setInServicePOC(String inServicePOC) {
		this.inServicePOC = inServicePOC;
	}

	private void setInServiceEmail(String inServiceEmail) {
		this.inServiceEmail = inServiceEmail;
	}

	private void setInServicePhone(String inServicePhone) {
		this.inServicePhone = inServicePhone;
	}

	private void setInServicePostalAddress(String inServicePostalAddress) {
		this.inServicePostalAddress = inServicePostalAddress;
	}
	
    // Placeholder method (spec document test)
	public void newMonkeyIntake(String aname, String atype, String agender, int aage, int aweight) {
		System.out.println("Test from inside method I chose");
	}
	
}
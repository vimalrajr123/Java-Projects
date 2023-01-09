package AdditionalClasses;

public class AnimalParent {

	private float height;
	private float weight;
	private String animalType;
	private String bloodType;

	public AnimalParent() {
		this.height = 1.0f;
		this.weight = 1.0f;
		this.animalType = "unknown";
		this.bloodType = "Unknown";
	}

	public AnimalParent(float height, float weight, String animalType, String bloodType) {
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public String getAnimalType() {
		return animalType;
	}

	public String getBloodType() {
		return bloodType;
	}
	
	

}

package AdditionalClasses;

public class CrocodileChild extends ReptileChild {

	public CrocodileChild() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CrocodileChild(float height, float weight, String eggType) {

		super(height, weight, eggType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CrocodileChild [getSkinType()=" + getSkinType() + ", getStructure()=" + getStructure()
				+ ", getEggType()=" + getEggType() + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight()
				+ ", getAnimalType()=" + getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}
	
	



}

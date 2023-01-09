package AdditionalClasses;

public class ReptileChild extends AnimalParent {

	private String skinType;
	private String structure;
	private String eggType;

	public ReptileChild() {
		super();
		this.skinType = "Dry Skin";
		this.structure = "Backbone";
		this.eggType = "Soft Shelled";
	}

	public ReptileChild(float height, float weight, String eggType) {
		super(height, weight, "reptile", "Warmblood");
		this.skinType = "Dry Skin";
		this.structure = "Backbone";
		this.eggType = eggType;
	}

	public String getSkinType() {
		return skinType;
	}

	public String getStructure() {
		return structure;
	}

	public String getEggType() {
		return eggType;
	}
	

}



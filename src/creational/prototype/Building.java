package creational.prototype;

public class Building extends Graphics{
	
	private BuildingType buildingType;
	
	public Building(int height, BuildingType buildingType) {
		super(height);
		this.buildingType = buildingType;
	}

	public BuildingType getBuildingType() {
		return buildingType;
	}

	public void setBuildingType(BuildingType buildingType) {
		this.buildingType = buildingType;
	}

	@Override
	public Building clone() {
		String buildingType = this.getBuildingType().getType();
		return new Building(this.getHeight(), new BuildingType(buildingType));
//		return new Building(this.getHeight(), this.getBuildingType());
	}

	@Override
	public String toString() {
		return "Building [height=" + super.getHeight() + ", buildingType=" + buildingType.getType() + "] \n";
	}
	

}

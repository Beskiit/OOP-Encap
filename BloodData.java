package package1;

class BloodData {
	private String bloodType;
	private String rhFactor;
	
	public BloodData() {
		this.bloodType = "O";
		this.rhFactor = "+";
	}
	
	public void setBloodType(String bt) {
		this.bloodType = bt;
	}
	
	public void setRhFactor(String rh) {
		this.rhFactor = rh;
	}
	
	public String getBloodType() {
		return bloodType;
	}
	
	public String getRhFactor() {
		return rhFactor;
	}
}
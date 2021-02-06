package oops.composition;

public class Battery {
	private int capacity;
	private int howManyHourstoCharge;
	private int howManyHoursToDead;
	private String brandName;
	
	public Battery(int capacity, int howManyHourstoCharge, int howManyHoursToDead, String brandName) {
		super();
		this.capacity = capacity;
		this.howManyHourstoCharge = howManyHourstoCharge;
		this.howManyHoursToDead = howManyHoursToDead;
		this.brandName = brandName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getHowManyHourstoCharge() {
		return howManyHourstoCharge;
	}

	public void setHowManyHourstoCharge(int howManyHourstoCharge) {
		this.howManyHourstoCharge = howManyHourstoCharge;
	}

	public int getHowManyHoursToDead() {
		return howManyHoursToDead;
	}

	public void setHowManyHoursToDead(int howManyHoursToDead) {
		this.howManyHoursToDead = howManyHoursToDead;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}

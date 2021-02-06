package oops.composition;

public class Processor {
	private String brandName;
	private double capacity;
	
	public Processor(String brandName, double capacity) {
		super();
		this.brandName = brandName;
		this.capacity = capacity;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

}

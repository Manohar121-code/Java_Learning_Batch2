package oops.composition;

public class Mobile {
	private String brandName;
	private String modelName;
	private String IMEINumber;
	private Battery battery;
	private Processor processor;
	
	public Mobile(String brandName, String modelName, String iMEINumber, Battery battery, Processor processor) {
		super();
		this.brandName = brandName;
		this.modelName = modelName;
		this.IMEINumber = iMEINumber;
		this.battery = battery;
		this.processor = processor;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getIMEINumber() {
		return IMEINumber;
	}

	public void setIMEINumber(String iMEINumber) {
		IMEINumber = iMEINumber;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

}

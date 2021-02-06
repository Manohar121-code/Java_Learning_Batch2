package oops.composition;

public class CompositionEx {
	public static void main(String[] args) {
		
		Battery appleBattery = new Battery(5, 1, 15, "Apple Battery");
		
		Processor appleProcessor = new Processor("Apple Processor", 2.3);
		
		Mobile iPhone = new Mobile("Apple", "12 pro", "SKJDH83UE", appleBattery, appleProcessor);
		
		String brandName = iPhone.getBrandName();
		String modelName = iPhone.getModelName();
		String imeiNumber = iPhone.getIMEINumber();
		Battery battery = iPhone.getBattery();
		Processor processor = iPhone.getProcessor();
		
		System.out.println("Brand name - "+ brandName);
		System.out.println("Model name - "+modelName);
		System.out.println("IMEI number - "+ imeiNumber);

		String brandName2 = battery.getBrandName();
		int capacity = battery.getCapacity();
		int howManyHourstoCharge = battery.getHowManyHourstoCharge();
		int howManyHoursToDead = battery.getHowManyHoursToDead();
		
		System.out.println("*************Apple battery properties************");
		
		System.out.println("Brand name - "+ brandName2);
		System.out.println("Capacity - "+ capacity);
		System.out.println("howManyHourstoCharge - "+ howManyHourstoCharge);
		System.out.println("howManyHoursToDead - "+ howManyHoursToDead);
		
		System.out.println("*************Apple processor properties************");
		
		System.out.println("Brand name - "+ processor.getBrandName());
		System.out.println("Capacity - "+ processor.getCapacity());
	}
}

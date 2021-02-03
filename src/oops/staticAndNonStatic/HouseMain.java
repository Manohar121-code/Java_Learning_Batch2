package oops.staticAndNonStatic;

public class HouseMain {
	public static void main(String[] args) {
		
		House btmHouse = new House();
		btmHouse.numOfRooms = 2;
		btmHouse.isParkingAvailable = true;
		btmHouse.isDuplexHouse = false;
		btmHouse.numOfFloors = 3;
		btmHouse.address = "BTM Bangalore";
		
//		btmHouse.isWaterTankAvailable = false;
		
		House HsrHouse = new House();
		HsrHouse.numOfRooms = 3;
		HsrHouse.isParkingAvailable = true;
		HsrHouse.isDuplexHouse = true;
		HsrHouse.numOfFloors = 2;
		HsrHouse.address = "HSR Bangalore";
		
		System.out.println("**********BTM House details -");
		System.out.println("num of rooms - "+btmHouse.numOfRooms);
		System.out.println("Parking? - "+btmHouse.isParkingAvailable);
		System.out.println("Duplex? - "+btmHouse.isDuplexHouse);
		System.out.println("Num of floors - "+btmHouse.numOfFloors);
		System.out.println("Address - "+btmHouse.address);
		System.out.println("Water tank? - "+btmHouse.isWaterTankAvailable);
		
		System.out.println("**********HSR House details -");
		System.out.println("num of rooms - "+HsrHouse.numOfRooms);
		System.out.println("Parking? - "+HsrHouse.isParkingAvailable);
		System.out.println("Duplex? - "+HsrHouse.isDuplexHouse);
		System.out.println("Num of floors - "+HsrHouse.numOfFloors);
		System.out.println("Address - "+HsrHouse.address);
		System.out.println("Water tank? - "+HsrHouse.isWaterTankAvailable);
		System.out.println("---------------------");
		
		HsrHouse.nonStaticMethod();
		HsrHouse.staticMethod();
		
		boolean isWaterTankAvailable = House.isWaterTankAvailable;
		System.out.println(isWaterTankAvailable);
		House.staticMethod();
		
		
	}
}

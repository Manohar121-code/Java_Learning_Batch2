package oops.staticAndNonStatic;

public class House {
int numOfRooms;
boolean isParkingAvailable;
boolean isDuplexHouse;
int numOfFloors;
String address;

static boolean isWaterTankAvailable = true;

public void nonStaticMethod() {
	staticMethod();
	anotherStatic();
	nonStaticMethod();
	isWaterTankAvailable = true;
	numOfRooms = 2;
	System.out.println("non static method called by object");
}

public void anotherNonStatic() {
	System.out.println("another nonStatic() called");
}

public static void staticMethod() {
	anotherStatic();
	isWaterTankAvailable = false;
	System.out.println("static method called");
}

public static int anotherStatic() {
	System.out.println("anotherStatic() called");
	return 11;
}

}

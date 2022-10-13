package Entities;

public class CommonVehicle {
	public String brand;
	public String model;
	public int km;
	public String gears;
	public int age;
	public int changePart;
	public String damageRecord;
	public String vehicleType;
	public String year;
	public float price;

	public CommonVehicle(String brand, String model, int km, String gears, String year, int age, int changePart,
			String damageRecord,float price, String vehicleType) {
		this.brand = brand;
		this.model = model;
		this.km = km;
		this.gears = gears;
		this.age = age;
		this.changePart = changePart;
		this.damageRecord = damageRecord;
		this.vehicleType = vehicleType;
		this.price = price;
		this.year = year;
	}

	public CommonVehicle() {

	}

}

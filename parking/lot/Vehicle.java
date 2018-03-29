package parking.lot;

import parking.lot.ParkingLotUtil.Vehicle_Type;

public abstract class Vehicle {

	private int registrationNumber;
	private Vehicle_Type vehicleType;
	private int vehicleLevel;
	
	public int getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public Vehicle_Type getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(Vehicle_Type vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getVehicleLevel() {
		return vehicleLevel;
	}
	public void setVehicleLevel(int vehicleLevel) {
		this.vehicleLevel = vehicleLevel;
	}
	@Override
	public String toString() {
		return "Vehicle [registrationNumber=" + registrationNumber + ", vehicleType=" + vehicleType + ", vehicleLevel="
				+ vehicleLevel + "]";
	}
	
}

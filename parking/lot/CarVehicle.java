package parking.lot;

import parking.lot.ParkingLotUtil.Vehicle_Type;

public class CarVehicle extends Vehicle{
	
	public CarVehicle(int registrationNumber, Vehicle_Type vehicleType, int vehicleLevel){
		
		setRegistrationNumber(registrationNumber);
		setVehicleType(Vehicle_Type.CAR);
		setVehicleLevel(Vehicle_Type.TRUCK.getCode());
		
	}
}

package parking.lot;

import parking.lot.ParkingLotUtil.Vehicle_Type;

public class BikeVehicle extends Vehicle{
	
	public BikeVehicle(int registrationNumber, Vehicle_Type vehicleType, int vehicleLevel){
		
		setRegistrationNumber(registrationNumber);
		setVehicleLevel(Vehicle_Type.BIKE.getCode());
		setVehicleType(Vehicle_Type.BIKE);
	
	}
}

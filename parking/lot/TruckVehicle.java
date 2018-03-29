package parking.lot;

import parking.lot.ParkingLotUtil.Vehicle_Type;

public class TruckVehicle extends Vehicle{
	
	public TruckVehicle(int registrationNumber, Vehicle_Type vehicleType, int vehicleLevel){
		
		setRegistrationNumber(registrationNumber);
		setVehicleType(Vehicle_Type.TRUCK);
		setVehicleLevel(Vehicle_Type.TRUCK.getCode());
	
	}
}

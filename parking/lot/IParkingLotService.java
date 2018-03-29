package parking.lot;

import parking.lot.ParkingLotUtil.Parking_Lot_Type;

public interface IParkingLotService {
	
	public boolean isParkingLotAvailable(Vehicle vehicle);
	
	public int parkVehicle(Vehicle vehicle, ParkingLot parkingLot);
	
	public int exitParking(Vehicle vehicle); // returns parking lot Number
	
	public boolean addParkingLot(Parking_Lot_Type parking_Lot_Type);
	
	public ParkingLot findAvailableParkingLot(Vehicle vehicle);
}

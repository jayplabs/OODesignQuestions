package parking.lot;

import parking.lot.ParkingLotUtil.Parking_Lot_Type;
import parking.lot.ParkingLotUtil.Vehicle_Type;
import static parking.lot.ParkingLotUtil.maxVehicleLevel;
import static parking.lot.ParkingLotUtil.parkingLotMap;
import static parking.lot.ParkingLotUtil.parkedVehicleMap;
import static parking.lot.ParkingLotUtil.bikeParkingLotSet;
import static parking.lot.ParkingLotUtil.carParkingLotSet;
import static parking.lot.ParkingLotUtil.truckParkingLotSet;

import java.util.Iterator;
import java.util.Set;

public class ParkingLotService implements IParkingLotService{

	
	public boolean isParkingLotAvailable(Vehicle vehicle) {
		System.out.println("isParkingLotAvailable for Vehicle:"+vehicle);
		Vehicle_Type vehicle_Type = vehicle.getVehicleType();
		
		for (int i = vehicle_Type.getCode(); i <= maxVehicleLevel; i++) {
			Set<ParkingLot> parkingLots = parkingLotMap.get(i);
			if(!parkingLots.isEmpty()){
				System.out.println("isParkingLotAvailable for Vehicle type:"+vehicle.getVehicleType()+ ":true");
				return true;
			}
		}
		System.out.println("isParkingLotAvailable for Vehicle type:"+vehicle.getVehicleType()+ ":false");
		return false;
	}

	@Override
	public int parkVehicle(Vehicle vehicle, ParkingLot parkingLot) {
		
		System.out.println("parkVehicle:Vehicle:"+ vehicle+ " :ParkingLot:"+ parkingLot);
		parkedVehicleMap.put(vehicle, parkingLot);
		removeParkingLotFromAvialbleLots(parkingLot);
		System.out.println("--------------------------");
		return parkingLot.getParkingLotNumber();
	}

	@Override
	public int exitParking(Vehicle vehicle) {
		
		System.out.println("exitParking:Vehicle:"+vehicle);
		ParkingLot parkingLot = parkedVehicleMap.get(vehicle);
		parkedVehicleMap.remove(vehicle);
		addLotToAvailableParkingLots(parkingLot);
		return 0;
	}

	@Override
	public boolean addParkingLot(Parking_Lot_Type parking_Lot_Type) {
		// TODO Auto-generated method stub
		return false;
	}

	private void removeParkingLotFromAvialbleLots(ParkingLot parkingLot){
		
		Parking_Lot_Type type = parkingLot.getParkingLotType();
		
		switch(type){
			
			case BIKE_PARKING_LOT :
				bikeParkingLotSet.remove(parkingLot);
				System.out.println("removed from  bikeParkingLotSet:"+parkingLot);
				break;
			case CAR_PARKING_LOT :
				carParkingLotSet.remove(parkingLot);
				System.out.println("removed from  carParkingLotSet:"+parkingLot);
				break;
			case TRUCK_PARKING_LOT :
				truckParkingLotSet.remove(parkingLot);
				System.out.println("removed from  truckParkingLotSet:"+parkingLot);
				break;
			default : break;	
		}
	}

	public ParkingLot findAvailableParkingLot(Vehicle vehicle) {
		
		System.out.println("findAvailableParkingLot for Vehicle:"+vehicle);
		Vehicle_Type vehicle_Type = vehicle.getVehicleType();
		ParkingLot lot = null;
		for (int i = vehicle_Type.getCode(); i <= maxVehicleLevel; i++) {
			Set<ParkingLot> parkingLots = parkingLotMap.get(i);
			System.out.println("parkingLots:"+parkingLots);
			if(!parkingLots.isEmpty()){
				System.out.println("findAvailableParkingLot for Vehicle type:"+vehicle.getVehicleType()+ ":true");
				Iterator<ParkingLot> itr = parkingLots.iterator();
				if(itr.hasNext()){
					lot= itr.next();
					System.out.println("findAvailableParkingLot for Vehicle type:"+vehicle.getVehicleType()+ ":avilable :lot:"+lot);
					return lot;
				}
				
			}
		}
		return lot;
	}
	
	private void addLotToAvailableParkingLots(ParkingLot parkingLot){
		System.out.println("addLotToAvailableParkingLots:ParkingLot:"+parkingLot);
		
		Parking_Lot_Type type = parkingLot.getParkingLotType();
		
		switch(type){
		
			case BIKE_PARKING_LOT :
				bikeParkingLotSet.add(parkingLot);
				System.out.println("added to  bikeParkingLotSet:"+parkingLot);
				System.out.println("bikeParkingLotSet:"+bikeParkingLotSet);
				break;
			case CAR_PARKING_LOT :
				carParkingLotSet.add(parkingLot);
				System.out.println("added to  carParkingLotSet:"+parkingLot);
				break;
			case TRUCK_PARKING_LOT :
				truckParkingLotSet.add(parkingLot);
				System.out.println("added to  truckParkingLotSet:"+parkingLot);
				break;
			default : break;	
		}
	
	}
	
}

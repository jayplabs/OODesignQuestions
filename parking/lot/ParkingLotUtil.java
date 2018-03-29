package parking.lot;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ParkingLotUtil {
	
	public static enum Vehicle_Type{
		BIKE(1),
		CAR(2),
		TRUCK(3);
		
		int code;
		
		Vehicle_Type(int code) {
			this.code = code;
		}
		
		int getCode(){
			return code;
		}
	}
	
	public static enum Parking_Lot_Type{
		BIKE_PARKING_LOT(1),
		CAR_PARKING_LOT(2),
		TRUCK_PARKING_LOT(3);
		
		int code;
		
		Parking_Lot_Type(int code) {
			this.code = code;
		}
		
		int getCode(){
			return code;
		}
	}
	
	static int maxVehicleLevel = 3;
	
	static Map<Vehicle, ParkingLot> parkedVehicleMap = new HashMap<Vehicle, ParkingLot>();
	
	static Set<ParkingLot> bikeParkingLotSet = new HashSet<>();
	
	static Set<ParkingLot> carParkingLotSet = new HashSet<>();
	
	static Set<ParkingLot> truckParkingLotSet = new HashSet<>();
	
	static Map<Integer , Set<ParkingLot>> parkingLotMap = new HashMap<>();
			
	
	static void loadBikeParkingLot(){
		
		parkingLotMap.put(1, bikeParkingLotSet);
		for (int i = 1; i <= 3; i++) {
			
			ParkingLot parkingLot = new ParkingLot(Parking_Lot_Type.BIKE_PARKING_LOT,i);
			bikeParkingLotSet.add(parkingLot);
		}
	}
	
	static void loadCarParkingLot(){
		parkingLotMap.put(2, carParkingLotSet);
		for (int i = 4; i <= 6; i++) {
			
			ParkingLot parkingLot = new ParkingLot(Parking_Lot_Type.CAR_PARKING_LOT,i);
			carParkingLotSet.add(parkingLot);
		}
	}

	static void loadTruckParkingLot(){
		parkingLotMap.put(3, truckParkingLotSet);
		for (int i =7; i <= 9; i++) {
		
			ParkingLot parkingLot = new ParkingLot(Parking_Lot_Type.TRUCK_PARKING_LOT,i);
			truckParkingLotSet.add(parkingLot);
		}
	}
	
	static void loadParkingLots(){
		
		loadBikeParkingLot();
		loadCarParkingLot();
		loadTruckParkingLot();
	}
	
	
}

package parking.lot;

import parking.lot.ParkingLotUtil.Vehicle_Type;

public class ParkingLotTestClient {
	
	public static void main(String[] args) {
		
		/*System.out.println(ParkingLotUtil.parkingLotMap);
		System.out.println(ParkingLotUtil.bikeParkingLotSet);
		System.out.println(ParkingLotUtil.carParkingLotSet);
		*/
		
		ParkingLotUtil.loadParkingLots();
		ParkingLotService parkingLotService = new ParkingLotService();
		
		Vehicle vehicle = new BikeVehicle(101, Vehicle_Type.BIKE, Vehicle_Type.BIKE.getCode());
		if(parkingLotService.isParkingLotAvailable(vehicle))
			parkingLotService.parkVehicle(vehicle, parkingLotService.findAvailableParkingLot(vehicle));
		
		Vehicle vehicle1 = new BikeVehicle(102, Vehicle_Type.BIKE, Vehicle_Type.BIKE.getCode());
		if(parkingLotService.isParkingLotAvailable(vehicle1))
			parkingLotService.parkVehicle(vehicle, parkingLotService.findAvailableParkingLot(vehicle1));
		
		Vehicle vehicle2 = new BikeVehicle(103, Vehicle_Type.BIKE, Vehicle_Type.BIKE.getCode());
		if(parkingLotService.isParkingLotAvailable(vehicle2))
			parkingLotService.parkVehicle(vehicle2, parkingLotService.findAvailableParkingLot(vehicle2));
		
		parkingLotService.exitParking(vehicle2);
		
		Vehicle vehicle3 = new BikeVehicle(104, Vehicle_Type.BIKE, Vehicle_Type.BIKE.getCode());
		if(parkingLotService.isParkingLotAvailable(vehicle3))
			parkingLotService.parkVehicle(vehicle3, parkingLotService.findAvailableParkingLot(vehicle3));
		
		
		Vehicle vehicle4 = new TruckVehicle(301, Vehicle_Type.TRUCK, Vehicle_Type.TRUCK.getCode());
		if(parkingLotService.isParkingLotAvailable(vehicle4))
			parkingLotService.parkVehicle(vehicle4, parkingLotService.findAvailableParkingLot(vehicle4));
		
		Vehicle vehicle5 = new TruckVehicle(302, Vehicle_Type.TRUCK, Vehicle_Type.TRUCK.getCode());
		if(parkingLotService.isParkingLotAvailable(vehicle5))
			parkingLotService.parkVehicle(vehicle5, parkingLotService.findAvailableParkingLot(vehicle5));
		
		Vehicle vehicle6 = new TruckVehicle(303, Vehicle_Type.TRUCK, Vehicle_Type.TRUCK.getCode());
		if(parkingLotService.isParkingLotAvailable(vehicle6))
			parkingLotService.parkVehicle(vehicle6, parkingLotService.findAvailableParkingLot(vehicle6));
		
		Vehicle vehicle7 = new TruckVehicle(304, Vehicle_Type.TRUCK, Vehicle_Type.TRUCK.getCode());
		if(parkingLotService.isParkingLotAvailable(vehicle7))
			parkingLotService.parkVehicle(vehicle7, parkingLotService.findAvailableParkingLot(vehicle7));
		
		Vehicle vehicle8 = new CarVehicle(201, Vehicle_Type.CAR, Vehicle_Type.CAR.getCode());
		if(parkingLotService.isParkingLotAvailable(vehicle8))
			parkingLotService.parkVehicle(vehicle8, parkingLotService.findAvailableParkingLot(vehicle8));
	}
}

package parking.lot;

import parking.lot.ParkingLotUtil.Parking_Lot_Type;

public class ParkingLot {
	
	private Parking_Lot_Type parkingLotType;
	
	private int parkingLotNumber;
	
	public ParkingLot() {
		super();
	}

	public ParkingLot(Parking_Lot_Type parkingLotType, int parkingLotNumber) {
		super();
		this.parkingLotType = parkingLotType;
		this.parkingLotNumber = parkingLotNumber;
	}

	public Parking_Lot_Type getParkingLotType() {
		return parkingLotType;
	}

	public void setParkingLotType(Parking_Lot_Type parkingLotType) {
		this.parkingLotType = parkingLotType;
	}

	public int getParkingLotNumber() {
		return parkingLotNumber;
	}

	public void setParkingLotNumber(int parkingLotNumber) {
		this.parkingLotNumber = parkingLotNumber;
	}

	@Override
	public String toString() {
		return "ParkingLot [parkingLotType=" + parkingLotType + ", parkingLotNumber=" + parkingLotNumber + "]";
	}
	
}

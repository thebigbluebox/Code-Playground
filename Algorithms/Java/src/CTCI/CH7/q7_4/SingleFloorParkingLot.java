package CTCI.CH7.q7_4;

import java.util.List;

public class SingleFloorParkingLot extends ParkingLot {
    private int floor;
    public SingleFloorParkingLot(List<ParkingSpace> parkingSpaces, int floor) {
        super(parkingSpaces);
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }
}

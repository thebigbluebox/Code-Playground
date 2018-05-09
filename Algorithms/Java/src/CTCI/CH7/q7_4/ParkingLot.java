package CTCI.CH7.q7_4;

import java.util.List;

/**
 * Parking lot represented by the Object Oriented Concepts
 * What kind of parking spot do we want to have?
 *  - Single, multi floored, sections? Maybe we need an abstract class to describe this
 * What kind of parking structure do we have?
 *  - Handicap, reserved, valet, electric, expectant mothers, regular? Factory method for this?
 * Parking space should be one object representing whether or not if the current
 */
public abstract class ParkingLot {
    private List<ParkingSpace> parkingSpaces;

    public ParkingLot(List<ParkingSpace> parkingSpaces){
        this.parkingSpaces = parkingSpaces;
    }

    public List<ParkingSpace> getParkingSpaces() {
        return parkingSpaces;
    }
}



package CTCI.CH7.q7_4;

public class ParkingSpaceFactory {
    public static ParkingSpace getParkingSpace(ParkingType parkingType){
        if(parkingType == parkingType.RESEREVED){
            return new HandicapSpace();
        }
        switch(parkingType){
            case REGULAR:
                return new RegularSpace();
            case ELECTRIC:
                return new ElectricSpace();
            case RESEREVED:
                return new ReservedSpace();
            case HANDICAP:
                return new HandicapSpace();
            default:
                return new RegularSpace();
        }
    }
}

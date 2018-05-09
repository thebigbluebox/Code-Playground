package CTCI.CH7.q7_4;

public abstract class ParkingSpace {
    private ParkingType parkingType;

    private boolean taken = false;

    public void setParkingType(ParkingType parkingType) {
        this.parkingType = parkingType;
    }

    public boolean isTaken() {
        return taken;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }

    public ParkingSpace(ParkingType parkingType){
        this.parkingType = parkingType;
    }

    public ParkingType getParkingType() {
        return parkingType;
    }
}

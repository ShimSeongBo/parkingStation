package parking.statePattern;

public class ModeSwitch {

    private ParkingSpot parkingSpot = new EmptySpot();

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public void onSwitch() {
        parkingSpot.toggle(this);
    }
}

package parking;

public class FullSpot implements ParkingSpot {

    @Override
    public void spot() {
        System.out.println("자리 있음");
    }

}

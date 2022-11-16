package parking;

public class EmptySpot implements ParkingSpot {

    @Override
    public void spot() {
        System.out.println("자리 없음");
    }
}

package parking.statePattern;

class FullSpot implements ParkingSpot {
    @Override
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("자리 없음.");
        modeSwitch.setParkingSpot(new EmptySpot());
    }
}

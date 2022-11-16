package parking.statePattern;

class EmptySpot implements ParkingSpot {
    @Override
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("자리 있음.");

        modeSwitch.setParkingSpot(new FullSpot());
    }
}

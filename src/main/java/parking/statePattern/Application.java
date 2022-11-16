package parking.statePattern;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        final String THREESPACE = "   ";

        final ModeSwitch modeSwitch1 = new ModeSwitch();
        final ModeSwitch modeSwitch2 = new ModeSwitch();
        final ModeSwitch modeSwitch3 = new ModeSwitch();
        final ModeSwitch modeSwitch4 = new ModeSwitch();

        Map<Integer, ModeSwitch> spot = new HashMap<>();
            spot.put(1, modeSwitch1);
            spot.put(2, modeSwitch2);
            spot.put(3, modeSwitch3);
            spot.put(4, modeSwitch4);



            spot.forEach((k, v) -> {
                        System.out.print(k + THREESPACE);
                        v.onSwitch();
                    }
            );



        //modeSwitch.onSwitch();
        //modeSwitch.onSwitch();
    }
}

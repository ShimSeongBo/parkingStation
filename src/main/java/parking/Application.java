package parking;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        EmptySpot emptySpot = new EmptySpot();
        FullSpot fullSpot = new FullSpot();


        Map<Integer, ParkingSpot> map = new HashMap<>();
            map.put(1, emptySpot);
            map.put(2, emptySpot);
            map.put(3, emptySpot);
            map.put(4, fullSpot);

            map.forEach((k,v) -> {
                System.out.println(k);
                System.out.println(v);
            });

    }
}

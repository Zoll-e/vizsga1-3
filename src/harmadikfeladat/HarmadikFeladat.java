package harmadikfeladat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HarmadikFeladat {

    public void  harmadik() {

        ArrayList<String> nevek = new ArrayList<String>();
        Map<String, Integer> counts = new HashMap<String, Integer>();

        Scanner in = new Scanner(System.in);

        System.out.println("Nevek bekérése a "+"számol"+" szo beirásáig.");

        String felvesz="";
        do {
            felvesz=in.next();



            nevek.add(felvesz);

        }while
        (! ( felvesz.equals("Számol")));
        nevek.remove(nevek.size()-1);
        System.out.println("A felvett nevek és elõfodulásuk");

        in.close();
        for (String str : nevek) {
            if (counts.containsKey(str)) {
                counts.put(str, counts.get(str) + 1);
            } else {
                counts.put(str, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }





    }
}



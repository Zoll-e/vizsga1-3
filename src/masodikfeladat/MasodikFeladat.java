package masodikfeladat;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MasodikFeladat {
    public List generate() {
        List<Character> tipp = new ArrayList<>();
        List<Character> tippek = new ArrayList<>();
        tipp.add('1');
        tipp.add('2');
        tipp.add('x');
        for (int i = 0; i < 14; i++) {
            Collections.shuffle(tipp);
            tippek.add(tipp.get(1));
        }
        return tippek;
    }

    public void feladat(){


     try (FileWriter fileWriter = new FileWriter("src/tippmix.txt")) {

        for (int i = 0; i <52; i++) {
            List seged = generate();
            fileWriter.write(String.valueOf(seged)+"\n");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }



}



}

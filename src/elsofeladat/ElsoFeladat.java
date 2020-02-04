package elsofeladat;

import java.util.ArrayList;
import java.util.List;

public class ElsoFeladat {

    public  void elso () {
       List<Integer> paros = new ArrayList<>();
        int[] evek = new int[2019];

        Integer seged=0;
        int harommaloszhatokosszege = 0;
        int harommaloszthatokdb = 0;

        for (int i = 0; i <2019 ; i++) {
          seged = i;

            if (seged % 2 == 0){
              paros.add(seged);


            }

        }

        for (int i = 0; i <paros.size() ; i++) {
            seged = paros.get(i);
            if (seged % 3 == 0) {
                harommaloszhatokosszege += seged;
                harommaloszthatokdb++;
            }
        }
        System.out.println("Harommal oszthato szamok osszege: " + harommaloszhatokosszege);
        System.out.println("Harommal oszthato szamok: " + harommaloszthatokdb);


    }
}

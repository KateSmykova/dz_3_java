import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class dz3{
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList <>();
        ArrayList <Integer> list2 = new ArrayList <>();

        Random rnd = new Random();

        for (int i=0; i<20; i++){
            list.add(rnd.nextInt(50));
        }

        for (int i=0; i<20; i++){
            list2.add(rnd.nextInt(50));
        }
        
        list.forEach(n->System.out.print(n+" "));
        System.out.println();

        list2.forEach(n->System.out.print(n+" "));
        System.out.println();

        list.retainAll(list2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        list2.sort(new Comparator<Integer>() {
            @Override
            public int compare (Integer t0, Integer t1){
                return t1-t0;
            }
            
        });

        System.out.println(list2);

    }
}
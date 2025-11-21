package interviewed.designpattern;

import java.util.ArrayList;
import java.util.List;

public class Scratch {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(List.of(0,1,1,2,3));

        int i=0;
        for(int loop =0; loop<arrayList.size(); loop++){
            while (arrayList.get(loop).equals(0)){
                loop++;
            }
            arrayList.set(i, arrayList.get(loop));
        }

        System.out.println(arrayList);
    }
}

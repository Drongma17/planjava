package codingcrack.youtube;

import java.util.*;

public class SynchronizedMod {


    public static void main(String[] args) {


        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        Map<Integer, Integer> map = Collections.synchronizedMap(new HashMap<>());

        Set<Integer> set = Collections.synchronizedSet(new HashSet<>());
    }
}

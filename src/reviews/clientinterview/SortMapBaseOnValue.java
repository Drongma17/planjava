package reviews.clientinterview;

import java.util.*;

public class SortMapBaseOnValue {

    public static void main(String[] args) {

        Map<Integer, String> employeeIdAndNameMap= new HashMap<>();

        employeeIdAndNameMap.put(1, "Tashi");
        employeeIdAndNameMap.put(2, "Dolma");
        employeeIdAndNameMap.put(3, "Sonam");
        employeeIdAndNameMap.put(4, "Pasang");
        employeeIdAndNameMap.put(5, "Dhondup");
        employeeIdAndNameMap.put(6, "Migmar");
        employeeIdAndNameMap.put(7, "Dawa");

//        System.out.println("Original Map ::::::: ::");
//        employeeIdAndNameMap.forEach((k, v)-> System.out.println(k+"\t"+v));
//
//        System.out.println("Map Sorted Based on Keys ::::: ");
//        Set<Map.Entry<Integer, String>> entrySet = employeeIdAndNameMap.entrySet();
//
//        List<Map.Entry<Integer, String>> list = new ArrayList<>(entrySet);
//
//        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
//            @Override
//            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });
//
//        list.forEach(s-> System.out.println(s.getKey() +"\t"+ s.getValue()));
//


        Set<Map.Entry<Integer, String>> entries = employeeIdAndNameMap.entrySet();
        List<Map.Entry<Integer, String>> list = new ArrayList<>(entries);

        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        list.forEach(s-> System.out.println(s.getKey() +"\t"+ s.getValue()));

    }
}

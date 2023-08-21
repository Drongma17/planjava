package reviews.clientinterview;


import java.util.*;

public class CountNumberOfWordsInStringMain {
 
    public static void main(String[] args) {
        HashMap<String, List<String>> hmap= new HashMap<String, List<String>>();
        List<String> prod1 = new ArrayList<>();
        prod1.add("123456789102");
        prod1.add("3.0");
        prod1.add("8");
        hmap.put("Blue magazine", prod1);
        List<String> prod2 = new ArrayList<String>();
        prod2.add("123456789102");
        prod2.add("2.0");
        prod2.add("7");
        hmap.put("Pink magazine", prod2);
        List<String> prod3 = new ArrayList<String>();
        prod3.add("123456789102");
        prod3.add("1.0");
        prod3.add("6");
        hmap.put("Black magazine", prod3);
       // I'm trying to sort it low - high (integers) the 2nd list item. so: 6 - 7 - 8

        List<Map.Entry<String,List<String>>> list =
                new LinkedList<Map.Entry<String,List<String>>>(hmap.entrySet());

        Collections.sort( list, new Comparator<Map.Entry<String,List<String>>>() {
            public int compare( Map.Entry<String,List<String>> o1,
                                Map.Entry<String,List<String>> o2) {
                return o1.getValue().get( 2 ).compareTo(  o2.getValue().get(2) );
            }
        });

        Map<String, List<String>> result = new LinkedHashMap<String, List<String>>();
        for ( Map.Entry<String, List<String>> n : list )
            result.put( n.getKey(), n.getValue() );
    }
}
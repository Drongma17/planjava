package codingcrack.java.java23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Practices {


    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            Map<Integer, String> lineMap = new HashMap<>();

            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null){
                lineMap.put(lineNumber, line.trim());
                lineNumber ++;
            }

            for(Map.Entry<Integer, String> entry : lineMap.entrySet()){
                System.out.println(entry.getKey() + "   =  " +entry.getValue());
            }

            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

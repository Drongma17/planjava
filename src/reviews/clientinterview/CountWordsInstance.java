package reviews.clientinterview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class CountWordsInstance {

    public static void main(String[] args) throws Exception{
        Path path = Paths.get(System.getProperty("user.dir")).resolve("articles.txt");

        BufferedReader reader = new BufferedReader(new FileReader(path.toFile()));

        Map<String, Integer> frequence = new HashMap<>();

        String line =reader.readLine();
        while (line !=null){
            System.out.println("Processing line :" + line);
        }
    }
}

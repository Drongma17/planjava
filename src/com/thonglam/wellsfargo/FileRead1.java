package com.thonglam.wellsfargo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead1 {

    public static void main(String[] args) {


        String name ="";
        int age = 0;
        double height =0.0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/com/thonglam/wellsfargo/readmelo.txt"));
            String line = null;

            while ((line = br.readLine()) != null) {
                String temp[] = line.split("\t");
                name = temp[0];
                age = Integer.parseInt(temp[1]);
                height = Double.parseDouble(temp[2]);
                System.out.println(name+ "\t"+ age + "\t"+ height);
            }

            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

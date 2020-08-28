package com.company;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        BufferedReader sorolvaso = null;
        Map<String, List<String>> myMaps = new HashMap<String, List<String>>();
        try {
            sorolvaso = new BufferedReader(new FileReader("wordlist.txt"));
            String sor;
           


            while ((sor= sorolvaso.readLine()) != null){
                char[] testarray = sor.toLowerCase().toCharArray();
                Arrays.sort(testarray);
                String sortedTestString = new String(testarray);

                if (!myMaps.containsKey(sortedTestString)) {
                    myMaps.put(sortedTestString, new ArrayList<String>());
                }
                myMaps.get(sortedTestString).add(sor);


            }

            sorolvaso.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Megoldás");
        for (String i : myMaps.keySet()) {
            if(myMaps.get(i).size()>1)
                System.out.println("key: " + i + " value: " + myMaps.get(i));
        }

}
}

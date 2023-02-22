package HashMap;

import java.util.*;

public class HashMapEx
{

    public static void main(String[] args)
    {

        HashMap<String, Double> hashMap1 = new HashMap<>();

        hashMap1.put("Bobby", 97.0);
        hashMap1.put("Ted", 97.0);
        hashMap1.put("Rosy", 88.0);
        hashMap1.put("Mia", 96.5);
        
        

        HashMap<String, Double> hashMap2 = new HashMap<>();

        hashMap2.put("Bobby", 85.0);
        hashMap2.put("Ted", 78.5);
        hashMap2.put("Rosy", 86.0);
        hashMap2.put("Mia", 72.0);
        

        HashMap<String, Double> marks1 = findMaxMinScorers(hashMap1);
        HashMap<String, Double> marks2 = findMaxMinScorers(hashMap2);

        HashMap[] marks = {marks1, marks2};

        for(HashMap m: marks)
        System.out.println(m);
    }

    public static HashMap<String, Double> findMaxMinScorers(HashMap<String, Double> h1)
    {

        HashMap<String, Double> res = new HashMap<>();
        HashMap<String, Double> mx = new HashMap<>();
        HashMap<String, Double> mn = new HashMap<>();

        Double maxValue = (Collections.max(h1.values()));

        Double minValue = (Collections.min(h1.values()));

        for (Map.Entry<String, Double> entry : h1.entrySet())
        {

            if (entry.getValue() == maxValue)
            {

                mx.put(entry.getKey(), entry.getValue());
            }
            if (entry.getValue() == minValue)
            {

                mn.put(entry.getKey(), entry.getValue());
            }

    }

        res.putAll(mx);
        res.putAll(mn);

        return res;
    }

}
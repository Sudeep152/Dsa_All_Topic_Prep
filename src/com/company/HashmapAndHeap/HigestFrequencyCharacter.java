package com.company.HashmapAndHeap;

import java.util.HashMap;

public class HigestFrequencyCharacter {
    public static void main(String[] args) {


System.out.println(useMap("happy birthday"));
    }

    static char useMap(String str) {

        int n = str.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                int of = map.get(ch);
                int nf = of + 1;
                map.put(ch, nf);
            } else {
                map.put(ch, 1);
            }
        }
        char maxF= str.charAt(0);

        for (Character key:map.keySet()){
            if (map.get(key) > map.get(maxF)){
                maxF = key;
            }

        }

        return  maxF;
    }

}
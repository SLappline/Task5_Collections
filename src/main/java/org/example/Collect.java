package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.lang.String;

public class Collect{
    java.lang.String[] collection;

    public Collect(java.lang.String row) {
        collection = row.split(" ");
    }

    public static String[] UniqCollect(java.lang.String[] ar) {
        int j = 1;
        for(int i=0; i < ar.length;i++){
            if(i+1 < ar.length){
                if(!ar[i].equals(ar[i + 1])){
                    j++;
                }
            }
        }
        String[] UniqAr = new String[j];
        int g = 0;
        UniqAr[g] = ar[0];
        for (java.lang.String string : ar) {
            assert UniqAr[g] != null;
            if (!UniqAr[g].equals(string)) {

                g++;
                UniqAr[g] = string;
            }
        }
        return UniqAr;
    }

    public java.lang.String[] SortCollect(Boolean reverse){
        if(reverse){
            Arrays.sort(collection,Collections.reverseOrder());
        }else{
            Arrays.sort(collection);
        }
        return collection;
    }

}
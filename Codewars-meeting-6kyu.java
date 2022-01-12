package com.company;

// soyadlarını arrayliste al
// arraylisti sırala
// ; gçre ayırdığın listede her bir elemana bak
// eğer listede iki adet aynı soyad varsa isimlere bak isimlere göre sırala
// yoksa soyadına göre ismi yanına listeden çek

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static String meeting(String s) {
        ArrayList<String> lastNames = new ArrayList<String>();

        String result ="";

        String sUpper = s.toUpperCase();
        String[] arr =sUpper.split(";");

        for(int i = 0; i<arr.length; i++){
            String[] arr2 = arr[i].split(":");
            lastNames.add(arr2[1]);

        }
        Collections.sort(lastNames);
        System.out.println(lastNames);

        for(int i = 0; i<lastNames.size(); i++){
            int count = 0;
            for (int j = 0; j<lastNames.size(); j++){
                String[] arr2 = arr[j].split(":");

                if((lastNames.get(i)).equals(arr2[1])){
                    count ++;
                }
                if(count ==1 ) {
                    result += "(" + arr2[1]+","+arr2[0] +")";
                    break;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(meeting("Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn"));
    }


}

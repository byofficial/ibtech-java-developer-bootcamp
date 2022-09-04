package com.ibtech.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> provinceList = new ArrayList<String>();
        provinceList.add("İstanbul");
        provinceList.add("Ankara");
        provinceList.add("İzmir");
        provinceList.add("Bursa");
        provinceList.add("Adana");

        for (String provience : provinceList) {
            System.out.println("* " + provience);
        }

        String found = provinceList.get(3);
        System.out.println("4.il: " + found);

        provinceList.remove("İzmir");
    }
}

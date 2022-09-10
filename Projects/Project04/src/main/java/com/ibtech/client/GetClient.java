package com.ibtech.client;

import static com.ibtech.utils.StreamUtilities.get;

public class GetClient {
    public static void main(String[] args) throws Exception {
        String address = "http://localhost:8080/Project04_war_exploded/get";
        String text = get(address);
        System.out.println("İçerik:");
        System.out.println(text);
    }
}

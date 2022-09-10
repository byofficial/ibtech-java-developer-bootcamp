package com.ibtech.client;

import com.ibtech.utils.StreamUtilities;

public class PostClient {
    public static void main(String[] args) throws Exception {
        String address = "http://localhost:8080/Project04_war_exploded/post";
        String input = StreamUtilities.post(address, "Giden");
        System.out.println("Girdi:\r\n" + input);
    }
}

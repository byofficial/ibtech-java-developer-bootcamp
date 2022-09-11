package com.ibtech.sports.web.client;

import com.ibtech.core.utils.StreamHelper;
import com.ibtech.core.utils.WebHelper;

import java.io.IOException;
import java.net.URLConnection;

public class PlayerDeleteClient {
    public static void main(String[] args) throws IOException {
        long playerId = 2;
        String address = String.format("http://localhost:8080/HW_06_04_war/player/delete?id=%d", playerId);
        URLConnection connection = WebHelper.connect(address);
        String result = StreamHelper.read(connection.getInputStream());
        System.out.println(result);
    }
}

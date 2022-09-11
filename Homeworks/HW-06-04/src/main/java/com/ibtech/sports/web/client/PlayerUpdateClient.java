package com.ibtech.sports.web.client;


import com.ibtech.core.utils.StreamHelper;
import com.ibtech.core.utils.WebHelper;
import com.ibtech.core.utils.XmlHelper;
import com.ibtech.sports.database.entity.Player;
import com.ibtech.sports.xml.PlayerXml;
import org.w3c.dom.Document;

import java.net.URLConnection;

public class PlayerUpdateClient {
    public static void main(String[] args) throws Exception {
        String address = "http://localhost:8080/HW_06_04_war/player/update";
        Player player = new Player(5, "Neşet Ertaş", 9.5);
        Document document = PlayerXml.format(player);
        URLConnection connection = WebHelper.connect(address);
        connection.setRequestProperty("content-type", "application/xml;charset=UTF-8");
        XmlHelper.dump(document, connection.getOutputStream());
        String result = StreamHelper.read(connection.getInputStream());
        System.out.println(result);
    }
}


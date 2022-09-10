package com.ibtech.sports.web.client;

import com.ibtech.core.utils.WebHelper;
import com.ibtech.core.utils.XmlHelper;
import com.ibtech.sports.database.entity.Player;
import com.ibtech.sports.xml.PlayerXml;
import org.w3c.dom.Document;

import java.io.InputStream;

public class PlayerFindClient {
    public static void main(String[] args) {
        long playerId = 1;
        String address = String.format("http://localhost:8080/player/find?id=%d", playerId);
        InputStream in = WebHelper.get(address);
        Document document = XmlHelper.parse(in);
        Player player = PlayerXml.parse(document);
        System.out.println(player.getPlayerId() + " "
                + player.getPlayerName() + " "
                + player.getAverageScore());
    }
}

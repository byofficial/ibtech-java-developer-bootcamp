package com.ibtech.sports.web.client;

import com.ibtech.core.utils.WebHelper;
import com.ibtech.core.utils.XmlHelper;
import com.ibtech.sports.database.entity.Player;
import com.ibtech.sports.xml.PlayerXml;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PlayerListClient {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        String address = "http://localhost:8080/HW_06_04_war/players";
        InputStream in = WebHelper.get(address);
        Document document = XmlHelper.parse(in);
        List<Player> players = PlayerXml.parseList(document);

        for (Player player : players) {
            System.out.println(player.getPlayerId() + " "
                    + player.getPlayerName() + " "
                    + player.getAverageScore());
        }
    }
}

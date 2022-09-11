package com.ibtech.sports.xml;

import com.ibtech.core.utils.XmlHelper;
import com.ibtech.sports.database.entity.Player;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import java.util.ArrayList;
import java.util.List;

public class PlayerXml {
    public static Document format(Player player) throws ParserConfigurationException {
        Document document = XmlHelper.create("player");
        Element playerElement = document.getDocumentElement();
        XmlHelper.addSingleElementText(document, playerElement, "playerId", player.getPlayerId());
        XmlHelper.addSingleElementText(document, playerElement, "playerName", player.getPlayerName());
        XmlHelper.addSingleElementText(document, playerElement, "averageScore", player.getAverageScore());
        return document;
    }

    public static Document format(List<Player> players) throws ParserConfigurationException {
        Document document = XmlHelper.create("players");
        Element playerList = document.getDocumentElement();

        for (Player player : players) {
            Element element = document.createElement("player");
            XmlHelper.addSingleElementText(document, element, "playerId", player.getPlayerId());
            XmlHelper.addSingleElementText(document, element, "playerName", player.getPlayerName());
            XmlHelper.addSingleElementText(document, element, "averageScore", player.getAverageScore());
            playerList.appendChild(element);
        }

        return document;

    }

    public static Player parse(Document document) {
        Element element = document.getDocumentElement();
        long playerId = XmlHelper.getSingleElementText(element, "playerId", 0);
        String playerName = XmlHelper.getSingleElementText(element, "playerName", "");
        double averageScore = XmlHelper.getSingleElementText(element, "averageScore", 0.0);
        return new Player(playerId, playerName, averageScore);
    }

    public static List<Player> parseList(Document document) {
        List<Player> newPlayerList = new ArrayList<>();
        Element playerList = document.getDocumentElement();
        NodeList players = playerList.getElementsByTagName("player");
        for (int i = 0; i < players.getLength(); i++) {
            Element player = (Element) players.item(i);
            long playerId = XmlHelper.getSingleElementText(player, "playerId", 0);
            String playerName = XmlHelper.getSingleElementText(player, "playerName", "");
            double averageScore = XmlHelper.getSingleElementText(player, "averageScore", 0.0);
            newPlayerList.add(new Player(playerId, playerName, averageScore));
        }
        return newPlayerList;
    }
}

package com.ibtech.sports.web.servlet;

import com.ibtech.core.utils.XmlHelper;
import com.ibtech.sports.database.entity.Player;
import com.ibtech.sports.database.manager.PlayerManager;
import com.ibtech.sports.xml.PlayerXml;
import org.w3c.dom.Document;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/players")
public class PlayerListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            List<Player> playerList;
            PlayerManager playerManager = new PlayerManager();
            playerList = playerManager.list();
            Document document = PlayerXml.format(playerList);

            response.setContentType("application/xml;charset=UTF-8");

            XmlHelper.dump(document, response.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}

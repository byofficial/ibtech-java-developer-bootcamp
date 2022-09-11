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

@WebServlet("/player/find")
public class PlayerFindServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            Player player;
            long playerId = Long.parseLong(request.getParameter("id"));
            PlayerManager playerManager = new PlayerManager();
            player = playerManager.find(playerId);
            if (player == null) {
                response.sendError(404);
            } else {
                Document document = PlayerXml.format(player);
                response.setContentType("application/xml;charset=UTF-8");

                XmlHelper.dump(document, response.getOutputStream());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}

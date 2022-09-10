package com.ibtech.sports.web.servlet;

import com.ibtech.core.utils.StreamHelper;
import com.ibtech.core.utils.XmlHelper;
import com.ibtech.sports.database.entity.Player;
import com.ibtech.sports.database.manager.PlayerManager;
import com.ibtech.sports.xml.PlayerXml;
import org.w3c.dom.Document;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/player/insert")
public class PlayerInsertServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Document document = XmlHelper.parse(request.getInputStream());
        Player player = PlayerXml.parse(document);
        PlayerManager playerManager = new PlayerManager();
        boolean inserted = playerManager.insert(player);
        String result = inserted ? "Eklendi" : "Eklenmedi";
        StreamHelper.write(response.getOutputStream(), result);
    }
}

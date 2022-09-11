package com.ibtech.sports.web.servlet;

import com.ibtech.core.utils.StreamHelper;
import com.ibtech.core.utils.XmlHelper;
import com.ibtech.sports.database.entity.Player;
import com.ibtech.sports.database.manager.PlayerManager;
import com.ibtech.sports.xml.PlayerXml;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/player/insert")
public class PlayerInsertServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        try {
            Document document;
            document = XmlHelper.parse(request.getInputStream());
            Player player = PlayerXml.parse(document);
            PlayerManager playerManager = new PlayerManager();
            boolean inserted = playerManager.insert(player);
            String result = inserted ? "Eklendi" : "Eklenmedi";
            StreamHelper.write(response.getOutputStream(), result);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (SAXException | SQLException e) {
            e.printStackTrace();
        }

    }
}

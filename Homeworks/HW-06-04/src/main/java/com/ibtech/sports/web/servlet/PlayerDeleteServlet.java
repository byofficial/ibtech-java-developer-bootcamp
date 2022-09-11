package com.ibtech.sports.web.servlet;

import com.ibtech.core.utils.StreamHelper;
import com.ibtech.sports.database.manager.PlayerManager;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/player/delete")
public class PlayerDeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            long playerId = Long.parseLong(request.getParameter("id"));
            PlayerManager playerManager = new PlayerManager();
            boolean deleted = playerManager.delete(playerId);
            String result = deleted ? "Silindi" : "Silinemedi";
            StreamHelper.write(response.getOutputStream(), result);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}

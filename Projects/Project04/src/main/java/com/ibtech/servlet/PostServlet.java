package com.ibtech.servlet;

import com.ibtech.utils.StreamUtilities;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post")
public class PostServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String input = StreamUtilities.read(request.getInputStream());
        System.out.println("Girdi:\r\n" + input);
        StreamUtilities.write(response.getOutputStream(), "Oldu");
    }
}

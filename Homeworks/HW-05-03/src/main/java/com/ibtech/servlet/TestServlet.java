package com.ibtech.servlet;

import com.ibtech.converter.TransactionConverter;
import com.ibtech.entity.Transaction;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TestServlet", value = "/get")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("transactionId") != null
                && request.getParameter("transactionName") != null
                && request.getParameter("amountLocal") != null) {

            long transactionId = Long.parseLong(request.getParameter("transactionId"));
            String transactionName = request.getParameter("transactionName");
            double amountLocal = Double.parseDouble(request.getParameter("amountLocal"));

            Transaction transaction = new Transaction(transactionId, transactionName, amountLocal);
            String convert = TransactionConverter.format(transaction);
            PrintWriter out = response.getWriter();
            response.setContentType("text/html; charset=UTF-8");
            out.write(convert);
        } else {
            PrintWriter out = response.getWriter();
            out.write("Missing Parameter!");

        }
    }

}

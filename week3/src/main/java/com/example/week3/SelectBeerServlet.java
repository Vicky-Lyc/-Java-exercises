package com.example.week3;

import javafx.scene.text.Text;
import sun.plugin.dom.core.Document;
import sun.plugin.dom.html.HTMLDocument;

import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(name = "SelectBeerServlet", value = "/SelectBeerServlet")
public class SelectBeerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String body = request.getParameter("body");
        String amount = request.getParameter("amount");

        int a;
        try {
            a = Integer.parseInt(amount);
        } catch (Exception e) {
            response.sendRedirect("error.jsp");
            return;
        }
        a= Integer.parseInt(request.getParameter("amount")) + 2;

        String[] sizes = request.getParameterValues("sizes");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>This is get response</h1>");
        out.println("<p>body: " + body + "</p>");
        out.println("<p>amount: " + a+ "</p>");
        for (String s : sizes) {
            out.println("<p>sizes: " + s + "</p>");
        }
        out.println("</body></html>");
    }

}
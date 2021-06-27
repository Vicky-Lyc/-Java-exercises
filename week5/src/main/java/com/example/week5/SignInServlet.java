package com.example.week5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@WebServlet(name = "SignInServlet", value = "/sign-in") //name is not dispensible
public class SignInServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("sign-in.html").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("inputName");
        String password = req.getParameter("inputPassword");

        Stream<String> lines = Files.lines(Paths.get("C:\\Users\\86137\\tryJava\\password.txt"));
        List<String> Lines2 = Files.readAllLines(Paths.get("C:\\Users\\86137\\tryJava\\password.txt"));
        HashMap<String,String> m = new HashMap<>();
        lines.forEach(line -> {
            String[] name_pwd = line.split(" ");
            m.put(name_pwd[0], name_pwd[1]);
        });

        if(!m.containsKey(name)){
            req.getRequestDispatcher("error.jsp").forward(req,resp);


        }else{
            if(m.get(name).equals(password)){
                req.getSession().setAttribute("user",name);
                resp.sendRedirect("index");
            }
            else {
                req.getRequestDispatcher("error.jsp").forward(req,resp);

            }
        }

    }
}

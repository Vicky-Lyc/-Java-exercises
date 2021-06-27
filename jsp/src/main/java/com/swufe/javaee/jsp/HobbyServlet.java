package com.swufe.javaee.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.*;

@WebServlet(urlPatterns = "/hobbyFind")
public class HobbyServlet extends HttpServlet {
    private Map<String, List<String>> userHobby;
    @Override
    public void init() {
       userHobby = new HashMap<>();
       userHobby.put("Bob", Arrays.asList("skiing","scuba"));
       userHobby.put("Jim", Arrays.asList("skiing"));
       userHobby.put("James", Arrays.asList("knitting","dating","scuba"));
       userHobby.put("Tom", Arrays.asList("knitting"));
       userHobby.put("Fei", Arrays.asList("knitting","scuba","skiing"));
       userHobby.put("Jone", Arrays.asList("scuba","dating"));
       userHobby.put("Fred", Arrays.asList("dating"));
       userHobby.put("Pradeep", Arrays.asList("dating"));
       userHobby.put("Philippe", Arrays.asList("dating"));
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String hobby = request.getParameter("hobby");
       List<String> names = new ArrayList<>();
       userHobby.forEach((k, v) -> {
           if (v.contains(hobby)) {
               names.add(k);
           }
       });
       request.setAttribute("names", names);
       request.setAttribute("hobby", hobby);
       // Two JSPs have different UI styles.
        //request.getRequestDispatcher("hobbyResult.jsp").forward(request, response);
       request.getRequestDispatcher("hobbyResult2.jsp").forward(request, response);
    }

}

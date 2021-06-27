package com.example.week3;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;

@WebServlet(urlPatterns = "/upload")
@MultipartConfig
public class uploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Part filePart = request.getPart("file");
        InputStream fileContent = filePart.getInputStream();
        String s1= filePart.getSubmittedFileName();
        filePart.write("C:\\Users\\86137\\tryJava\\" + s1);
    }}

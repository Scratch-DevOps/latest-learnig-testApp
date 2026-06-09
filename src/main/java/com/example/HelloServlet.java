package com.example;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");

        resp.getWriter().println("""
            <html>
            <head>
                <link rel='stylesheet' href='css/style.css'>
            </head>
            <body>
                <div class='container'>
                    <h1>Hello Sai 👋</h1>
                    <h2>Welcome to the new Phase 🚀</h2>
                </div>
            </body>
            </html>
        """);
    }
}
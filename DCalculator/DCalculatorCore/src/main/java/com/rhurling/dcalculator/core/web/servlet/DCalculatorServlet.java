package com.rhurling.dcalculator.core.web.servlet;

import com.rhurling.dcalculator.core.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class DCalculatorServlet extends HttpServlet {

    public void init() throws ServletException {
        ApplicationContext context = new AnnotationConfigApplicationContext();
        AnnotationConfigApplicationContext annotationContext = (AnnotationConfigApplicationContext) context;
        annotationContext.register(SpringConfiguration.class);
        annotationContext.refresh();

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

    }

}

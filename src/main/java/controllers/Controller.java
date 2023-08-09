package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface Controller{
    void get(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
    void post(HttpServletRequest req, HttpServletResponse resp);
}
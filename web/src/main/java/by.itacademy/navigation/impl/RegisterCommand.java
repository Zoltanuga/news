package by.itacademy.navigation.impl;

import by.itacademy.navigation.Command;
import by.itacademy.pojos.User;
import by.itacademy.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import static by.itacademy.resources.Constants.*;


public class RegisterCommand implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        session.setAttribute("isRegistered", true);
        UserService userService = UserService.getInstance();
        String email = request.getParameter(PARAM_EMAIL_REGISTER);
        String name = request.getParameter(PARAM_NAME_REGISTER);
        String surname = request.getParameter(PARAM_SURNAME_REGISTER);
        String password = request.getParameter(PARAM_PASSWORD_REGISTER);
        userService.addUser(email, password, name, surname);
        try {
            response.sendRedirect("/news/success");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SUCCESS_PAGE;
    }
}

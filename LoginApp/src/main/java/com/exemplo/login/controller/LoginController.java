package com.exemplo.login.controller;

import com.exemplo.login.model.User;
import com.exemplo.login.view.LoginView;

public class LoginController {
    private final LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
        this.view.getLoginButton().setOnAction(e -> handleLogin());
    }

    private void handleLogin() {
        String username = view.getUsernameField().getText();
        String password = view.getPasswordField().getText();

        User user = new User(username, password);

        if (user.isValid()) {
            view.getMessageLabel().setText("Login com sucesso!");
        } else {
            view.getMessageLabel().setText("Credenciais inválidas.");
        }
    }
}
package com.exemplo.login.view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class LoginView {
    private final TextField usernameField = new TextField();
    private final PasswordField passwordField = new PasswordField();
    private final Button loginButton = new Button("Login");
    private final Label messageLabel = new Label();

    public Scene getScene() {
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        usernameField.setPromptText("Nome de utilizador");
        passwordField.setPromptText("Palavra-passe");

        layout.getChildren().addAll(
            new Label("Utilizador:"), usernameField,
            new Label("Palavra-passe:"), passwordField,
            loginButton,
            messageLabel
        );

        return new Scene(layout, 300, 250);
    }

    public TextField getUsernameField() {
        return usernameField;
    }

    public PasswordField getPasswordField() {
        return passwordField;
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public Label getMessageLabel() {
        return messageLabel;
    }
}
package com.exemplo.login;

import com.exemplo.login.controller.LoginController;
import com.exemplo.login.view.LoginView;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        LoginView view = new LoginView();
        new LoginController(view);

        primaryStage.setTitle("Página de Login");
        primaryStage.setScene(view.getScene());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
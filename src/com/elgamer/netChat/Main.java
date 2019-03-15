package com.elgamer.netChat;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Login login = new Login(primaryStage);
        login.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

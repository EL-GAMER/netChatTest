package com.elgamer.netChat;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

class Login extends LoginUI
{
    private Stage loginStage;
    private Scene loginScene;

    Login(Stage primaryStage)
    {
        initialize();
        loginScene = new Scene(root);

        loginStage = primaryStage;
        loginStage.setTitle("Login");
        loginStage.setScene(loginScene);
    }

    public void show()
    {
        loginStage.show();
    }

}

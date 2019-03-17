package com.elgamer.netChat;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

abstract class LoginUI
{
    AnchorPane root;
    private Button btn1;
    private TextField textField;

    LoginUI()
    {
        btn1 = new Button();
        btn1.setText("Click Me!");

        textField = new TextField();
        textField.setPromptText("put some text here!");

        root = new AnchorPane();
        root.getChildren().addAll(btn1,textField);
        root.autosize();

    }

    abstract void initialize();


}

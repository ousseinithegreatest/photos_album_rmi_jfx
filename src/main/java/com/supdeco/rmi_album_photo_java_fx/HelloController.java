package com.supdeco.rmi_album_photo_java_fx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {

    @FXML
    Text txtToRegistration, txtToConnection;

    public void handleToRegistration() throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("inscription-view.fxml")));
        Stage window = (Stage) txtToRegistration.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void handleToConnection() throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        Stage window = (Stage) txtToConnection.getScene().getWindow();
        window.setScene(new Scene(root));
    }
}
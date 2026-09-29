package org.example.studentportal;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;

import java.io.IOException;

public class HelloController {

    // Splash screen -> Login Screen
    @FXML
    protected void onContinueButtonClick(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("login-view.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("Student Portal - Login");
        stage.show();
    }

    // Login Screen -> Landing Screen
    @FXML
    protected void onLoginButtonClick(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("landing-view.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        Stage stage = (Stage) ((Node) event.getSource())
                .getScene()
                .getWindow();

        stage.setScene(scene);
        stage.setTitle("Student Portal");
        stage.show();
    }

    // Landing Screen -> Login Screen
    @FXML
    protected void onLogoutButtonClick(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("login-view.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        Stage stage = (Stage) ((Node) event.getSource())
                .getScene()
                .getWindow();

        stage.setScene(scene);
        stage.setTitle("Student Portal - Login");
        stage.show();
    }
    // Login Screen -> Splash Screen
    @FXML
    protected void onCancelButtonClick(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("splash-view.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        Stage stage = (Stage) ((Node) event.getSource())
                .getScene()
                .getWindow();

        stage.setScene(scene);
        stage.setTitle("Student Portal");
        stage.show();
    }
}
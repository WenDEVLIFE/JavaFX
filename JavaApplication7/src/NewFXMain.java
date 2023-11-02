/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.layout.StackPane;

// this is how to create a javafx
public class NewFXMain extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the FXML file
            Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));

            // Create a Scene and set the root in it
            Scene scene = new Scene(root);

        
   
            // Set the Scene on the Stage (window)
            primaryStage.setScene(scene);

            // Set the window title
            primaryStage.setTitle("Registration Ui");

            // Show the Stage
            primaryStage.show();

            // Define the Button's action
          

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
public void handleButtonClick(ActionEvent event) {
    // Your event handling code here
}
    public static void main(String[] args) {
        launch(args);
    }
}
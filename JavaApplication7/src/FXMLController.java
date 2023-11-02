/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class FXMLController implements Initializable {

    @FXML
    private TextField firstname;
    @FXML
    public ComboBox age;

    @FXML
    private TextField lastname;
    @FXML
    private TextField address;

    public Integer selectedValue;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
  // Create an ObservableList to hold the values
        ObservableList<Integer> ageValues = FXCollections.observableArrayList();

        // Populate the list with values from 1 to 100
        for (int i = 1; i <= 100; i++) {
            ageValues.add(i);
        }

        // Set the items of the ComboBox to the ageValues list
        age.setItems(ageValues);
    
    }    

    @FXML
       private void btnclicked(ActionEvent event) {
        String name = firstname.getText();
        String lastname1 = lastname.getText();
        String loc = address.getText();

        if (selectedValue != null) {
            int a = selectedValue.intValue();
            // Now, 'a' contains the selected value as an 'int'.
        } else {
            // Handle the case where no item is selected or 'selectedValue' is null.
        }

           VBox vbox = new VBox();
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("This is an information dialog.");
        alert.setContentText("Your name: " + name + "Your last name: " + lastname1 + " Selected value: " + selectedValue +"  Your address: " + loc);
    
       

        alert.showAndWait();
        Scene scene = new Scene(vbox, 500, 200);

    }

    @FXML
    void Select(ActionEvent event) {
        selectedValue = (Integer) age.getSelectionModel().getSelectedItem();
    }

    @FXML
    private void btnclear(ActionEvent event) {
        firstname.setText("");
        lastname.setText("");
        address.setText("");
       
    }
    
}

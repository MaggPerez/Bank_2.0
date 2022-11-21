/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package test.bank;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author maggy
 */
public class LoginMenuController {

    @FXML
    public void login(ActionEvent event) throws Exception {
        // TODO

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
        
        App.setRoot("mainmenu");
       // loginMsg.setText("Welcome");
        
    }    

    @FXML
    public void deposit(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Deposit.fxml"));
        
        App.setRoot("deposit");
    }
    
    
    public void withdraw(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Withdraw.fxml"));
        
        App.setRoot("withdraw");
    }

    
    public void TransLog(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TransactionLog.fxml"));
        
        App.setRoot("transactionlog");
    }
    
    public void ExitMenu(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
        
        App.setRoot("mainmenu");
    }
    
}

package sample;

import java.io.Console;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Core.CoreController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class LogController {
    CoreController core = new CoreController();

    public Main main = new Main();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Log_In_btn;

    @FXML
    private PasswordField password_txt;

    @FXML
    private TextField username_txt;

    public LogController() {
    }


    @FXML
    void initialize() {
        assert Log_In_btn != null : "fx:id=\"Log_In_btn\" was not injected: check your FXML file 'sample.fxml'.";
        assert password_txt != null : "fx:id=\"password_txt\" was not injected: check your FXML file 'sample.fxml'.";
        assert username_txt != null : "fx:id=\"username_txt\" was not injected: check your FXML file 'sample.fxml'.";


    }
    @FXML
    void log_In() throws IOException {
        int op = 1;
        /*op = tiene que pedirle al controller que valide el username y password
        y que le devuelva si es admin o usuario normal
        tambien agrega en el main el usuario
        controller.LogIn(username_text.getTest(),password_txt.getText());

        */
        if(op == 1){ //es usuario normal

            //core.LogIn(username_txt.getText(),password_txt.getText());
            System.out.println("OH me estriparon mas mas");
            System.out.println(username_txt.getText());
            System.out.println(password_txt.getText());
            main.goToDashUser();
        }
    }
}
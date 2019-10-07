package sample;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.DatePicker;
        import javafx.scene.control.TextField;
        import javafx.scene.image.ImageView;
        import javafx.scene.layout.AnchorPane;
        import javafx.scene.layout.VBox;


public class DashController {
    private Main main = new Main();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button exitBtn;

    @FXML
        private Button editUserBtn;

    @FXML
    private ImageView exitImg;

    @FXML
    private AnchorPane rootPane;

    @FXML
    private VBox profilePanel;

    @FXML
    private VBox dashboardPanel;

    @FXML
    private TextField userNameTxt;

    @FXML
    private TextField userLastNameTxt1;

    @FXML
    private TextField userLastNameTxt2;

    @FXML
    private TextField userPhoneTxt1;

    @FXML
    private TextField userPhoneTxt2;

    @FXML
    private TextField userEmailTxt;

    @FXML
    private DatePicker userBirthdate;

    @FXML
    private Button applyBtn;



    public DashController(){

    }
    @FXML
    void initialize() {
        assert exitBtn != null : "fx:id=\"exitBtn\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert exitImg != null : "fx:id=\"exitImg\" was not injected: check your FXML file 'dashboard.fxml'.";
        assert rootPane != null : "fx:id=\"rootPane\" was not injected: check your FXML file 'dashboard.fxml'.";
    }
    @FXML
    void exit() {
        System.out.println("exit :V");
        main.exit();
    }

    @FXML
    void editUser() {
        userNameTxt.setDisable(false);
        userLastNameTxt1.setDisable(false);
        userLastNameTxt2.setDisable(false);
        userPhoneTxt1.setDisable(false);
        userPhoneTxt2.setDisable(false);
        userEmailTxt.setDisable(false);
        userBirthdate.setDisable(false);
        editUserBtn.setVisible(false);
        applyBtn.setVisible(true);

    }
    @FXML
    void applyProfileChanges() {
        userNameTxt.setDisable(true);
        userLastNameTxt1.setDisable(true);
        userLastNameTxt2.setDisable(true);
        userPhoneTxt1.setDisable(true);
        userPhoneTxt2.setDisable(true);
        userEmailTxt.setDisable(true);
        userBirthdate.setDisable(true);
        editUserBtn.setVisible(true);
        applyBtn.setVisible(false);
    }





    @FXML
    void profileUser() {
        profilePanel.setVisible(true);
        dashboardPanel.setVisible(false);

    }

    @FXML
    void dashboardUser() {
        dashboardPanel.setVisible(true);
        profilePanel.setVisible(false);
    }

}


package sample;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.image.ImageView;
        import javafx.scene.layout.AnchorPane;


public class DashController {
    private Main main = new Main();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button exitBtn;

    @FXML
    private ImageView exitImg;

    @FXML
    private AnchorPane rootPane;

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

}


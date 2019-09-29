package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;


public class Main extends Application implements EventHandler<ActionEvent> {

    private Stage window = new Stage();
    private static double xOffset = 0;
    private static double yOffset = 0;

    @Override
    public void start(Stage pPrimaryStage) throws Exception{
        this.window = pPrimaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window.setTitle("Gir's chiken with rice");

        window.setScene(new Scene(root, 1075, 590));
        Image image  = new Image("/icons/gir.png");
        //primaryStage.getStyle().add(getClass().getResource("/css/styles.css").toExternalForm());
        window.getIcons().add(image);

        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent actionEvent) {

    }

    public void goToDashUser() throws IOException {

        /*FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/DashBoard/dashboard.fxml"));
        BorderPane dashboard = loader.load();*/
        window.close();
        window.initStyle(StageStyle.UNDECORATED);
        Parent root2 = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
        window.setScene(new Scene(root2, 1075, 590));
        window.setTitle("Gir's chiken with rice");
        Image image  = new Image("/icons/gir.png");
        window.getIcons().add(image);
        window.show();
        //primaryStage.setCenter(dashboard);
    }
/*
    public void setOffsets(double x, double y){
        xOffset = x;
        yOffset = y;
    }
    public void setWindowPosition(double x, double y){
        window.setX(x- xOffset);
        window.setY(y - yOffset);
    }*/
    public void exit(){
        Platform.exit();
    }
}

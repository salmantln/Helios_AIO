package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.controller.Controller;
import sample.controller.MainController;
import sample.model.Billing;
import sample.model.ShopifyTask;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.SimpleFormatter;

public class MainApplication extends Application {

    private String TITLE = "Helios AIO";
    private static int WIDTH = 1400;
    private static int HEIGHT = 750;
    private static Stage primaryStage;
    private static Stage dialogue;
    public static HashMap<String, Billing.ProfileObject> profiles;
    private static ObservableList<ShopifyTask> taskData = FXCollections.observableArrayList();


    public void start(Stage primaryStage) throws Exception {

        /**
         ------------------------------------------------------------
         */
        profiles = Billing.load();
        MainApplication.primaryStage = primaryStage;

        //Image van de App word hier aangemaakt.
        Image image = new Image("/icons/sun.png");


        switchController(new MainController());

        primaryStage.getIcons().add(image);

        //stage title word hier aangepast

        primaryStage.initStyle(StageStyle.UNDECORATED);

        primaryStage.setWidth(WIDTH);
        primaryStage.setHeight(HEIGHT);
        primaryStage.setTitle(TITLE);

        /**
         * -------------------------------------------------------
         */

        primaryStage.show();

    }

    public static void switchController(Controller controller) {

        primaryStage.setScene(new Scene(controller.getView().getRoot()));
    }

    public static void tabSwitcher(Controller controller) {
//        proxyController.getView().getRoot()

    }

    //minimize the screen. Even after clicked in the CreateTask
    public static void minimize() {
        //  stage = (Stage) MainApplication.getStage().getScene().getWindow();

        primaryStage.setIconified(true);
    }

    public static void timer() {
        Date currentdate = new Date();
        SimpleDateFormat timeformat = new SimpleDateFormat("hh:mm:ss");
        timeformat.format(currentdate);
        System.out.println(timeformat.format(currentdate));
    }

    public static void showTaskScreen(Controller controller) {

        Scene scene = new Scene(controller.getView().getRoot(), 400, 300);

        dialogue = new Stage();
        Image image = new Image("/icons/sun.png");

        dialogue.setTitle("Create Task");


//        dialogue.initModality(Modality.NONE);
        dialogue.initOwner(primaryStage);

        dialogue.setResizable(false);

        dialogue.setScene(scene);
        dialogue.getIcons().add(image);
        dialogue.initModality(Modality.APPLICATION_MODAL);
        dialogue.show();
    }

    public static ObservableList<ShopifyTask> getTaskData() {
        return taskData;
    }

    public static Stage getPrimaryStage() {
        return primaryStage;
    }


    public static void setPrimaryStage(Stage primaryStage) {
        MainApplication.primaryStage = primaryStage;
    }
}

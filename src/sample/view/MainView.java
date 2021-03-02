package sample.view;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import sample.Main;

import javafx.scene.control.Label;
import java.time.LocalTime;

public class MainView extends View {

    private VBox vBox;
    private HBox hBox;
    private HBox menuHBox;

    //image
    private Label closeLbl;
    private Label minLbl;
    private Image imageIcon;
    private Image imageStart;
    private Image imageStop;
    private Image imageMin;
    private Image imageClose;
    private ImageView imageViewIcon;
    private ImageView imageViewStart;
    private ImageView imageViewMin;
    private ImageView imageViewClose;
    private ImageView imageViewStop;

    //buttons
    private Button dashboardBtn;
    private Button proxyBtn;
    private Button profileBtn;
    private Button taskBtn;
    private Button settingBtn;

    public MainView() {
        initLayout();
    }


    public void initLayout() {

        //Min and Close button.

        imageViewMin = new ImageView();
        imageMin = new Image("/icons/min.png");
        imageViewMin.setImage(imageMin);
        imageViewMin.setFitHeight(30);
        imageViewMin.setFitWidth(30);

        imageViewClose = new ImageView();
        imageClose = new Image("/icons/close.png");
        imageViewClose.setImage(imageClose);
        imageViewClose.setFitHeight(30);
        imageViewClose.setFitWidth(30);

        closeLbl = new Label("", imageViewClose);
        closeLbl.setId("closeLbl");


        minLbl = new Label("", imageViewMin);
        minLbl.setId("minLbl");

        //Sun Icon
        imageViewIcon = new ImageView();
        imageIcon = new Image("/icons/sun.png");
        imageViewIcon.setId("sunImage");
        imageViewIcon.setImage(imageIcon);
        imageViewIcon.setFitHeight(50);
        imageViewIcon.setFitWidth(50);

        //Button
        taskBtn = new Button("tasks");
        dashboardBtn = new Button("Dashboard");
        profileBtn = new Button("profile");
        proxyBtn = new Button("proxies");


        menuHBox = new HBox();

        Label timeLbl = new Label();

        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            LocalTime currentTime = LocalTime.now();
            timeLbl.setText(currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
        }),
                new KeyFrame(Duration.seconds(1))
        );
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
        timeLbl.setId("TimeLbl");


        vBox = new VBox(menuHBox,imageViewIcon, dashboardBtn, taskBtn,profileBtn,proxyBtn,settingBtn);

        vBox.getChildren().addAll();

        hBox = new HBox(vBox);

    }

    @Override
    public Parent getRoot() {
        return hBox;
    }
}

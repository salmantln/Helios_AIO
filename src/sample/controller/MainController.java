package sample.controller;


import sample.Main;
import sample.MainApplication;
import sample.model.Proxy;
import sample.view.MainView;
import sample.view.View;

import java.util.ArrayList;


public class MainController extends Controller {
    private double xOffset = 0;
    private double yOffset = 0;

    public MainView mainView;

    static ArrayList<Proxy.ProxyObject> proxies;
    static ArrayList<Proxy.ProxyObject> usedProxies;

   public MainController() {

        mainView = new MainView();
        mainView.getRoot().getStylesheets().add("/stylesheet/stylesheet.css");
//        profiles = Billing.load();
        System.out.println(mainView);


//        mainView.getTaskCreateBtn().setOnAction(e -> createTask());
//        mainView.getMinBtn().setOnMouseClicked(e -> MainApplication.minimize());
//        mainView.getCloseLbl().setOnMouseClicked(e -> closeBtn());

        movingScene();

    }

    public void movingScene() {

        mainView.getRoot().setOnMousePressed(event -> {
            xOffset = MainApplication.getPrimaryStage().getX() - event.getScreenX();
            yOffset = MainApplication.getPrimaryStage().getY() - event.getScreenY();
        });

        mainView.getRoot().setOnMouseDragged(event -> {
            MainApplication.getPrimaryStage().setX(event.getScreenX() + xOffset);
            MainApplication.getPrimaryStage().setY(event.getScreenY() + yOffset);
        });

    }


    @Override
    public View getView() {
        return mainView;
    }
}

package org.sla;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application{
    private ImageView friend;
    private Image image1;
    private Image image2;
    private Image image3;
    private Image image4;
    private Image image5;
    private Image image6;
    private Image image7;

    @Override
    public void start(Stage primaryStage) throws Exception {

        MenuItem menuItem1 = new MenuItem("Light");
        menuItem1.setOnAction(e-> {
                    System.out.println("menuItem1 action happened");
                    friend.setImage(image1);

                }
                );

        MenuItem menuItem2 = new MenuItem("Darkness");
        menuItem2.setOnAction(e-> {
                    System.out.println("menuItem2 action happened");
              friend.setImage(image2);
                }
        );

        MenuItem menuItem3 = new MenuItem("Time");
        menuItem3.setOnAction(e-> {
                    System.out.println("menuItem3 action happened");
                    friend.setImage(image3);

                }
        );

        MenuItem menuItem4 = new MenuItem("Electricity");
        menuItem4.setOnAction(e-> {
                System.out.println("menuItem4 action happened");
                    friend.setImage(image4);

                }
        );

        MenuItem menuItem5 = new MenuItem("Fire");
        menuItem5.setOnAction(e-> {
                    System.out.println("menuItem5 action happened");
                    friend.setImage(image5);

                }
        );

        MenuItem menuItem6 = new MenuItem("Water");
        menuItem6.setOnAction(e-> {
                    System.out.println("menuItem6 action happened");
                    friend.setImage(image6);

                }
        );

        MenuItem menuItem7 = new MenuItem("Rainbows");
        menuItem7.setOnAction(e-> {
                    System.out.println("menuItem7 action happened");
                    friend.setImage(image7);

                }
        );

        MenuButton menuButton = new MenuButton("Options", null, menuItem1, menuItem2, menuItem3, menuItem4, menuItem5, menuItem6, menuItem7);

        image1 = new Image("Lugia.png");
        image2 = new Image("ShadowLugia.png");
        image3 = new Image("Celebi.png");
        image4 = new Image("Raikou.png");
        image5 = new Image("Entei.png");
        image6 = new Image("Suicune.png");
        image7 = new Image("Ho-Oh.png");
        friend = new ImageView();
        friend.setFitWidth(400);
        friend.setFitHeight(400);


        HBox buttonLayout = new HBox();
        buttonLayout.getChildren().add(menuButton);
        buttonLayout.getChildren().add(friend);

        Scene Menu = new Scene(buttonLayout, 500, 500);
        primaryStage.setScene(Menu);
        primaryStage.show();


    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
//randomcommittopush
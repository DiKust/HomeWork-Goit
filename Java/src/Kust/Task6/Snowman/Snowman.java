package Kust.Task6.Snowman;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

import java.util.Random;

public class Snowman extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public  void start(Stage primaryStage) throws Exception{
        primaryStage.setWidth(800);
        primaryStage.setHeight(700);

        Circle circle1 = new Circle(400, 50, 50, Paint.valueOf("#87CEFF"));
        Circle circle2 = new Circle(380, 35, 15, Paint.valueOf("#FF000075"));
        Circle circle3 = new Circle(420, 35, 15,Paint.valueOf("#FF000075"));
        Circle circle4 = new Circle(400, 75, 10,Paint.valueOf("#FF000075"));

        Pane root = new Pane();
        root.getChildren().addAll(circle1, circle2, circle3, circle4);
        root.getChildren().addAll(generalCircle(7));

        Button button = new Button();
        button.setTranslateX(20);
        button.setTranslateY(20);
        button.setText("Click me");
        button.setOnMouseClicked(event ->{
            root.getChildren().clear();
            root.getChildren().addAll(circle1, circle2, circle3, circle4);
            root.getChildren().addAll(button);
            root.getChildren().addAll(generalCircle(7));

            } );
        root.getChildren().addAll(button);
        //root.getChildren().addAll(generalCircle(10));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        Random random = new Random();

        primaryStage.show();
    }

    private Circle[] generalCircle(int count){
       Circle[] circles = new Circle[count];
        Random random = new Random();
       for(int i = 0; i < circles.length; i++){
           Color color = Color.color(
                   random.nextDouble(),
                   random.nextDouble(),
                   random.nextDouble(),
                   0.6f);
           circles[i] = new Circle(
                   400,
                   random.nextInt(600),
                   random.nextInt(80),


                   Paint.valueOf(color.toString())
           );


       }
    return circles;

   }
}

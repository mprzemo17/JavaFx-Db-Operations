package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.awt.*;
import java.sql.Connection;

public class Main extends Application {
    Connection conn;


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Java FX SQLite DbConnection");

        CheckConnection();
        

        primaryStage.show();
    }

    public void CheckConnection(){
        conn = SqlConnection.DbConnector();
        if(conn == null){
            System.out.println("Connection Not Successful");
            System.exit(1);

        }else{
            System.out.println("Connection Successful");

        }
    }


    public static void main(String[] args) {
        launch(args);
    }

}
package pra03.credito;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PRA03Credito extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(PRA03Credito.class.getResource("CreditoView.fxml"));
            Pane ventana = (Pane) loader.load();
            
            Scene scene = new Scene(ventana);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch(IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

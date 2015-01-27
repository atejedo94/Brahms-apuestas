package controller;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class main extends Application {
	
	private Stage primStage;
	private BorderPane bp;
	private AnchorPane ap;

	@Override
	public void start(Stage primaryStage) {
		
		this.primStage = primaryStage;
		this.primStage.setTitle("Brahms apuestas");
		
		showRootView();
		
	}
	
	
	public void showRootView(){
		
		try{
			FXMLLoader loader = new FXMLLoader();
			
			loader.setLocation(main.class.getResource("../view/Login.fxml"));
			ap = (AnchorPane) loader.load();
			
			Scene scene = new Scene(ap);
			primStage.setScene(scene);
			primStage.show();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
	

	
	 /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primStage;
    }
	public static void main(String[] args) {
		launch(args);
	}
}

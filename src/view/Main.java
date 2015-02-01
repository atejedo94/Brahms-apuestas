package view;



import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	private Stage primStage;
	private AnchorPane ap;

	@Override
	public void start(Stage primaryStage) {
		
		this.primStage = primaryStage;
		this.primStage.setTitle("Brahms apuestas");
		
		setRoot();
		
	}
	
	
	public void setRoot(){
		
		try{
			FXMLLoader loader = new FXMLLoader();
			
			loader.setLocation(Main.class.getResource("Login.fxml"));
			ap = (AnchorPane) loader.load();
			
			Scene scene = new Scene(ap);
			primStage.setScene(scene);
			
			LoginController controller = loader.getController();
			controller.setMain(this);
			
			
			primStage.show();
			
		}catch (IOException ex) {
            System.out.println(ex.getMessage());
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
		
		
	}
	
	public void initSportBets(){
		
		try{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("SportBets.fxml"));
			
			AnchorPane page = (AnchorPane) loader.load();
			
			Scene scene = new Scene(page);
			primStage.setScene(scene);
			
			SportBetsController controller = loader.getController();
			controller.setMain(this);
			
			primStage.show();
			
			
		}catch (IOException ex) {
            System.out.println(ex.getMessage());
       }catch (Exception e){
           System.out.println(e.getMessage());
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
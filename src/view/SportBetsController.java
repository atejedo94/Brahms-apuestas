package view;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class SportBetsController implements Initializable {

	private Main main;

	public void setMain(Main main) {
		this.main = main;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	@FXML Label label1;
	
	@FXML Label label2;

	@FXML Label label3;

	@FXML Label label4;

	@FXML Label label5;

	@FXML Label label6dr;

	@FXML private void onClickBet(){
		main.initPayBet();
	}
	
	@FXML
	private void onClickInvest() {
		main.initInvestments();
	}

	@FXML
	private void onClickMyProfile() {
		main.initMyProfile();
	}

	@FXML
	private void onClickOtherUsers() {
		main.initOtherUsers();
	}

	@FXML
	private void onClickLogOut() {
		main.setRoot();
	}

	public void loadEverything(){
		
		if (true) {
			
			Random rand = new Random();

		    // nextInt is normally exclusive of the top value,
		    // so add 1 to make it inclusive
		    int costeApuesta = rand.nextInt((120 - 5) + 1) + 5;
			
		String parsed =Integer.toString(costeApuesta);
		    
		    label1.setText(parsed);
		    
		    System.out.println("El string parsed:"+parsed);
		    System.out.println("Lo que hay en el campo de texto:"+label1.getText());
		    
		    ////////////////////////////////////////////////////////////////////////////////////////////////////////
		    
		    Random rand2 = new Random();

		    // nextInt is normally exclusive of the top value,
		    // so add 1 to make it inclusive
		    int costeApuesta2 = rand2.nextInt((120 - 5) + 1) + 5;
			
		String parsed2 =Integer.toString(costeApuesta2);
		    
		    label2.setText(parsed2);
		    
		    ////////////////////////////////////////////////////////////////////////////////////////////////////////
		    
		    Random rand3 = new Random();

		    // nextInt is normally exclusive of the top value,
		    // so add 1 to make it inclusive
		    int costeApuesta3 = rand3.nextInt((120 - 5) + 1) + 5;
			
		String parsed3 =Integer.toString(costeApuesta3);
		    
		    label3.setText(parsed3);
		    
 ////////////////////////////////////////////////////////////////////////////////////////////////////////
		    
		    Random rand4 = new Random();

		    // nextInt is normally exclusive of the top value,
		    // so add 1 to make it inclusive
		    int costeApuesta4 = rand4.nextInt((120 - 5) + 1) + 5;
			
		String parsed4 =Integer.toString(costeApuesta4);
		    
		    label4.setText(parsed4);
		    
 ////////////////////////////////////////////////////////////////////////////////////////////////////////
		    
		    Random rand5= new Random();

		    // nextInt is normally exclusive of the top value,
		    // so add 1 to make it inclusive
		    int costeApuesta5 = rand5.nextInt((120 - 5) + 1) + 5;
			
		String parsed5 =Integer.toString(costeApuesta5);
		    
		    label5.setText(parsed5);
		    
 ////////////////////////////////////////////////////////////////////////////////////////////////////////
		    
		    Random rand6 = new Random();

		    // nextInt is normally exclusive of the top value,
		    // so add 1 to make it inclusive
		    int costeApuesta6 = rand6.nextInt((120 - 5) + 1) + 5;
			
		String parsed6 =Integer.toString(costeApuesta6);
		    
		    label6dr.setText(parsed6);
		}
		
	}
	
	
	
	
}

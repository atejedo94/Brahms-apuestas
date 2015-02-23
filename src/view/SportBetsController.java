package view;

import java.net.URL;
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
		
		
		
	}
	
	
	
	
}

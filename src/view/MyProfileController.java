package view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class MyProfileController implements Initializable{

private Main main;
	
	public void setMain(Main main){
		this.main=main;
	}
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	@FXML
	private void onClickSportBets(){
		main.initSportBets();
	}
	
	@FXML
	private void onClickInvest(){
		main.initInvestments();
	}

	@FXML
	private void onClickMyProfile(){
		main.initMyProfile();
	}
	
	@FXML
	private void onClickOtherUsers(){
		main.initOtherUsers();
	}
	
	@FXML
	private void onClickLogOut(){
		main.setRoot();
	}
	
}

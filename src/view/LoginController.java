package view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class LoginController implements Initializable{
	
	private Main main;
	
	public void setMain(Main main){
		this.main=main;
	}

	@FXML
	private void login(){
		main.initSportBets();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}

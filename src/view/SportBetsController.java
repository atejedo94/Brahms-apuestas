package view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class SportBetsController implements Initializable{
	
	private Main main;
	
	public void setMain(Main main){
		this.main=main;
	}
	
	@FXML
	private void clickInvestments(){
		main.initInvestments();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	


	

}

package view;

import javafx.fxml.FXML;

public class buyInvestController {
	
	private Main main;
	
	public void setMain(Main main){
		this.main=main;
	}
	
	@FXML 
	private void onAccept(){
		main.initInvestments();
	}
	
	@FXML
	private void onCancel(){
		return;
	}

}

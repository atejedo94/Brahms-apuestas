package view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PayForBetController {
	
private Main main;
	
	public void setMain(Main main){
		this.main=main;
	}
	
	@FXML private void onClickAccept(){
		main.initSportBets();
	}
	
	@FXML private void onClickCancel(){
		main.initSportBets();
	}
	
	@FXML TextField apuesta;
	
	

}

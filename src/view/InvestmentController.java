package view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class InvestmentController implements Initializable{

private Main main;
	
	public void setMain(Main main){
		this.main=main;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
	private void onClickSportBets(){
		main.initSportBets();
	}
	
	@FXML
	private void onClickInvest(){
		main.initBuyInvest();
	}
	
}

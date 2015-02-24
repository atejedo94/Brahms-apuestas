package view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class MyProfileController implements Initializable {

	private Main main;

	public void setMain(Main main) {
		this.main = main;
	}

	@FXML Label usern;

	@FXML
	Label myEarns;

	@FXML
	Label myLosts;

	@FXML
	Label sbWons;

	@FXML
	Label sbLosts;

	public void loadEverything() {

		if (true) {
			usern.setText(RegisterController.user.getUser());

			String myEarnings = Integer.toString(RegisterController.user
					.getMyEarnings());
			myEarns.setText(myEarnings);
			
			String myLo = Integer.toString(RegisterController.user.getMyLosts());
			myLosts.setText(myLo);
			
			String sbWins = Integer.toString(RegisterController.user.getTimesIWon());
			sbWons.setText(sbWins);
			
			String sblost = Integer.toString(RegisterController.user.getTimesILost());
			sbLosts.setText(sblost);

		}

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	@FXML
	private void onClickSportBets() {
		main.initSportBets();
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

}

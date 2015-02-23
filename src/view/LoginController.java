package view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {

	RegisterController user;
	private Main main;

	public void setMain(Main main) {
		this.main = main;
	}

	@FXML
	private TextField username;

	@FXML
	private PasswordField password;

	@FXML
	Label infoLabel;

	@FXML
	private void login() {

		String usr = username.getText();
		String pw = password.getText();

		System.out.println(RegisterController.user.toString());

		if (usr.equals(RegisterController.user.getUser()) && pw.equals(RegisterController.user.getPassword())) {
			main.initSportBets();

		} else{
			infoLabel.setText("Usuario o contraseña incorrectos");
		}

	}

	@FXML
	public void onClickRegister() {
		main.initRegister();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
}

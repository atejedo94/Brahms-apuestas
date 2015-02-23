package view;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterController {

	public static User user = new User(0, 0, 0, 0, 0, null, null);
	Main main;

	@FXML
	private TextField username;

	@FXML
	private PasswordField password;

	public void setMain(Main main) {
		this.main = main;
	}

	@FXML
	public void onClickRegister() {
 

		user.setUser(username.getText());
		user.setPassword(password.getText());

//		System.out.println(user.toString());
		
		main.setRoot();

	}
}

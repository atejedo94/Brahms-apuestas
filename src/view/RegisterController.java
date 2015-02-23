package view;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterController {

	User user;
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

		User u1 = new User(0, 0, 0, 0, 0, null, null);
 

		u1.setUser(username.getText());
		u1.setPassword(password.getText());

		System.out.println(user.getUser());
		System.out.println(user.getPassword());

		main.setRoot();

	}
}

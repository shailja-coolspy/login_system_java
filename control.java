package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class control {

	@FXML
	private Label status;
	@FXML
	private TextField username;
	@FXML
	private PasswordField password;
	@FXML
	private Button login;
	
	public void Login(ActionEvent event) throws Exception {
		if(username.getText().equals("admin")&& password.getText().equals("admin") )
		{
			status.setText("Succesfully Loged In");
			Stage primaryStage= new Stage();
			Parent root= FXMLLoader.load(getClass().getResource("mainpage.fxml"));
			Scene scene = new Scene(root,700,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}else {
			status.setText("Login Failed");
		}
	}
	
	
	
	
	
}

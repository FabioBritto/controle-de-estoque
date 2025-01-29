package view.gui;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class LoginController implements Initializable{

	@FXML
	private GridPane fridPane;
	
	
	@FXML
	private TextField txtLogin;
	
	@FXML
	private TextField txtSenha;
	
	@FXML
	private Button btnEntrar;
	
	@FXML
	private Label lblEsqueciSenha;
	
	@FXML
	private Label lblCadastrar;
	
	public void onBtnEntrarAction() {
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//Stage stage = (Stage) Main.getMainScene().getWindow();
		//anchorPane.prefHeightProperty().bind(stage.heightProperty());
		
		
	}
}

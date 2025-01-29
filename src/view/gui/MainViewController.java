package view.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import view.gui.util.Alerts;

public class MainViewController implements Initializable {

	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}
	
	public static synchronized <T> void loadLoginView(FXMLLoader loader) {
		try {
			Pane newPane = loader.load();
			Scene scene = Main.getMainScene();
			
			
			AnchorPane mainPane = (AnchorPane) scene.getRoot();
			
			
			mainPane.getChildren().addAll(newPane.getChildren());
			
		}catch(IOException e) {
			Alerts.showAlert("ERRO", null, "Erro ao carregar login", AlertType.ERROR);
		}
	}

	
	
}

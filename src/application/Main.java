package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	private static Scene mainScene;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/gui/LoginView.fxml"));
			BorderPane anchorPane = loader.load();
			
			mainScene = new Scene(anchorPane);
			
			primaryStage.setScene(mainScene);
			primaryStage.setMaximized(true);
			//MainViewController.loadLoginView(new FXMLLoader(getClass().getResource("/view/gui/LoginView.fxml")));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static Scene getMainScene() {
		return mainScene;
	}
}

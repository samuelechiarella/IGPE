package tournament_interface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TournamentMenu extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/tournament_interface/TournamentMenu.fxml"));
		AnchorPane root = (AnchorPane) loader.load();
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Menù");
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}

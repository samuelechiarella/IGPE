package tournament_interface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ChangeWindowsApplication extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader1 = new FXMLLoader(getClass().getResource("/tournamentinterface/TournamentMenu.fxml"));
		FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/tournamentinterface/CreateTeam.fxml"));
		AnchorPane root1 = (AnchorPane) loader1.load();
		AnchorPane root2 = (AnchorPane) loader2.load();
		Scene scene = new Scene(root1,600,600);
		SceneHandler.init(scene);
		SceneHandler.add("window1",root1);
		SceneHandler.add("window2",root2);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}


}

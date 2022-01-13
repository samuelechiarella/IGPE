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
		FXMLLoader loader3 = new FXMLLoader(getClass().getResource("/tournamentinterface/CreateTournament.fxml"));
		FXMLLoader loader4 = new FXMLLoader(getClass().getResource("/tournamentinterface/myTeam.fxml"));
		AnchorPane root1 = (AnchorPane) loader1.load();
		AnchorPane root2 = (AnchorPane) loader2.load();
		AnchorPane root3 = (AnchorPane) loader3.load();
		AnchorPane root4 = (AnchorPane) loader4.load();
		Scene scene = new Scene(root1,600,600);
		scene.getStylesheets().add(getClass().getResource("/tournamentinterface/css/style.css").toExternalForm());
		SceneHandler.init(scene);
		SceneHandler.add("window1",root1);
		SceneHandler.add("window2",root2);
		SceneHandler.add("window3",root3);
		SceneHandler.add("window4",root4);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}


}

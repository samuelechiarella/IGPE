package tournament_interface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TournamentMenuController {

    @FXML
    private Button createTeamBtn;
    
    @FXML
    private Button findTournamentBtn;

    @FXML
    private Button createTournamentBtn;

    @FXML
    private Button myTournamentBtn;

    @FXML
    private Button myTeamBtn;

    @FXML
    void createTeam(ActionEvent event) {
    	SceneHandler.setCurrent("window2");
    }
    
    @FXML
    void FindTournament(ActionEvent event) {

    }
    @FXML
    void createTournament(ActionEvent event) {
    	SceneHandler.setCurrent("window3");
    }
    @FXML
    void myTeamWindow(ActionEvent event) {
    	SceneHandler.setCurrent("window4");
    }
    @FXML
    void myTournamentWindow(ActionEvent event) {

    }
}

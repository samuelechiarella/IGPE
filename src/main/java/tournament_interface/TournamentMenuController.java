package tournament_interface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TournamentMenuController {

    @FXML
    private Button createTeamBtn;

    @FXML
    void createTeam(ActionEvent event) {
    	SceneHandler.setCurrent("window2");
    }
}
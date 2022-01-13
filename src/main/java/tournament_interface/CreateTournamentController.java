package tournament_interface;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

public class CreateTournamentController {

    @FXML
    private Button applyBtnCreate;

    @FXML
    private ChoiceBox<String> tournamentCategory;

  
    @FXML
    private TextField nameTournamentTxt;

    @FXML
    private ImageView logoImg;

    @FXML
    private Button logoBtn;

    @FXML
    private Button backBtn;

    @FXML
    private TextArea descrizioneTxt;
    
    
    @FXML
    void initialize() {
    	descrizioneTxt.setText("");
    	nameTournamentTxt.setText("");
    	File file = new File("/TournamentStateInnovation/src/main/resources/noLogo.png");
        Image image = new Image(file.getName());
        logoImg.setImage(image);
        //tournamentCategory.getItems().add(0,"3v3");
        //tournamentCategory.getItems().add(1,"5v5");
        
    }
    
    @FXML
    void categoryAction(ActionEvent event) {
    	tournamentCategory.getItems().add(0,"3v3");
        tournamentCategory.getItems().add(1,"5v5");
    	
    }
    @FXML
    void applyTournament(ActionEvent event) {
    //nuovo torneo più eccezioni
    	initialize();
    }
    @FXML
    void logoChoose(ActionEvent event) {
		
    	FileChooser fileChooser = new FileChooser();
    	
		File selectedFile = fileChooser.showOpenDialog(null);
		if (selectedFile != null)
		{
			selectedFile.getName();
			Image image = new Image(selectedFile.toURI().toString());
			logoImg.setImage(image);
		}else {
			System.out.println("file is not valid");
		}
    }

    @FXML
    void backAction(ActionEvent event) {
    	initialize();
    	SceneHandler.setCurrent("window1");
    }
}

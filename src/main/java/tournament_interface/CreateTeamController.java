package tournament_interface;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Window;
import tournament_object.Team;

public class CreateTeamController {

    @FXML
    private Button logo;
    
    @FXML
    private ImageView logoImg;
    
    @FXML
    private Button applyBtn;
    
    @FXML
    private TextField nameTeamTxt;
    
    @FXML
    private Button backBtn;
    
    @FXML
    private TextField descrizioneTxt;

    @FXML
    void apply(ActionEvent event)  {
    	try {
    		System.out.println(nameTeamTxt.getText());
			if (!(nameTeamTxt.getText().isEmpty()))
			{
				new Team(logoImg.getImage(),nameTeamTxt.getText(),descrizioneTxt.getText(),"nome capo");
				initialize();
				
				SceneHandler.setCurrent("window1");
			}
			
		} catch (Exception e) {
			 JOptionPane.showMessageDialog(null, "There's a bug on you!",
				      "Hey!", JOptionPane.ERROR_MESSAGE);

		}
    	
    }
    @FXML
    void initialize() {
    	descrizioneTxt.setText("");
    	nameTeamTxt.setText("");
    	File file = new File("/TournamentStateInnovation/src/main/resources/noLogo.png");
        Image image = new Image(file.getName());
        logoImg.setImage(image);;
    }

    @FXML
    void selectLogo(ActionEvent event) {
    		
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



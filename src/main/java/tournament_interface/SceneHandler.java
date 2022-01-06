package tournament_interface;

import java.util.HashMap;

import javafx.scene.Scene;

import javafx.scene.layout.Pane;

public class SceneHandler {
	private static Scene main;
	private static HashMap<String,Pane> allWindows = new HashMap<String,Pane>();
	public static void add(String name, Pane pane) {
		// TODO Auto-generated method stub
		allWindows.put(name, pane);
		
	}

	public static void init(Scene m) {
		// TODO Auto-generated method stub
		main = m;
	}
	public static void setCurrent(String name)
	{
		main.setRoot(allWindows.get(name));
	}

}

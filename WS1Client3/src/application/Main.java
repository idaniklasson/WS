package application;
	

import java.util.HashMap;

import controller.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import se.lu.ics.grupp14.*;


public class Main extends Application {
	private Stage primaryStage;
	private HashMap<Pages, String> resources = new HashMap<>();
	
	public enum Pages {
		HOME, FILEVIEW, SHOWDATA
	}
	
	public Main() {
		resources.put(Pages.HOME, "/view/MainMenuView.fxml");
		resources.put(Pages.FILEVIEW, "/view/FileView.fxml");
		resources.put(Pages.SHOWDATA, "/view/ShowData.fxml");
	}
	
	//Runs after constructor
	@Override
	public void start(Stage primaryStage) {

		this.primaryStage = primaryStage;
		try {
			this.navigate(Pages.HOME);
			primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	public void navigate(Pages pageName) throws Exception {

		String resource = this.resources.get(pageName);
		FXMLLoader loader = new FXMLLoader(getClass().getResource(resource));
		Parent pane = loader.load();
		Scene scene = new Scene(pane, 550, 500);
		this.primaryStage.setScene(scene);

		switch (pageName) {
			case HOME:
				Controller controller = loader.getController();
				controller.setMain(this);
				break;
			case FILEVIEW:
				FileViewController controllerfile = loader.getController();
				controllerfile.setMain(this);
				break;
			case SHOWDATA:
				Controller controllerdata = loader.getController();
				controllerdata.setMain(this);
				break;
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
		
	}
}

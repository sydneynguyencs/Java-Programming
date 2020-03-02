package ch.zhaw.prog2.fxmlcalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
/**
 * Basisapplikation zum erweitern:
 * - Benötigt wird ein MainWindow.fxml
 * - Benötigt wird eine Klasse für den Controller (Name frei)
 * @author bles
 * @version 1.0
 */
public class Main extends Application {

	private Stage primaryStage;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		mainWindow();
	}

	private void mainWindow() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
			Pane rootPane = loader.load();
            // Todo: fill in scene and stage setup

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}


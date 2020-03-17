package ch.zhaw.prog2.calculator;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.InputEvent;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

	private Stage primaryStage;
    private final double row1 = 20;
    private final double row2 = 50;
    private final double row3 = 80;
    private final double row4 = 110;
    private final double row5 = 140;
    private final double row6 = 170;
    private final double row7 = 200;
    private final double row8 = 230;
    private final double column1 = 20;
    private final double column2 = 100;


    public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		mainWindow();
	}

	private void mainWindow() {
		try {
			BorderPane rootPane = new BorderPane();
			//BorderPane top
	        MenuBar menuBar = new MenuBar();

			// Create scene with root node with size
			Scene scene = new Scene(rootPane, 600, 400);
			scene.getStylesheets().add(getClass().getResource("MyLabel.css").toExternalForm());
			primaryStage.setMinWidth(280);
			// Set stage properties
			primaryStage.setTitle("Return on Investment Calculator");
			// Add scene to the stage and make it visible
			primaryStage.setScene(scene);
			primaryStage.show();

            Label labelInitialAmount = new Label("Inital Amount");
            Label labelReturnRate = new Label("Return rate in %");
            Label labelAnnualCost = new Label("Annual cost");
            Label labelNumOfYears = new Label("Number of years");
            Label labelRes = new Label("Results:\\n");
            Button btnCalculate = new Button("Calculate");
            Button btnOk = new Button("Close");
            ComboBox<Integer> comboBoxInitialAmount = new ComboBox<>();
            ComboBox<Integer> comboBoxReturnRate = new ComboBox<>();
            ComboBox<Integer> comboBoxAnnualCost = new ComboBox<>();
            ComboBox<Integer> comboBoxNumOfYears = new ComboBox<>();
            ComboBox<Integer> comboBoxRes = new ComboBox<>();
            Pane pane = new Pane();


            //set control positions
            labelInitialAmount.setLayoutX(column1);
            labelInitialAmount.setLayoutY(row1);
            labelRes.setPrefSize(20, 80);
            labelRes.setMaxSize(200, 100);

            //Create root node
            Group root = new Group();
            //Add label to the scene graph
            root.getChildren().add(labelInitialAmount);



        } catch(Exception e) {
			e.printStackTrace();
		}
	}


}


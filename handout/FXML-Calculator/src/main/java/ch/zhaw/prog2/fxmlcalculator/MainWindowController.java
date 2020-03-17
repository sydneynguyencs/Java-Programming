package ch.zhaw.prog2.fxmlcalculator;


import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.awt.*;

/**
 * Controller für das MainWindow. Pro Maske (oder FXML-Datei) ein Controller
 * Enthält alles, was der Controller im View erreichen muss (Steuerelemente)
 * und alle Methoden, welche die View auf Grund von Ereignissen aufruft.
 * @author bles
 * @version 1.0
 */
public class MainWindowController {
    @FXML private Label viewText;
    @FXML private TextField inputText;

    @FXML
    public void handleChange(){
        viewText.setText(inputText.getText());
    }
    @FXML
    public void handleClear(){
        inputText.setText("");
    }




}

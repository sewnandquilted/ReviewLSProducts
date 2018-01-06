package application;

import java.io.File;

import javafx.application.Preloader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

public class cashRegisterController extends Preloader {

	@FXML
	private Label directoryLabel;

	@FXML
	private Button scanDirectory;

	public void start(Stage primaryStage) throws Exception {
		directoryLabel.setText("no directory yet selected");
	}

	@FXML
	void scanDirectory(ActionEvent event) {
		Main.processDirectory(directoryLabel.getText());
	}

	@FXML
	void selectDirectory(ActionEvent event) {
		DirectoryChooser directoryChooser = new DirectoryChooser();
		File selectedDirectory = directoryChooser.showDialog(null);

		if (selectedDirectory == null) {
			directoryLabel.setText("No Directory selected");
		} else {
			directoryLabel.setText(selectedDirectory.getAbsolutePath());
		}
	}

}

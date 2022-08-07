package customer.Main;


import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("main.fxml"));
			root.getChildren().add(new Button("New Button"));
			Scene scene = new Scene(root, 500, 500);
			//scene.getStylesheet().add(getClass().getResource(PATH)) Stil dosyasını ekliyoruz..
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}

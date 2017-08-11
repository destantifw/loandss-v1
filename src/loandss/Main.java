package loandss;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
//import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
//import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	private Stage primaryStage; 
	private BorderPane mainLayout;

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Loan Decision System");
		showMainView();
	}
	
	 class Controller {
	       @FXML  // <== perhaps you had this missing??
	       void knn(MouseEvent event) throws Exception {
	    		System.out.println("hai");
	    		KNN knnC = new KNN();
	    		knnC.start();
	    	}
	    }
	
	public void showMainView() throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainView.fxml"));
		loader.setController(new Controller());
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
		
	
	
	public static void main(String[] args) {	
		launch(args);
	}
}

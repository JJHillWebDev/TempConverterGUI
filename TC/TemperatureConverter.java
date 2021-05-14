import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
   This is the main application class for the
   Temperature Converter JavaFX application.

   @author Jeremy Hill
   @version 1.8.0_271
 */
public class TemperatureConverter extends Application
{
	/**
    * The start method takes a Stage object as an argument.
    * It also loads the TemperatureConverter fxml file, displays
    * it in a new scene and gives the scene a title.
    * @param stage Stage object to display scene
    */
	public void start(Stage stage) throws Exception
	{
		// Load the FXML file.
		Parent parent = FXMLLoader.load(
		getClass().getResource("TemperatureConverter.fxml"));

		// Build the scene graph.
		Scene scene = new Scene(parent);

		// Display our window, using the scene graph.
		stage.setTitle("Temperature Converter");
		stage.setScene(scene);
		stage.show();
	}

	/**
    * The main method calls the Application class launch
    * @param args the command line arguments
    */
	public static void main(String[] args)
	{	
		// Launch the application.
		launch(args);
	}
}
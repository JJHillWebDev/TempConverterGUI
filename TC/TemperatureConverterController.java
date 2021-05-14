import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
   This is the controller class for the
   Temperature Converter JavaFX application.

   @author Jeremy Hill
   @version 1.8.0_271
 */
public class TemperatureConverterController 
{
    @FXML
    private Label promptLabel;

    @FXML
    private TextField temperatureTextField;

    @FXML
    private Label outputLabel;

    @FXML
    private Button fahrenheitButton;

    @FXML
    private Button celsiusButton;

    // Event listener for the Fahrenheit Converter Button
    public void convertButtonListenerFahrenheit()
    {
        final double CONVERSION_FACTOR = 1.8;

        String str = temperatureTextField.getText();
        double newTemp = Double.parseDouble(str) * CONVERSION_FACTOR + 32;

        outputLabel.setText("The Fahrenheit temperature is " + 
                             String.format("%.2f", newTemp) + " degrees.");
    }

    // Event listener for the Celsius Converter Button
    public void convertButtonListenerCelsius()
    {
        final double CONVERSION_FACTOR = .5555555556;

        String str = temperatureTextField.getText();
        double newTemp = (Double.parseDouble(str) - 32) * CONVERSION_FACTOR;

        outputLabel.setText("The Celsius temperature is " + 
                             String.format("%.2f", newTemp)  + " degrees.");
    }

}

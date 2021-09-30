
package pra03.credito;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;


public class CreditoViewController implements Initializable {

    @FXML
    private ToggleGroup tgIngresos;
    @FXML
    private ToggleGroup tgNegocio;
    @FXML
    private ToggleGroup tgProducto;
    @FXML
    private Button btnCalcular;
    @FXML
    private RadioButton rbRango1;
    @FXML
    private RadioButton rbRango2;
    @FXML
    private RadioButton rbRango3;
    @FXML
    private RadioButton rbRango4;
    @FXML
    private RadioButton rbFijo;
    @FXML
    private RadioButton rbVtaDirecta;
    @FXML
    private RadioButton rbSemifijo;
    @FXML
    private RadioButton rbMovil;
    @FXML
    private RadioButton rbModa;
    @FXML
    private RadioButton rbAbarrotes;
    @FXML
    private RadioButton rbAlimentos;
    @FXML
    private RadioButton rbLimpieza;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void calcularCredito(ActionEvent event) {
    }
    
}

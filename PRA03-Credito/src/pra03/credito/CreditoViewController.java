package pra03.credito;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
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
    @FXML
    private TextField tfImporte;
    @FXML
    private TextField tfPlazo;
    @FXML
    private TextField tfPago;
    
    private int montoImporte = 0;
    private int mesesPlazo = 0;
    private double interes = 0;
    private double pagoMensual = 0;
    DecimalFormat df = new DecimalFormat("#.##");

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void calcularCredito(ActionEvent event) {
        obtenerPrestamo();
        obtenerPlazo();
        obtenerPagoMensual();
        System.out.println(montoImporte);
        System.out.println(mesesPlazo);
        System.out.println(interes);
    }
    
    private int obtenerNegocio(){
        int tipoNegocio = 0;
        if(rbFijo.isSelected()){
            tipoNegocio = 1;
        }else if(rbVtaDirecta.isSelected()){
            tipoNegocio = 2;
        }else if(rbSemifijo.isSelected()){
            tipoNegocio = 3;
        }else if(rbMovil.isSelected()){
            tipoNegocio = 4;
        }
        return tipoNegocio;
    }
    
    private int obtenerProducto(){
        int tipoProducto = 0;
        if(rbModa.isSelected()){
            tipoProducto = 1;
        }else if(rbAbarrotes.isSelected()){
            tipoProducto = 2;
        }else if(rbAlimentos.isSelected()){
            tipoProducto = 3;
        }else if(rbLimpieza.isSelected()){
            tipoProducto = 4;
        }
        return tipoProducto;
    }
    
    private int obtenerIngresos(){
        int tipoIngresos = 0;
        if(rbRango1.isSelected()){
            tipoIngresos = 1;
        }else if(rbRango2.isSelected()){
            tipoIngresos = 2;
        }else if(rbRango3.isSelected()){
            tipoIngresos = 3;
        }else if(rbRango4.isSelected()){
            tipoIngresos = 4;
        }
        return tipoIngresos;
    }
    
    private void obtenerPrestamo(){
        int tipoNegocio = obtenerNegocio();
        int tipoProducto = obtenerProducto();
        
        switch(tipoNegocio){
            case 1:
                switch(tipoProducto){
                    case 1:
                        montoImporte = 100000;
                        tfImporte.setText("$100,000");
                        break;
                    case 2:
                        montoImporte = 100000;
                        tfImporte.setText("$100,000");
                        break;
                    case 3:
                        montoImporte = 50000;
                        tfImporte.setText("$50,000");
                        break;
                    case 4:
                        montoImporte = 100000;
                        tfImporte.setText("$100,000");
                        break;
                }
                break;
            case 2:
                switch(tipoProducto){
                    case 1:
                        montoImporte = 50000;
                        tfImporte.setText("$50,000");
                        break;
                    case 2:
                        montoImporte = 100000;
                        tfImporte.setText("$100,000");
                        break;
                    case 3:
                        montoImporte = 50000;
                        tfImporte.setText("$50,000");
                        break;
                    case 4:
                        montoImporte = 100000;
                        tfImporte.setText("$100,000");
                        break;
                }
                break;
            case 3:
                switch(tipoProducto){
                    case 1:
                        montoImporte = 25000;
                        tfImporte.setText("$25,000");
                        break;
                    case 2:
                        montoImporte = 75000;
                        tfImporte.setText("$75,000");
                        break;
                    case 3:
                        montoImporte = 50000;
                        tfImporte.setText("$50,000");
                        break;
                    case 4:
                        montoImporte = 75000;
                        tfImporte.setText("$75,000");
                        break;
                }
                break;
            case 4:
                switch(tipoProducto){
                    case 1:
                        montoImporte = 25000;
                        tfImporte.setText("$25,000");
                        break;
                    case 2:
                        montoImporte = 75000;
                        tfImporte.setText("$75,000");
                        break;
                    case 3:
                        montoImporte = 50000;
                        tfImporte.setText("$50,000");
                        break;
                    case 4:
                        montoImporte = 75000;
                        tfImporte.setText("$75,000");
                        break;
                }
                break;
        }
    }
    
    private void obtenerPlazo(){
        int tipoVentas = obtenerIngresos();
        switch(tipoVentas){
            case 1:
                mesesPlazo = 36;
                interes = 0.12;
                tfPlazo.setText("3 años");
                break;
            case 2:
                mesesPlazo = 24;
                interes = 0.12;
                tfPlazo.setText("2 años");
                break;
            case 3:
                mesesPlazo = 24;
                interes = 0.14;
                tfPlazo.setText("2 años");
                break;
            case 4:
                mesesPlazo = 12;
                interes = 0.12;
                tfPlazo.setText("1 año");
                break;
        }
    }
    
    private void obtenerPagoMensual(){
        pagoMensual = (montoImporte + (montoImporte * interes))/mesesPlazo;
        tfPago.setText("$"+df.format(pagoMensual));
    }
    
}

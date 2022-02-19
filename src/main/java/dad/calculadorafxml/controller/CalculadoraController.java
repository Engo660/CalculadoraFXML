package dad.calculadorafxml.controller;

import dad.calculadorafxml.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CalculadoraController implements Initializable {

	Calculadora calculo = new Calculadora();
	
	@FXML
    private Button cButton;

    @FXML
    private TextField calculoText;

    @FXML
    private Button ceButton;

    @FXML
    private Button ceroButton;

    @FXML
    private Button cincoButton;

    @FXML
    private Button comaButton;

    @FXML
    private Button cuatroButton;

    @FXML
    private Button dividirButton;

    @FXML
    private Button dosButton;

    @FXML
    private Button igualButton;

    @FXML
    private Button multiButton;

    @FXML
    private Button nueveButton;

    @FXML
    private Button ochoButton;

    @FXML
    private Button restarButton;

    @FXML
    private Button seisButton;

    @FXML
    private Button sieteButton;

    @FXML
    private Button sumaButton;

    @FXML
    private Button tresButton;

    @FXML
    private Button unoButton;
    
    @FXML
    private MenuItem modernoItem;
    
    @FXML
    private MenuItem normalItem;
    
    @FXML
    private MenuItem clasicoItem;

    @FXML
    private GridPane view;

	public CalculadoraController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraFXMLView.fxml"));
		loader.setController(this);
		loader.load();
	}

	public void initialize(URL location, ResourceBundle resources) {
		calculoText.setText(calculo.getPantalla());
	}

	public GridPane getView() {
		return view;
	}

	@FXML
	void onBorrarAction(ActionEvent event) {
		calculo.borrar();
		calculoText.setText(calculo.getPantalla());
	}
	
	@FXML
	void onNumeroAction(ActionEvent event) {
		if (event.getSource() == ceroButton) {
			calculo.insertar('0');
		}
		if (event.getSource() == unoButton) {
			calculo.insertar('1');
		}
		if (event.getSource() == dosButton) {
			calculo.insertar('2');
		}
		if (event.getSource() == tresButton) {
			calculo.insertar('3');
		}
		if (event.getSource() == cuatroButton) {
			calculo.insertar('4');
		}
		if (event.getSource() == cincoButton) {
			calculo.insertar('5');
		}
		if (event.getSource() == seisButton) {
			calculo.insertar('6');
		}
		if (event.getSource() == sieteButton) {
			calculo.insertar('7');
		}
		if (event.getSource() == ochoButton) {
			calculo.insertar('8');
		}
		if (event.getSource() == nueveButton) {
			calculo.insertar('9');
		}
		calculoText.setText(calculo.getPantalla());
	}
	
	@FXML
	void onOperandoAction(ActionEvent event) {
		if (event.getSource() == sumaButton) {
			calculo.operar(Calculadora.SUMAR);
		}
		if (event.getSource() == restarButton) {
			calculo.operar(Calculadora.RESTAR);
		}
		if (event.getSource() == multiButton) {
			calculo.operar(Calculadora.MULTIPLICAR);
		}
		if (event.getSource() == dividirButton) {
			calculo.operar(Calculadora.DIVIDIR);
		}
		if (event.getSource() == igualButton) {
			calculo.operar(Calculadora.IGUAL);
		}
		if (event.getSource() == comaButton) {
			calculo.insertarComa();
		}
		calculoText.setText(calculo.getPantalla());
	}
	
	@FXML
	void onNormalStyleAction(ActionEvent event) {
		view.getStylesheets().clear();
	}
	
	@FXML
	void onClasicoStyleAction(ActionEvent event) {
		view.getStylesheets().clear();
		view.getStylesheets().add(getClass().getResource("/css/Clasico.css").toExternalForm());
	}
	
	@FXML
	void onModernoStyleAction(ActionEvent event) {
		view.getStylesheets().clear();
		view.getStylesheets().add(getClass().getResource("/css/Moderno.css").toExternalForm());
	}

}

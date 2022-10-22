package co.edu.poli.parkingproyect.controller;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.poli.parkingproyect.model.Registro;
import co.edu.poli.parkingproyect.model.Registro_ingreso;
import co.edu.poli.parkingproyect.model.Registro_salida;
import co.edu.poli.parkingproyect.model.Registro_tarifa;

public class MainSceneController {
	@FXML
	private Label Lbienvenida1;
	@FXML
	private Label Lbienvenida2;
	@FXML
	private Label Lbienvenida3;
	@FXML
	private Label Lbienvenida5;
	@FXML
	private Label Lbienvenida6;
	@FXML
	private Label Lbienvenida7;
	@FXML
	private Label Lbienvenida4;
	@FXML
	private Label Lbienvenida8;
	@FXML
	private Label Lingreso2;
	@FXML
	private TextField TFingresoNombre;
	@FXML
	private TextField TFingresoApellido;
	@FXML
	private TextField TFingresoPlaca;
	@FXML
	private TextField TFingresoHora;
	@FXML
	private Label Lingreso3;
	@FXML
	private Button Botonregistrar;
	@FXML
	private Label Lingreso5;
	@FXML
	private Label Lingreso;
	@FXML
	private Label Lsalida1;
	@FXML
	private Label Lsalida2;
	@FXML
	private TextField TFsalidaPlaca;
	@FXML
	private Label Lsalida3;
	@FXML
	private TextField TFsalidaHora;
	@FXML
	private Button BotonTarifa;
	@FXML
	private Button BotonSalida;
	@FXML
	private Label Lsalida4;
	@FXML
	private TextField TFsalidaFacturaPlaca;
	@FXML
	private TextField TFsalidaHoraingreso;
	@FXML
	private TextField TFsalidaHorasalida;
	@FXML
	private TextField TFsalidaTarifa;
	@FXML
	private Label Lsalida5;
	@FXML
	private TableView TableRegistros;
	@FXML
	private TableColumn RegistroPlaca;
	@FXML
	private TableColumn RegistroNombre;
	@FXML
	private TableColumn RegistroHora;
	@FXML
	private Label Lregistros1;

	// Event Listener on Button[#BotonRegistrar].onAction
	// IMPLEMENTACION DE LA ACCION PARA EL BOTON REGISTRAR
	@FXML
	public void BotonRegistrar(ActionEvent event) throws ClassNotFoundException {
		Registro registro1 = new Registro_ingreso();
		registro1.Registrar(TFingresoNombre.getText(), TFingresoApellido.getText(), TFingresoPlaca.getText(), TFingresoHora.getText());
		String placa1 = TFingresoPlaca.getText();
		
		
	}
	// Event Listener on Button[#BotonTarifa].onAction
	// IMPLEMENTACION DE LA ACCION PARA EL BOTON CALCULAR TARIFA
	@FXML
	public void BotonTarifa(ActionEvent event) throws ClassNotFoundException {
		Registro registro1 = new Registro_tarifa();
		registro1.Registrar(null, null, TFsalidaPlaca.getText(), TFsalidaHora.getText());
		
	}
	// Event Listener on Button[#BotonSalida].onAction
	// IMPLEMENTACION DE LA ACCION PARA EL BOTON VALIDAR SALIDA
	@FXML
	public void BotonValidarsalida(ActionEvent event) throws ClassNotFoundException {
		Registro registro1 = new Registro_salida();
		registro1.Registrar(null, null, TFsalidaPlaca.getText(), null);
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Datos.BDA;
import Modelo.Comunidad;
import Modelo.Parque;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author daw
 */
public class FXMLDocumentController implements Initializable {

    BDA bda = new BDA();
    private int idComunidad;
    private ObservableList<Parque> listaParques;
    private Label label;
    @FXML
    private Label LableConectado;
    @FXML
    private Label LabelDesconectado;
    @FXML
    private Label LabelCodCom;
    @FXML
    private TextField TextFieldCodCom;
    @FXML
    private Button ButtonVerParuqes;
    @FXML
    private Label LabelParque;
    @FXML
    private TableView<Parque> TableViewParques;
    @FXML
    private TableColumn<Parque, Integer> TableColumID;
    @FXML
    private TableColumn<Parque, String> TableColumnNombre;
    @FXML
    private TableColumn<Parque, Integer> TableColumnExtension;
    @FXML
    private TableColumn<Parque, Integer> TableColumnIDCiudad;
    @FXML
    private Label LabelTotalParques;
    
    private void handleButtonAction(ActionEvent event) {
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (bda.conexion() == true) {
            this.LabelDesconectado.setText("");
        } else {
            this.LableConectado.setText("");
        }
        
    }    
    
    @FXML
    private void ActionButtonVerParques(ActionEvent event){
        idComunidad = Integer.valueOf(this.TextFieldCodCom.getText());
        List<Parque> lista = bda.buscarParques(idComunidad);
        listaParques = FXCollections.observableArrayList(lista);
        TableViewParques.setItems(listaParques);
        TableColumID.setCellValueFactory(new PropertyValueFactory<>("id"));
        TableColumnNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        TableColumnExtension.setCellValueFactory(new PropertyValueFactory<>("extension"));
        TableColumnIDCiudad.setCellValueFactory(new PropertyValueFactory<>("idComunidad"));
        LabelTotalParques.setText(""+listaParques.size());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Datos.BDA;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author daw
 */
public class FXMLDocumentController implements Initializable {
    BDA bda = new BDA();
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
    private TableView<?> TableViewParques;
    @FXML
    private TableColumn<?, ?> TableColumID;
    @FXML
    private TableColumn<?, ?> TableColumnNombre;
    @FXML
    private TableColumn<?, ?> TableColumnExtension;
    @FXML
    private TableColumn<?, ?> TableColumnIDCiudad;
    
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
    private void ActionButtonVerParques(ActionEvent event) {
    }
    
}

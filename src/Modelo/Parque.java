package Modelo;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/* @author Álvaro García Fernández */
public class Parque {

    private final IntegerProperty id;
    private final StringProperty nombre;
    private final IntegerProperty extension;
    private final IntegerProperty idParque;

    public Parque(int nId,String nombrePar,int extensionPar,int nidParque) {
        this.id=new SimpleIntegerProperty(nId);
        this.nombre=new SimpleStringProperty(nombrePar);
        this.extension = new SimpleIntegerProperty(extensionPar);
        this.idParque = new SimpleIntegerProperty(nidParque);   
    }

    public int getId() {
        return id.get();
    }

    public void setId(int value) {
        id.set(value);
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public String getNombre() {
        return nombre.get();
    }

    public void setNombre(String value) {
        nombre.set(value);
    }

    private StringProperty nombreProperty() {
        return nombre;
    }

    public int getExtension() {
        return extension.get();
    }

    public void setExtension(int value) {
        extension.set(value);
    }

    public IntegerProperty extensionProperty() {
        return extension;
    }

    public int getIdParque() {
        return idParque.get();
    }

    public void setIdParque(int value) {
        idParque.set(value);
    }

    public IntegerProperty idParqueProperty() {
        return idParque;
    }

}

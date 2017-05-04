
package Modelo;
/* @author Álvaro García Fernández */
public class Parque {
    private int id;
    private String nombre;
    private int extension;
    private int idParque;

    public Parque(int id, String nombre, int extension, int idParque) {
        this.id = id;
        this.nombre = nombre;
        this.extension = extension;
        this.idParque = idParque;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public void setIdParque(int idParque) {
        this.idParque = idParque;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getExtension() {
        return extension;
    }

    public int getIdParque() {
        return idParque;
    }

    @Override
    public String toString() {
        return nombre.toUpperCase();
    }
    
}


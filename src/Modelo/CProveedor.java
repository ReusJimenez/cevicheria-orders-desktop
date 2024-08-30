
package Modelo;

public class CProveedor extends CPersona {
    private int telefono;
    private int id;
    public CIngredientes ingr;

    public CProveedor() {
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
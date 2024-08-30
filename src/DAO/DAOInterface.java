
package DAO;

public interface DAOInterface<T> {
    public boolean registrar(T objeto);
    public boolean modificar(T objeto);
    public boolean eliminar(T objeto);
    public boolean buscar(T objeto);
}

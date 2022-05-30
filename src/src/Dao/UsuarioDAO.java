package Dao;
import java.util.List;

public interface UsuarioDAO {
    public boolean registrar(Usuario Usuario);
    public List<Usuario> obtener();
    public boolean actualizar(Usuario Usuario);
    public boolean eliminar(Usuario Usuario);
}

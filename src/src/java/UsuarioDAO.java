package java;
import java.util.List;
import java.Usuario;

public interface UsuarioDAO {
    public boolean registrar(Usuario Usuario);
    public List<Usuario> obtener();
    public boolean actualizar(Usuario Usuario);
    public boolean eliminar(Usuario Usuario);
}

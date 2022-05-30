package Dao;

import java.util.List;

public interface FacturaDAO {
    public boolean registrar(Factura Factura);
    public List<Factura> obtener();
    public boolean actualizar(Factura Factura);
    public boolean eliminar(Factura Factura);
}

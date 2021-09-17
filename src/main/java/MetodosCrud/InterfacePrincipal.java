
package MetodosCrud;

import Modelos.ModeloPrincipal;
import java.util.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carrillo
 */
public interface InterfacePrincipal {
     
     public boolean registrar(ModeloPrincipal modelo);
     public void obtener(JTable contenedor);
     public boolean actualizar(ModeloPrincipal modelo);
     public boolean eliminar(ModeloPrincipal modelo);
    
}

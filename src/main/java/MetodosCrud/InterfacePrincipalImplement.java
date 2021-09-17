
package MetodosCrud;

import Conexion.ClsConexion;
import Modelos.ModeloPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carrillo
 */
public class InterfacePrincipalImplement implements InterfacePrincipal {

     ModeloPrincipal ag = new ModeloPrincipal();
    private int marzo;
    private int enero;
    private int febrero;
    private int promedio;
     
     
     @Override
     public boolean registrar(ModeloPrincipal modelo) {
          Connection conn = null;
          PreparedStatement stmt = null;
          boolean correcto = false;

          String Insert = "Insert into nuevatb (nombre, enero, febrero, marzo, total, promedio) values                         (?,?,?,?,?,?)";

          try {
               conn = ClsConexion.OpenConection();
               stmt = conn.prepareStatement(Insert);

               stmt.setString(1, modelo.getNombre());
               stmt.setInt(2, modelo.getEnero());
               stmt.setInt(3, modelo.getFebrero());
               stmt.setInt(4, modelo.getMarzo());
               stmt.setInt(5, modelo.getTotal());
               stmt.setInt(6, modelo.getPromedio());
               stmt.execute();

               correcto = true;
          } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex + "No se Insertaron tus datos");
          } finally {
               ClsConexion.CloseConection(stmt);
               ClsConexion.CloseConection(conn);

          }
          return correcto;
     }

     public void obtener(JTable contenedor) {

 InterfacePrincipalImplement metodos = new InterfacePrincipalImplement();
          DefaultTableModel modelo = new DefaultTableModel();

          modelo.addColumn("Codigo");
          modelo.addColumn("Nombre");
          modelo.addColumn("Enero");
          modelo.addColumn("Febrero");
          modelo.addColumn("Marzo");
          modelo.addColumn("Total");
          modelo.addColumn("Promedio");

          Connection conn = null;
          PreparedStatement stmt = null;
          ResultSet rs = null;

          String sql = "select *from  nuevatb order by Codigo";
          List<ModeloPrincipal> milista = new ArrayList<ModeloPrincipal>();

          try {
               conn = ClsConexion.OpenConection();
               stmt = conn.prepareStatement(sql);
               rs = stmt.executeQuery();

               while (rs.next()) {
                    ag.setCodigo(rs.getInt(1));
                    ag.setNombre(rs.getString(2));
                    ag.setEnero(rs.getInt(3));
                    ag.setFebrero(rs.getInt(4));
                    ag.setMarzo(rs.getInt(5));
                    ag.setTotal(rs.getInt(6));
                    ag.setPromedio(rs.getInt(7));
                    milista.add(ag);

               
                    String v[] = new String[7];
                   
                    for (int i = 0; i < milista.size(); i++) {
                    v[0] = String.valueOf(ag.getCodigo());
                    v[1] = ag.getNombre();
                    v[2] = String.valueOf(ag.getEnero());
                    v[3] = String.valueOf(ag.getFebrero());
                    v[4] = String.valueOf(ag.getMarzo());
                    v[5] = String.valueOf(ag.getTotal());
                    v[6] = String.valueOf(ag.getPromedio());
                    
               }
                    modelo.addRow(v);
               }
               contenedor.setModel(modelo);

          } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex + "No se pudo desplegar tu informacion");
          } finally {
               ClsConexion.CloseConection(stmt);
               ClsConexion.CloseConection(conn);
               ClsConexion.CloseConection(rs);
          }
     }

     @Override
      public boolean actualizar(ModeloPrincipal modelo) {
          Connection conn = null;
          PreparedStatement stmt = null;
          boolean actualizar = false;

          String sql = "Update nuevatb set nombre =?, enero=?, febrero=?, marzo=?, total=?, promedio=? where Codigo=?";
          try {
               conn = ClsConexion.OpenConection();
               stmt = conn.prepareStatement(sql);
               stmt.setString(1, modelo.getNombre());
               stmt.setInt(2, modelo.getEnero());
               stmt.setInt(3, modelo.getFebrero());
               stmt.setInt(4, modelo.getMarzo());
               stmt.setInt(5, modelo.getTotal());
               stmt.setInt(6, modelo.getPromedio());
               stmt.setInt(7, modelo.getCodigo());
               stmt.execute();
               actualizar = true;

          } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex + "No se pudo actualizar lo que querias");
          } finally {
               ClsConexion.CloseConection(stmt);
               ClsConexion.CloseConection(conn);
          }
          return actualizar;
     }
     @Override
     public boolean eliminar(ModeloPrincipal modelo) {
          Connection conn = null;
          PreparedStatement stmt = null;
          boolean eliminar = false;

          String sql = "delete from  nuevatb where Codigo=?";

          try {
               conn = ClsConexion.OpenConection();
               stmt = conn.prepareStatement(sql);
               stmt.setInt(1, modelo.getCodigo());
               stmt.execute();
               eliminar = true;
          } catch (SQLException e) {
               JOptionPane.showMessageDialog(null, e + "No se pudo eliminar lo que querias");
          } finally {
               ClsConexion.CloseConection(stmt);
               ClsConexion.CloseConection(conn);
          }

          return eliminar;
     }
     
     
     
}

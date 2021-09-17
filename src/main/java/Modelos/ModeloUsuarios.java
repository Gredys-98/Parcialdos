
package Modelos;

/**
 *
 * @author carrillo
 */
public class ModeloUsuarios {
     
     private int codigo;
     private String nombre;
     private String contraseña;

     @Override
     public String toString() {
          return "usuariosreg{" + "codigo=" + codigo + ", nombre=" + nombre + ", contraseña=" + contraseña+ '}';
     }

     public int getcodigo() {
          return codigo;
     }

     public void setcodigo(int codigo) {
          
          this.codigo = codigo;
     }

     public String getnombre() {
          return nombre;
     }

     public void setnombre(String nombre) {
          this.nombre = nombre;
     }

     public String getcontraseña() {
          return contraseña;
     }

     public void setcontraseña(String contraseña) {
          this.contraseña = contraseña;
     }
     
     
}

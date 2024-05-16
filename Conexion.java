package universidadgrupo6.accesoADatos;
import com.sun.jdi.connect.spi.*;
import java.util.logging.*;
import javax.swing.*;
/**
 *
 * @author elise
 */
public class Conexion {
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="universidadGrupo6";
    private static final String USUARIO="root";
    private static final String PASsWORD="";
    private static Connection connection;
    
    private Conexion(){}
    
    public static Connection getConexion(){
        
        if (connection == null){
            try {
                Class.forName("org.mariabd.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB, USUARIO,PASsWORD);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
            } 
        }
        return connection;
    }
}

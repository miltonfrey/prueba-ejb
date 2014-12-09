
package p1;

import java.util.List;
import javax.ejb.Local;

@Local
public interface ServicioInterface {
    
    public List<Usuario> listar();
    
}

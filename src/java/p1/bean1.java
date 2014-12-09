
package p1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;


@Named(value = "bean1")
@ViewScoped
public class bean1 implements Serializable{

    @EJB
    private ServicioInterface servicio;
    
    private List<Usuario> lista;
    
    public bean1() {
        
    }
    
    @PostConstruct
    public void init(){
        
        lista=servicio.listar();
    }

    public List<Usuario> getLista() {
        return lista;
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }
    
    
    
}

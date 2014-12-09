/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Named("daoImpl")
@RequestScoped
public class daoImpl extends dao implements Serializable{

    
@PersistenceContext(unitName = "pruebaEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    
    public daoImpl() {
        //super(Usuario.class);
        setClase(Usuario.class);
    }
    
   
    
  
   
   
   
}

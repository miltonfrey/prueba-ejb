/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;


@Stateless
public class Servicio implements ServicioInterface{

    @Inject
    private daoImpl daoImpl;
    
    
    
    @Override
    public List<Usuario> listar(){
       // ArrayList<String> lista;
        //lista=new ArrayList<String>();
        //lista.add("hola");
        //lista.add("adios");
        //return lista;
        
        return daoImpl.findAll();
        
        
    }
}

    
    


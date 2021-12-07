/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeans;

import Controladores.ExpedienteJpaController;
import Controladores.UsuariosJpaController;
import Entidades.Expediente;
import Entidades.Usuarios;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Armando
 */
@Named(value = "obtener")
@Dependent
public class Obtener {

    ExpedienteJpaController controlExpediente = new ExpedienteJpaController();
    UsuariosJpaController controlUsuarios =  new UsuariosJpaController();
    
    /**
     * Creates a new instance of Obtener
     */
    public Obtener() {
    }
    public List<Expediente>getCitas(){
        return controlExpediente.findExpedienteEntities();
    }
    public List<Usuarios>getMedicos(){
        return controlUsuarios.findUsuariosEntities();
    }
    
    
}

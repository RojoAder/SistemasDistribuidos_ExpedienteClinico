/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultoriopersistencia;

import Controladores.UsuariosJpaController;

/**
 *
 * @author Armando
 */
public class ConsultorioPersistencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsuariosJpaController usuariosC = new UsuariosJpaController();
        
        usuariosC.create(new Usuarios);
    }
    
}

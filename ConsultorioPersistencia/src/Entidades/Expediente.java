/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Armando
 */
@Entity
@Table(name = "expediente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Expediente.findAll", query = "SELECT e FROM Expediente e")
    , @NamedQuery(name = "Expediente.findByIdexpediente", query = "SELECT e FROM Expediente e WHERE e.idexpediente = :idexpediente")
    , @NamedQuery(name = "Expediente.findByIdusuario", query = "SELECT e FROM Expediente e WHERE e.idusuario = :idusuario")
    , @NamedQuery(name = "Expediente.findByExpedienteUsuario", query = "SELECT e FROM Expediente e WHERE e.expedienteUsuario = :expedienteUsuario")})
public class Expediente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idexpediente")
    private Integer idexpediente;
    @Basic(optional = false)
    @Column(name = "idusuario")
    private String idusuario;
    @Basic(optional = false)
    @Column(name = "expediente_usuario")
    private String expedienteUsuario;

    public Expediente() {
    }

    public Expediente(Integer idexpediente) {
        this.idexpediente = idexpediente;
    }

    public Expediente(Integer idexpediente, String idusuario, String expedienteUsuario) {
        this.idexpediente = idexpediente;
        this.idusuario = idusuario;
        this.expedienteUsuario = expedienteUsuario;
    }

    public Integer getIdexpediente() {
        return idexpediente;
    }

    public void setIdexpediente(Integer idexpediente) {
        this.idexpediente = idexpediente;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getExpedienteUsuario() {
        return expedienteUsuario;
    }

    public void setExpedienteUsuario(String expedienteUsuario) {
        this.expedienteUsuario = expedienteUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idexpediente != null ? idexpediente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Expediente)) {
            return false;
        }
        Expediente other = (Expediente) object;
        if ((this.idexpediente == null && other.idexpediente != null) || (this.idexpediente != null && !this.idexpediente.equals(other.idexpediente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "consultoriopersistencia.Expediente[ idexpediente=" + idexpediente + " ]";
    }
    
}

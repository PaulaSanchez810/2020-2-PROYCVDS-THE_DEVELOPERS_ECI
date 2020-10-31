package edu.eci.cvds.bean;

import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.service.ServicesHistorialEquiposProyectoFactory;
import edu.eci.cvds.service.ServicesUsuario;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.util.List;

@ManagedBean(name = "usuario")
@SessionScoped
@ApplicationScoped

public class UsuarioBean {
    private  ServicesUsuario servicesUsuario = ServicesHistorialEquiposProyectoFactory.getInstance().getServicesUsuario();
    private  String userName;

    public  List<Usuario> consultaUsurios(){
        return (List<Usuario>) servicesUsuario.consultarUsuarios();
    }
    public  Usuario consultarUsuario(String correo){
        return servicesUsuario.consultarUsuario(correo);
    }

    public Boolean login(String correo, String clave){return  servicesUsuario.login(correo,clave);}

    public void setServicesUsuario(String userName){
        try {
           this.userName =userName;
            FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath() + "/faces/index32.xhtml");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
